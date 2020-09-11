package com.zhuang.seata.storage.rpc;

import com.zhuang.seata.api.rpc.StorageProvider;
import com.zhuang.seata.storage.mapper.StorageMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jun
 * @date 2020/9/5
 */

@DubboService
public class StorageProviderImpl implements StorageProvider {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void deduct(long productId, int count) {
        storageMapper.updateStorage(productId, count);
    }
}
