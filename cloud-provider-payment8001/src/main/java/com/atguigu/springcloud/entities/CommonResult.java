package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/8 21:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }


    /**
     *
     * 因为之前写的时候，前端总是知道自己要的数据的结构是什么样子的
     * 但是后端给传的数据没有包装，也就不知道后端发送的是什么样子的数据。
     * 这会导致，前端写很多判断，导致可读性下降。
     *
     */


}
