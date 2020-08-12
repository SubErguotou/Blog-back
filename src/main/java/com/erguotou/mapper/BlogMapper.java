package com.erguotou.mapper;

import com.erguotou.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BlogMapper {
//    查询一篇博客、
    Blog getBlog(int id);
//    查询所有博客
}
