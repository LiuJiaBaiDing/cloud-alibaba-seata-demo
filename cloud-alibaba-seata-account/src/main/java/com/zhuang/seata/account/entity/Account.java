package com.zhuang.seata.account.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Jun
 * @date 2020/9/5
 */
@Data
@TableName("t_account")
public class Account {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long userId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
