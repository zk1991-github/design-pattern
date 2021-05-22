package com.github.zk.adapter.classadapter;

/**
 * 适配器
 * 谁的适配器就继承谁
 * @author zhaokai
 * @date 2021/5/22 20:58
 */
public class PrintBanner extends Banner implements Print  {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
