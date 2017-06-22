package com.codeup.controllers;

import com.codeup.models.Post;
import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@Controller
public class PostsController {

    private final PostSvc postDao;

    @Autowired
    public PostsController(PostSvc postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String viewAll(Model model) {
        List<Post> posts= postDao.findAll();
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    //------------

    @GetMapping("/posts/create")
    public String showPostForm(Model model) {
    model.addAttribute("post", new Post());
            return "posts/create";
    }

    @PostMapping("/posts/create")
      public String savePost(
        @ModelAttribute Post post){
        postDao.save(post);
        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable long id, Model model) {
         // TODO: Find this post in the data source using the service
                  Post post = postDao.findOne(id);
         // TODO: Pass the post found to the view
                  model.addAttribute("post", post );
                return "posts/edit";
           }

    @PostMapping("/posts/{id}/edit")
    public String editPost(
            @RequestParam (name="title") String title,
            @RequestParam (name="body") String body,
            @PathVariable long id)
    {
        postDao.findOne(id);// select * from posts where id = ?
        return "redirect:/posts";
    }

} //end
