package com.example.designmodel.adapter;

/**
 * @author xiongda
 * @ClassName ILoginAdapter
 * @Description 适配模式-接口类
 * @createTime 2022/3/17 16:12
 */
public interface ILoginAdapter {

    boolean supports(Object object);

    R login(String id, Object adapter);

}
