package com.github.zk.proxy.dynamic;

/**
 * @Author zk
 * @Date 2019/5/27 22:34
 */
public class DemoImpl implements IDemo {
    @Override
    public String methodOne(int i) {
        System.out.println("调用methodOne()");
        return "methodOne方法返回【"+ i +"】";
    }
}
