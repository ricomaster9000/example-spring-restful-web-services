package com.greatgamesonly.examples.springrestfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatgamesonly.examples.springrestfulwebservices.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
