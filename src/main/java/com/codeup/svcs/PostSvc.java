package com.codeup.svcs;

import com.codeup.models.Post;
import com.codeup.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("PostSvc")
public class PostSvc {

    private final PostsRepository postsRepository;
    @Autowired
    public PostSvc(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    List<Post> posts = new ArrayList<>();


    public List<Post> findAll() {
        return posts;
    }

    public Post findOne(long id) {
        return posts.get((int) (id - 1));
    }

    public Post save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }



}

