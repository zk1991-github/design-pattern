package com.github.zk.template.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的创建者
 *
 * @author zk
 * @date 2021/5/26 10:44
 */
public class IdCardFactory extends Factory {
    private final List<String> cards = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        System.out.println("制作【" + owner + "】的卡");
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        cards.add(((IdCard) product).getOwner());
    }

    public List<String> getCards() {
        return cards;
    }
}
