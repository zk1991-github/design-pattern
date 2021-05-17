package com.github.zk.proxy.dynamic;

/**
 * {@link IEcho} 实现类
 * @Author zk
 * @Date 2019/5/27 22:34
 */
public class EchoImpl implements IEcho {
    @Override
    public String beProxyMethod(int i) {
        System.out.println("调用beProxyMethod(int)方法");
        return "beProxyMethod(int)方法返回【"+ i +"】";
    }
}
