package com.erguotou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TagsMapper {
//    查询标签数量
    int getTagsNubmer(String Tag);
//    增加标签
    void addTags(String Tag);
//    删除标签
    void deleteTags(String Tag);
//    标签数量加一
    void TagsAddOne(String Tag);
//    标签数量减一
    void TagsSubtractOne(String Tag);

}
