package com.codeup.controllers;

import com.codeup.models.Post;
import com.codeup.repositories.UsersRepository;
import com.codeup.svcs.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@Controller
public class PostsController {

    private final PostSvc postDao;
    private final UsersRepository userDao;


    @Autowired
    public PostsController(PostSvc postDao, UsersRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;  }


    @GetMapping("/posts")
    public String viewAll(Model model) {
        Iterable<Post> posts= postDao.findAll();    //maybe postDao should be change : postSvc?
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showPostForm(Model model) {
    model.addAttribute("post", new Post());
            return "posts/create";
    }

    @PostMapping("/posts/create")
      public String savePost(
        //---
            @RequestParam

        //---
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
    public String editPost( @ModelAttribute Post post ) {

         postDao.updatePost(post);   //createdin post svc
         return "redirect:/posts/"+post.getId();
          }

    @PostMapping("/post/delete")
    public String deletePost(@ModelAttribute Post post, Model model){
        postDao.deletePost(post.getId());
        model.addAttribute("msg", "Your post was deleted correctly");
        return "return the view with a success message";
    }
} //end PostsControllers class
