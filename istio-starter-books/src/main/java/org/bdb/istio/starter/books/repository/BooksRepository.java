package org.bdb.istio.starter.books.repository;

import org.bdb.istio.starter.books.domain.Book;

import java.util.List;

public interface BooksRepository {

    List<Book> getBooks();

}
