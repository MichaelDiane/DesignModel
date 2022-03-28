package com.example.designmodel.chain;

import lombok.Data;

/**
 * @author xiongda
 * @ClassName Member
 * @Description 会员登录Dto
 * @createTime 2022-03-28 14:25
 */

@Data
public class Member {

    private String name;

    private String pwd;

    private String role;

    public Member(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }

}
