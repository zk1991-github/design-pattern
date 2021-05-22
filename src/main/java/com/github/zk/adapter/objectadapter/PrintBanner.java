package com.github.zk.adapter.objectadapter;

/**
 * 适配器
 * 谁的适配器就继承谁
 * @author zhaokai
 * @date 2021/5/22 23:44
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    protected void printWeak() {
        banner.showWithParen();
    }

    @Override
    protected void printStrong() {
        banner.showWithAster();
    }
}
