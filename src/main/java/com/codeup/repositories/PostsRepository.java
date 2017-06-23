package com.codeup.repositories;


import com.codeup.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Post, Long> {
}
            //this <Post, Long> is generic it control what comes in
//  so not just anything can come in --we want -'post'-and primary key of the post
// is long . it must match model post class identify type of long in this case
