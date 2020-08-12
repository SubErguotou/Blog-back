package com.erguotou.controller;

import com.erguotou.mapper.BlogMapper;
import com.erguotou.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogMapper blogMapper;

    @RequestMapping("/allblog")
    public Blog getBlogMapper() {
        return blogMapper.getBlog(1);
    }
}
