package com.zhuang.seata.business.service;

/**
 * @author Jun
 * @date 2020/9/5
 */
public interface BusinessService {

    /**
     * 采购
     */
    void purchase(long userId, long productId, int orderCount);
}
