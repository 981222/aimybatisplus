package com.huang.aimybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class Test {
    @TableId(value = "id")
    private Integer num;
    @TableField(value = "name")
    private String title;
    private Integer age;
}
