package com.example.designmodel.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiongda
 * @ClassName R
 * @Description 返回结果对象
 * @createTime 2022/3/17 16:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {

    private int code;

    private String msg;

    private Object data;

}
