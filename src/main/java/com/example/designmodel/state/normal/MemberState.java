package com.example.designmodel.state.normal;

/**
 * @author xiongda
 * @ClassName MemberState
 * @Description 会员状态
 * @createTime 2022-04-01 11:17
 */
public abstract class MemberState {

    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public  abstract void  favorite();

    public abstract  void  comment(String comment);

}
