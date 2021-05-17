package com.github.zk.proxy.dynamic;

/**
 * @Author zk
 * @Date 2019/5/27 22:33
 */
public interface IEcho {
    /**
     * 被代理方法
     * @param i
     * @return
     */
    String beProxyMethod(int i);
}
