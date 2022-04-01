package com.example.designmodel.state.normal;

/**
 * @author xiongda
 * @ClassName UnLoginState
 * @Description 未登陆用户状态
 * @createTime 2022-04-01 11:19
 */
public class UnLoginState extends MemberState {

    @Override
    public void favorite() {
        this.switchState();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switchState();
        this.context.getState().comment(comment);
    }

    private  void  switchState() {
        System.out.println("跳转到登陆页面!");
        this.context.setState(AppContext.STATE_LOGIN);
    }

}
