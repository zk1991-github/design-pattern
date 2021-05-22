package com.github.zk.adapter.objectadapter;

/**
 * 被代理 220V交流电
 *
 * @author zhaokai
 * @date 2021/5/22 23:34
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
