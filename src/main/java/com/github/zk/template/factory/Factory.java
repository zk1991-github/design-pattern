package com.github.zk.template.factory;

/**
 * 创建者
 *
 * @author zk
 * @date 2021/5/26 8:59
 */
public abstract class Factory {

    public Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
