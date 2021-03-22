package org.bdb.istio.starter.books.repository;

import org.bdb.istio.starter.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BooksRepositoryCache implements BooksRepository {

    @Override
    public List<Book> getBooks() {
        return generateBooks();
    }

    private List<Book> generateBooks() {
        return Arrays.asList(
                new Book(1, "Stephen King", "It", 1200),
                new Book(2, "Stephen King", "The Institute", 440),
                new Book(3, "Adam Tooze", "Wages of Destruction", 560),
                new Book(4, "Tana French", "In the Woods", 592)
        );
    }

}
