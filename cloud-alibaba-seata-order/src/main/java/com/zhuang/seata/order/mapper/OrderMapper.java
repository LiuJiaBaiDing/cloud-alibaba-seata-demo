package com.zhuang.seata.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuang.seata.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Jun
 * @date 2020/9/5
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
