package com.zhuang.seata.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuang.seata.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jun
 * @date 2020/9/5
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    void updateStorage(@Param("productId") long productId, @Param("count")int count);

}
