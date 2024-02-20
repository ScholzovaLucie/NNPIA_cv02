package org.example.nnpia_cv02.book;

import java.util.List;

public interface BookService{

    List<Book> getAllBooks();
    Book getBookById(int id);
}
