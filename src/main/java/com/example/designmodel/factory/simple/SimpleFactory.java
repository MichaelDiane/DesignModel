package com.example.designmodel.factory.simple;

import cn.hutool.core.bean.BeanUtil;

/**
 * @author xiongda
 * @ClassName SimpleFactory.java
 * @Description TODO
 * @createTime 2022年02月17日
 */
public class SimpleFactory {
    public static IBooK bookName(Class<? extends IBooK> clazz) {
        try{
            if(BeanUtil.isNotEmpty(clazz)){
                return clazz.newInstance();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
