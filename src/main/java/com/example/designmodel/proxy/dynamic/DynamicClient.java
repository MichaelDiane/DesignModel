package com.example.designmodel.proxy.dynamic;

/**
 * @author xiongda
 * @ClassName DynamicClient
 * @Description TODO
 * @createTime 2022/3/10 11:12
 * jdk动态代理与cglib动态代理对比:
     *1.jdk采用读取接口的信息,cglib是覆盖父类方法  两者目的都是 生成一个新的类,去实现增强逻辑代码的功能
     *2.jdk proxy 对于用户而言,必须要有一个接口实现,目标类相对来说复杂;而 cglib 可以代理任意一个皮同类,没有任何的要求
     *3.jdk 生成代理逻辑简单,执行效率要不cglib低,每次均需要反射动态调用;而cglib动态代理得生成逻辑更复杂,调用效率更高.生了一个包含了所有逻辑的FastClass,不再需要反射调用
     *
 */
public class DynamicClient {
    public static void main(String[] args) {
        //jdk 动态代理
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson xiongda = jdkMeiPo.getInstance(new XiongDaProxy());
        xiongda.findLove();

        //cglib 动态代理
        try {
            Customer customer = (Customer) new CGlibMeiPo().getInstance(Customer.class);
            customer.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
