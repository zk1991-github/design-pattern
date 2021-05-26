package com.github.zk.template.factory;

import java.util.List;

/**
 * 工厂模板模式 示例
 * 采用创建身份证示例，根据不同实现可以实现制作不同物品，基础模板方法不用修改（Factory、Product）
 * @author zk
 * @date 2021/5/26 10:48
 */
public class FactoryTemplateDemo {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product product1 = factory.create("张三");
        Product product2 = factory.create("李四");
        Product product3 = factory.create("王五");
        System.out.println("---------------");
        product1.use();
        product2.use();
        product3.use();
        System.out.println("---------------");
        System.out.println("已注册人员名单：");
        List<String> cards = ((IdCardFactory) factory).getCards();
        System.out.println(cards.toString());
    }
}
