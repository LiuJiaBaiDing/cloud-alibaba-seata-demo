package com.zhuang.seata.order.rpc;

import com.zhuang.seata.api.rpc.AccountProvider;
import com.zhuang.seata.api.rpc.OrderProvider;
import com.zhuang.seata.order.entity.Order;
import com.zhuang.seata.order.mapper.OrderMapper;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author Jun
 * @date 2020/9/5
 */
@DubboService
public class OrderProviderImpl implements OrderProvider {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private OrderMapper orderMapper;
    @DubboReference
    private AccountProvider accountProvider;

    @Override
    public void create(long userId, long productId, int count) {
        int orderMoney = count * 10;
        logger.info("-----------订单服务开始执行扣款-----------");
        accountProvider.debit(userId,orderMoney);

        // int i = 10/0;

        Order order = new Order();
        order.setProductId(productId);
        order.setCount(count);
        order.setUserId(userId);
        order.setMoney(new BigDecimal(orderMoney));
        order.setStatus(1);
        logger.info("-----------订单服务开始创建订单-----------");
        orderMapper.insert(order);
    }
}
