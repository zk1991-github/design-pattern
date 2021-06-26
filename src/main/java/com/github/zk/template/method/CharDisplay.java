package com.github.zk.template.method;

/**
 * 具体类
 *
 * @author zk
 * @date 2021/6/8 9:23
 */
public class CharDisplay extends AbstractDisplay {

    private final char aChar;
    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
