package com.example.designmodel.chain;

/**
 * @author xiongda
 * @ClassName MemberService
 * @Description member处理service
 * @createTime 2022-03-28 14:43
 */
public class MemberService {
    public void login(String username, String password){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.nextHandler(loginHandler);
        loginHandler.nextHandler(authHandler);
        validateHandler.doHandle(new Member(username, password));
    }
}
