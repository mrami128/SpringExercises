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
        createPosts();
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

    private void createPosts() {
        // create some fake  ad objects and add them to the ads list
        Post post = new Post("title", "another fake test post");
        Post post2 = new Post("title2", "another fake test post");
        Post post3 = new Post("title3", "another fake test post");
        Post post4 = new Post("title4", "another fake test post");

        // with the save method
        this.save(post);
        this.save(post2);
        this.save(post3);
        this.save(post4);

    }
}

