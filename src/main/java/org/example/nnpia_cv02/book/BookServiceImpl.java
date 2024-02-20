package org.example.nnpia_cv02.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookServiceImpl implements BookService{
    private final Map<Integer, Book> bookMap = new HashMap<>();

    public BookServiceImpl() {
        // Přidání několika knih do mapy
        bookMap.put(1, new Book(1, "Válka světů", "H.G. Wells", 1898));
        bookMap.put(2, new Book(2, "1984", "George Orwell", 1949));
        bookMap.put(3, new Book(3, "Malý princ", "Antoine de Saint-Exupéry", 1943));
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book getBookById(int id) {
        return bookMap.get(id);
    }
}
