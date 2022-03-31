package com.example.designmodel.iterator;

/**
 * @author xiongda
 * @ClassName CourseAggregate
 * @Description TODO
 * @createTime 2022-03-31 9:29
 */
public interface CourseAggregate {
    void add(Course course);

    void  remove(Course course);

    Iterator<Course> iterator();

}
