package com.github.zk.template.factory;

/**
 * 具体产品
 *
 * @author zk
 * @date 2021/5/26 10:43
 */
public class IdCard implements Product {
    private String owner;
    public IdCard(String owner) {
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用【" + owner + "】的卡");
    }

    public String getOwner() {
        return owner;
    }
}
