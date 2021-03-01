package org.bdb.istio.starter.users.repository;

import org.bdb.istio.starter.users.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryCache implements UserRepository {

    @Override
    public User getUser(long id) {
        return null;
    }

}
