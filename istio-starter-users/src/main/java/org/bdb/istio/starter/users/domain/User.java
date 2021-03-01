package org.bdb.istio.starter.users.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private long id;
    private String username;
    private String firstName;
    private String lastName;

}
