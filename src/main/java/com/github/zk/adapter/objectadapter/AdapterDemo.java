package com.github.zk.adapter.objectadapter;

/**
 * 适配器示例
 * 采用220V交流电和12V直流电适配案例
 * @author zhaokai
 * @date 2021/5/22 23:48
 */
public class AdapterDemo {

    public static void main(String[] args) {
        Print print1 = new PrintBanner("220V");
        print1.printWeak();
        Print print2 = new PrintBanner("12V");
        print2.printStrong();
    }
}
