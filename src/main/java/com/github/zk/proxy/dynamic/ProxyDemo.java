package com.github.zk.proxy.dynamic;

/**
 * 代理模式示例
 * @Author zk
 * @Date 2019/5/27 22:59
 */
public class ProxyDemo {
    public static void main(String[] args) {
        IEcho demo = (IEcho) new ProxyClass().getProxy(EchoImpl.class);
        demo.beProxyMethod(1);

    }
}
