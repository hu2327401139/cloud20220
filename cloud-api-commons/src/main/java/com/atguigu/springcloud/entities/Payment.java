package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/8 13:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * ID
     */
    private Long id;    // 使用 Long 是因为在数据库中的类型是 bigint

    private String serial;

}
