package com.zhuang.seata.api.rpc;

/**
 * @author Jun
 * @date 2020/9/5
 */
public interface AccountProvider {

    /**
     * 从用户账户中扣款
     * @param userId 用户ID
     * @param money 消费金额
     */
    void debit(long userId, int money);
}
