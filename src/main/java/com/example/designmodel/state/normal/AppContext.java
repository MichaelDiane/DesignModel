package com.example.designmodel.state.normal;

/**
 * @author xiongda
 * @ClassName AppContext
 * @Description 环境转换类
 * @createTime 2022-04-01 11:24
 */
public class AppContext {

    public  static  final MemberState STATE_LOGIN = new LoginState();

    public  static final MemberState STATE_UN_LOGIN = new UnLoginState();

    private MemberState currentState= STATE_UN_LOGIN;

    {
        STATE_LOGIN.setContext(this);
        STATE_UN_LOGIN.setContext(this);
    }

    public void setState(MemberState state){
        this.currentState=state;
        this.currentState.setContext(this);
    }

    public MemberState getState(){
        return  this.currentState;
    }

    public  void  favorite(){
        this.currentState.favorite();
    }

    public  void  comment(String comment){
        this.currentState.comment(comment);
    }
}
