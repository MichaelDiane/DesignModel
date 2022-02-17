package com.example.designmodel.factory.simple;

import cn.hutool.core.util.StrUtil;

/**
 * @author xiongda
 * @ClassName SimpleFactory.java
 * @Description TODO
 * @createTime 2022年02月17日
 */
public class SimpleFactory {
    public static IBooK bookName(String className) {
        try{
            if(StrUtil.isNotEmpty(className)){
                return (IBooK) Class.forName(className).newInstance();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
