package com.codeup.controllers;

import com.codeup.models.Post;
//import com.codeup.svcs.AdSvc;
import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PostsController {

    private final PostSvc postDao;

    @Autowired
    public PostsController(PostSvc postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String viewAll(String name, Model model) {
// -----
//        List<Post> posts= postSvc.findAll();
// -----
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showPostForm() {
        return "view the form for creating the post";
    }


    @PostMapping("/posts/create")
    public String savePost() {
        return "create and saving a new post";
    }
}
