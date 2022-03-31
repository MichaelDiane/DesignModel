package com.example.designmodel.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongda
 * @ClassName CourseAggregateImpl
 * @Description 课程集合实现类
 * @createTime 2022-03-31 9:36
 */
public class CourseAggregateImpl implements CourseAggregate  {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<Course>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
       return  new IteratorImpl<Course>(courseList);
    }

}
