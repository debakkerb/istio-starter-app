package org.bdb.istio.starter.frontend.repository;

import org.bdb.istio.starter.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Value("${books.endpoint}")
    private String endpoint;

    private final RestTemplate restTemplate;

    @Autowired
    public BookRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<Book> getBooks() {
        ResponseEntity<Book[]> response = restTemplate.getForEntity(endpoint, Book[].class);
        return Arrays.asList(response.getBody());
    }
}
