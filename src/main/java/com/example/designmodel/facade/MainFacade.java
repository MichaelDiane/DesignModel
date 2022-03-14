package com.example.designmodel.facade;

/**
 * @author xiongda
 * @ClassName MainFacade
 * @Description 门面模式测试main
 * @createTime 2022/3/14 9:59
 */
public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
