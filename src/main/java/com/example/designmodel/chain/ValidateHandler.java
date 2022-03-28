package com.example.designmodel.chain;

import cn.hutool.core.util.StrUtil;

/**
 * @author xiongda
 * @ClassName ValidateHandler
 * @Description 验证用户信息处理handler
 * @createTime 2022-03-28 14:32
 */
public class ValidateHandler extends Handler{

    @Override
    public void doHandle(Member member) {
        if(StrUtil.isEmpty(member.getName()) || StrUtil.isEmpty(member.getPwd())){
            System.out.println("用户名或密码错误");
            return;
        }
        System.out.println("验证通过,向下执行");
        handler.doHandle(member);
    }

}
