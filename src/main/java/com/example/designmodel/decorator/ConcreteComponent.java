package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName ConcreteComponent
 * @Description 具体组件
 * @createTime 2022/3/14 11:17
 */
public  class ConcreteComponent extends Component {

    /**
     * 操作方法
     */
    @Override
    public void operation() {
        System.out.println("处理业务逻辑!");
    }

}
