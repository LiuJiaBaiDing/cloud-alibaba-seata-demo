package com.zhuang.seata.api.rpc;

/**
 * @author Jun
 * @date 2020/9/5
 */
public interface StorageProvider {

    /**
     * 扣除商品的存储数量
     * @param productId 产品ID
     * @param count 数量
     */
    void deduct(long productId, int count);
}
