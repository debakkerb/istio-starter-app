package org.bdb.istio.starter.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class User {
    private long id;
    private String username;
}
