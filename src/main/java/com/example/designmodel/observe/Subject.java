package com.example.designmodel.observe;

/**
 * @author michael
 * @title: Subject
 * @projectName DesignModel
 * @description: 主题接口
 * @date 2020/10/16 15:10
 */
public interface Subject {
    public  void  registerObserver(Observe observe);
    public  void  removeObserver(Observe observe);
    public  void  notifyObserver();

}
