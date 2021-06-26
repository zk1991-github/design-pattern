package com.github.zk.template.method;

/**
 * 模板方法示例
 *
 * @author zk
 * @date 2021/6/8 10:35
 */
public class TemplateMethodDemo {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        charDisplay.display();
        AbstractDisplay stringDispaly = new StringDispaly("Hello World");
        stringDispaly.display();
    }
}
