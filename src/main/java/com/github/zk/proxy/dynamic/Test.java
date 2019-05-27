package com.github.zk.proxy.dynamic;

/**
 * @Author zk
 * @Date 2019/5/27 22:59
 */
public class Test {
    public static void main(String[] args) {
        IDemo demo = (IDemo) new ProxyClass().getProxy(DemoImpl.class);
        demo.methodOne(1);

    }
}
