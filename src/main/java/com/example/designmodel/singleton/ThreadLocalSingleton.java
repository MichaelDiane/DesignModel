package com.example.designmodel.singleton;

/**
 * @author xiongda
 * @ClassName ThreadLocalSingleton
 * @Description ThreadLocalSingleton 线程单列实现 ThreadLocal,ThreadLocal不能保证其创建的对象是全局的,但是能保证在单个线程中是唯一的,是线程安全的.
 * @createTime 2022/3/4 16:14
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){};
    
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println("===================================end===========>");
    }
}
