package com.github.zk.iterator;

/**
 * Iterator模式 示例
 * 示例采用向书架上放书，再从书架遍历所有书，取出书名
 * @author zk
 * @date 2021/5/15 16:28
 */
public class IteratorDemo {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("三国演义"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("红楼梦"));
        bookShelf.appendBook(new Book("西游记"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("书名：《" + book.getName() + "》");
        }
    }
}
