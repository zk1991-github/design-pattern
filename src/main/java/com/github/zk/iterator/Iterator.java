package com.github.zk.iterator;

/**
 * 迭代器
 *
 * @author zk
 * @date 2021/5/15 14:36
 */
public interface Iterator {
    /**
     * 是否存在下一条数据
     * @return
     */
    boolean hasNext();

    /**
     * 下一条数据
     * @return
     */
    Object next();
}
