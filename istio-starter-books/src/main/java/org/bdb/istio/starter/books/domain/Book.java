package org.bdb.istio.starter.books.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class Book {

    private int id;
    private String author;
    private String title;
    private int pages;

}
