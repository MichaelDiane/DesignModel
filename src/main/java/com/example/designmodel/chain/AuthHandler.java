package com.example.designmodel.chain;

/**
 * @author xiongda
 * @ClassName AuthHandler
 * @Description 权限处理hander
 * @createTime 2022-03-28 14:40
 */
public class AuthHandler  extends Handler{
    @Override
    public void doHandle(Member member) {
        if(!"管理员".equals(member.getRole())){
            System.out.println("不是管理员,无权限操作!!");
        }
        System.out.println("管理员,允许操作!!");
    }
}
