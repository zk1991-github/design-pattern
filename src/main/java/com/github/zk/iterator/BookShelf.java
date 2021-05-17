package com.github.zk.iterator;

/**
 * 具体的集合
 *
 * @author zk
 * @date 2021/5/15 14:39
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int getBookLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
