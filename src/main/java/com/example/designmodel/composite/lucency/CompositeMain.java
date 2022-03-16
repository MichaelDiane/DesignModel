package com.example.designmodel.composite.lucency;

/**
 * @author xiongda
 * @ClassName CompositeMain
 * @Description TODO
 * @createTime 2022/3/16 13:28
 */
public class CompositeMain {

    public static void main(String[] args) {

        //根节点
        Component root = new Composite("root");

        //枝节点
        Component branchA = new Composite("branchA");
        Component branchB = new Composite("branchB");

        //叶子节点
        Component leafA = new Composite("--leafA");
        Component leafB = new Composite("--leafB");
        Component leafC = new Composite("--leafC");

        root.addChild(branchA);
        root.addChild(leafC);

        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafC);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);

    }
}
