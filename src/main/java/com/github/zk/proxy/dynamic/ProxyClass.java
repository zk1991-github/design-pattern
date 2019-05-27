package com.github.zk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zk
 * @Date 2019/5/27 22:36
 */
public class ProxyClass {
    public Object getProxy(final Object obj) {
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before");
                Object result = method.invoke(obj,args);
                System.out.println("after");
                return result;
            }
        });
        return o;
    }
}
