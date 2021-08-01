package com.tools.blog.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlShortener {

    /**
     * Return shortened json url
     * @param url
     * @return
     */ 
    @GetMapping("/shorten")
    public Map<String, String> shortenUrl(@RequestParam String url){
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);
        return map;

    }
    
}
