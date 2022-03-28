package com.example.designmodel.template;

/**
 * @author xiongda
 * @ClassName TemplateMain
 * @Description 模板模型测试类
 * 优点:
 * 1.将相同逻辑抽取到父类中,提供代码复用
 * 2.将不同逻辑分离到子模块,通过对子类的扩展增减新的行为,提高代码的可扩展性
 * 3.将不变的写在父类上,去除子类的重复代码
 * 缺点:
 * 1.每个抽象类都需要一个子类实现,导致类数量增加,类数量的增加,间接的增加了系统的复杂度
 * 2.因为继承当父类变更接口,所有子类都需要更改一遍
 * 适用场景:
 * 1.一次性实现算法不变的部分,并将可变的行为留给子类实现
 * 2.各子类公告的行为提取,避免代码重复
 * @createTime 2022-03-24 11:11
 */
public class TemplateMain {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreateClassA();
        template.templateMethod();
        template = new ConcreateClassB();
        template.templateMethod();
    }
}
