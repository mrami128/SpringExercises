package com.codeup.svcs;

import com.codeup.models.Post;
import com.codeup.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("PostSvc")
public class PostSvc {
    // y is post svc -x is repository -step5 in repos exercise:
    //steps: 1.map model--
    // 2.create repository-
    // 3. use repositroy within a service;this is prefered--versus using direct on controller

    private final PostsRepository postsRepos;

    List<Post> posts = new ArrayList<>();

    @Autowired
    public PostSvc(PostsRepository postsRepos) {
        this.postsRepos = postsRepos;
    }

    public Iterable<Post> findAll() {
        return postsRepos.findAll(); // select *from posts
    }

    public Post findOne(long id) {
        return postsRepos.findOne(id);
    }

    public Post save(Post post) {
        postsRepos.save(post); 
        return post;
    }

    public Post updatePost(Post post) {
        postsRepos.save(post);
        return post;
    }

//    public void deletePost(long id){
//    postsRepos.delete(id);
//    }

} // end

