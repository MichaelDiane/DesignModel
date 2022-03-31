package com.example.designmodel.iterator;

/**
 * @author xiongda
 * @ClassName IteratorMain
 * @Description 迭代器模式-测试类
 * @createTime 2022-03-31 9:40
 */
public class IteratorMain {

    public static void main(String[] args) {

        Course course = new Course("Java 架构");
        Course javaBase =  new Course("Java 基础");
        Course design =  new Course("设计模式");
        Course ai =  new Course("AI 人工智能");

        CourseAggregate catalogAggregate = new CourseAggregateImpl();
        catalogAggregate.add(course);
        catalogAggregate.add(javaBase);
        catalogAggregate.add(design);
        catalogAggregate.add(ai);

        System.out.println("---------------课程列表------------------");
        Iterator<Course> iterator = catalogAggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println("["+iterator.next().getName()+"]");
        }

    }

}
