package com.example.designmodel.chain;

/**
 * @author xiongda
 * @ClassName ChainMain
 * @Description 责任链Main
 * 适用场景:
 *      1.多个对象可以处理同一请求,但是具体由哪个处理则在运行时动态决定
 *      2.在不明确指定接收者的状态下,向多个对象中的一个提交请求
 *      3.可动态指定一组对象处理请求
 * 优点:
 *      1.请求与处理解耦
 *      2.请求处理者只关注自己负责的事务进处理,其他直接转发个下一个节点处理
 *      3.具备链式传递处理请求功能,请求发送者不需要知晓链路结构,只需等待请求处理结果即可
 *      4.链路结构灵活,可以通过改变链路结构动态的新增或者删减责任
 *      5.易于扩展新的请求处理
 * 缺点:
 *      1.链太长或者处理时间过长,会影响整体性能
 *      2.若链结构存在循环应用,会造成死循环.导致系统奔溃
 * @createTime 2022-03-28 14:45
 */
public class ChainMain {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("xiongda","123456");
    }
}
