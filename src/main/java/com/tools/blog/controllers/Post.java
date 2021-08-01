package com.tools.blog.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public class Post {


    /**
     * Get all posts
     * @return
     */
    @GetMapping("/posts")
    public Map<Integer, String> getAllPosts(){

        HashMap<Integer, String> map = new HashMap<>();
        return map;
    }
    
}
