package org.bdb.istio.starter.frontend.repository;

import org.bdb.istio.starter.frontend.domain.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();

}
