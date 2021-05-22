package com.github.zk.adapter.objectadapter;

/**
 * 目标 12V直流电
 *
 * @author zhaokai
 * @date 2021/5/22 23:32
 */
public abstract class Print {

    /**
     * 降压
     */
    protected abstract void printWeak();

    /**
     * 升压
     */
    protected abstract void printStrong();

}
