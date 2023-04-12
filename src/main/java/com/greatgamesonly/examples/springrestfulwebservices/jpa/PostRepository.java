package com.greatgamesonly.examples.springrestfulwebservices.jpa;

import com.greatgamesonly.examples.springrestfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
