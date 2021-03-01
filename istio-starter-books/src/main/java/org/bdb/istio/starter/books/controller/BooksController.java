package org.bdb.istio.starter.books.controller;

import org.bdb.istio.starter.books.domain.Book;
import org.bdb.istio.starter.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    private final BooksRepository repository;

    @Autowired
    BooksController(BooksRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    List<Book> getBooks(Model model) {
        return repository.getBooks();
    }
}
