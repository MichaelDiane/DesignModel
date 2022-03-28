package com.example.designmodel.template;

/**
 * @author xiongda
 * @ClassName ConcreateClassA
 * @Description 具体实现类B
 * @createTime 2022-03-24 11:08
 */
public class ConcreateClassB extends  AbstractTemplate{

    @Override
    protected void start(){
        System.out.println("ConcreateClassB:step");
    }

}
