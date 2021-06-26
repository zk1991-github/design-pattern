package com.github.zk.template.method;

import java.nio.charset.StandardCharsets;

/**
 * 具体类
 *
 * @author zk
 * @date 2021/6/8 9:24
 */
public class StringDispaly extends AbstractDisplay {
    private final String s;
    private final int width;
    public StringDispaly(String s) {
        this.s = s;
        this.width = s.getBytes(StandardCharsets.UTF_8).length;
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
