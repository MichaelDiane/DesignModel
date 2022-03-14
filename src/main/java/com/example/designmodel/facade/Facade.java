package com.example.designmodel.facade;

/**
 * @author xiongda
 * @ClassName Facade 门面
 * @Description 结构型模式-门面模式
 * @createTime 2022/3/11 17:36
 */
public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public  void doA(){
        this.subSystemA = new SubSystemA();
        subSystemA.doA();
    }

    public  void doB(){
        this.subSystemB = new SubSystemB();
        subSystemB.doB();
    }

    public  void doC(){
        this.subSystemC = new SubSystemC();
        subSystemC.doC();
    }

}
