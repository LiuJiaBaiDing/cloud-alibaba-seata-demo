package com.zhuang.seata.api.rpc;

/**
 * @author Jun
 * @date 2020/9/5
 */
public interface OrderProvider {

    /**
     * 创建订单
     * @param userId 用户ID
     * @param productId 产品ID
     * @param count 产品数量
     */
    void create(long userId, long productId, int count);
}
