package com.github.zk.iterator;

/**
 * 具体产品
 *
 * @author zk
 * @date 2021/5/15 14:38
 */
public class Book {
    /**
     * 书名
     */
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
