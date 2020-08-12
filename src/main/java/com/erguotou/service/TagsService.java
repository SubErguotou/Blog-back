package com.erguotou.service;

import com.erguotou.mapper.TagsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsService {
    @Autowired
    TagsMapper tagsMapper;

//    查询标签数量
    public int getTagsNumber(String Tag){
        return tagsMapper.getTagsNubmer(Tag);
    }
//    增加标签
    public void addTags(String Tag){
        tagsMapper.addTags(Tag);
    }
//    删除标签
    public void deleteTags(String Tag){
        tagsMapper.deleteTags(Tag);
    }
//    标签数量加一
    public void TagsAddOne(String Tag){
        tagsMapper.TagsAddOne(Tag);
    }
//    标签数量减一
    public void TagsSubtractOne(String Tag){
        tagsMapper.TagsSubtractOne(Tag);
    }
}
