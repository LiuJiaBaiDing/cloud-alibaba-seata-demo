package com.zhuang.seata.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuang.seata.account.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jun
 * @date 2020/9/5
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    void updateAccount(@Param("userId") long userId, @Param("money")int money);
}
