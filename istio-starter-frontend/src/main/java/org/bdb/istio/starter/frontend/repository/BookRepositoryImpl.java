package org.bdb.istio.starter.frontend.repository;

import org.bdb.istio.starter.frontend.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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
        HttpEntity httpEntity = new HttpEntity(null);

        ResponseEntity<Book[]> response = restTemplate.exchange(endpoint, HttpMethod.GET, httpEntity, Book[].class);
        return Arrays.asList(response.getBody());
    }
}
