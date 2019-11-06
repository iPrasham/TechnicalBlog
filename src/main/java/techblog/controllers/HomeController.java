package techblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import techblog.models.Post;
import techblog.services.PostService;

import java.util.ArrayList;


@Controller
public class HomeController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("all_posts", posts);
        return "index";
    }
}
