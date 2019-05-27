package com.github.zk.proxy.dynamic;

/**
 * @Author zk
 * @Date 2019/5/27 22:59
 */
public class Test {
    public static void main(String[] args) {
        DemoImpl demoImpl = new DemoImpl();
        IDemo demo = (IDemo) new ProxyClass().getProxy(demoImpl);
        demo.methodOne(1);

    }
}
