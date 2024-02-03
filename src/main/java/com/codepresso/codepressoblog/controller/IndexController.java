package com.codepresso.codepressoblog.controller;


import com.codepresso.codepressoblog.service.PostService;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    private PostService postServie;

    public IndexController(PostService postServie) {
        this.postServie = postServie;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> postList = postServie.getAllPost();
        model.addAttribute("posts", postList);
        return "index";
    }
}
