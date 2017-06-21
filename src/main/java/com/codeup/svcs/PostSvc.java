package com.codeup.svcs;

import com.codeup.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("PostSvc")
public class PostSvc {

    List<Post> posts = new ArrayList<>();
                           // this is constructor -notice it has same name as class PostSVC
    public PostSvc() {
//        createPosts();
    }

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

