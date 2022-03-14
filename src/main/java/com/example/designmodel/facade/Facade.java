package com.example.designmodel.facade;

/**
 * @author xiongda
 * @ClassName Facade 门面
 * @Description 结构型模式-门面模式
 *  优点: 简化调用过程,减少系统依赖,松散耦合,遵循米特法则
 *  缺点: 增加子系统和扩展时容易带来未知风险,不符合开闭原则,某些情况下违背单一职责原则
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
