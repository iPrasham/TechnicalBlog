package techblog.services;

import org.springframework.stereotype.Service;
import techblog.models.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
        Post p1 = new Post("Post 1", "This is the body of Post 1", new Date());
        Post p2 = new Post("Post 2", "This is the body of Post 2", new Date());
        Post p3 = new Post("Post 3", "This is the body of Post 3", new Date());
        Post p4 = new Post("Post 1", "This is the body of Post 1 by Prasham", new Date());
        Post p5 = new Post("Post 2", "This is the body of Post 2 by Prasham", new Date());
        Post p6 = new Post("Post 3", "This is the body of Post 3 by Prasham", new Date());
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        posts.add(p4);
        posts.add(p5);
        posts.add(p6);
        return posts;
    }

    public ArrayList<Post> getUserPosts() {
        Post p1 = new Post("Post 1", "This is the body of Post 1 by Prasham", new Date());
        Post p2 = new Post("Post 2", "This is the body of Post 2 by Prasham", new Date());
        Post p3 = new Post("Post 3", "This is the body of Post 3 by Prasham", new Date());
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        return posts;
    }
}
