package com.zhuang.seata.business.service.impl;

import com.zhuang.seata.api.rpc.OrderProvider;
import com.zhuang.seata.api.rpc.StorageProvider;
import com.zhuang.seata.business.service.BusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Jun
 * @date 2020/9/5
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @DubboReference
    private StorageProvider storageProvider;
    @DubboReference
    private OrderProvider orderProvider;

    @GlobalTransactional
    @Override
    public void purchase(long userId, long productId, int orderCount) {
        storageProvider.deduct(productId,orderCount);
        orderProvider.create(userId, productId, orderCount);
    }
}
