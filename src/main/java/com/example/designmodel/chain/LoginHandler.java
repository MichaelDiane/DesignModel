package com.example.designmodel.chain;

/**
 * @author xiongda
 * @ClassName LoginHandler
 * @Description 验证用户登录信息handler
 * @createTime 2022-03-28 14:32
 */
public class LoginHandler extends Handler{

    @Override
    public void doHandle(Member member) {
        System.out.println("验证通过,登录成功");
        member.setRole("管理员");
        handler.doHandle(member);
    }

}
