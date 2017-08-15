package com.infra.repository;

import org.springframework.data.repository.CrudRepository;

import com.infra.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
