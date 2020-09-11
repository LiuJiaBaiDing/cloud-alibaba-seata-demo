package com.zhuang.seata.account.rpc;

import com.zhuang.seata.account.mapper.AccountMapper;
import com.zhuang.seata.api.rpc.AccountProvider;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jun
 * @date 2020/9/5
 */
@DubboService
public class AccountProviderImpl implements AccountProvider {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void debit(long userId, int money) {
        accountMapper.updateAccount(userId, money);
    }
}
