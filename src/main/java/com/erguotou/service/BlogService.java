package com.erguotou.service;

import com.erguotou.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    final
    BlogMapper blogMapper;
    @Autowired
    public BlogService(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }
}
