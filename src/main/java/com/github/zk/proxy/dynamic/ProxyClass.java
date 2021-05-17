package com.github.zk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 * @Author zk
 * @Date 2019/5/27 22:36
 */
public class ProxyClass {
    public Object getProxy(final Class clazz) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before");
                Object result = method.invoke(clazz.newInstance(),args);
                System.out.println("after");
                return result;
            }
        });
    }
}
