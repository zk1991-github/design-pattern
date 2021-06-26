package com.github.zk.template.method;

/**
 * 抽象类
 *
 * @author zk
 * @date 2021/6/8 9:21
 */
public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
