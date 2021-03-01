package org.bdb.istio.starter.users.repository;

import org.bdb.istio.starter.users.domain.User;

public interface UserRepository {

    User getUser(long id);
}
