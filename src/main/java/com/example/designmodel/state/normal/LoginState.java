package com.example.designmodel.state.normal;

/**
 * @author xiongda
 * @ClassName LoginState
 * @Description 登陆会员状态
 * @createTime 2022-04-01 11:21
 */
public class LoginState  extends MemberState {

    @Override
    public void favorite() {
        System.out.println("收藏成功!");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }

}
