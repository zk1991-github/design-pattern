package com.github.zk.adapter.classadapter;

/**
 * 目标 12V直流电
 *
 * @author zhaokai
 * @date 2021/5/22 20:33
 */
public interface Print {
    /**
     * 降压
     */
    void printWeak();

    /**
     * 升压
     */
    void printStrong();
}
