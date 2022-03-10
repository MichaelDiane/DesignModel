package com.example.designmodel.proxy.dynamic;

/**
 * @author xiongda
 * @ClassName DynamicClient
 * @Description TODO
 * @createTime 2022/3/10 11:12
 */
public class DynamicClient {
    public static void main(String[] args) {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson xiongda = jdkMeiPo.getInstance(new XiongDaProxy());
        xiongda.findLove();
    }
}
