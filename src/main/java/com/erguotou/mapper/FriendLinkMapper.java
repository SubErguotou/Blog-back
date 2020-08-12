package com.erguotou.mapper;

import com.erguotou.pojo.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FriendLinkMapper {
//    添加友链
    void addLink(FriendLink friendLink);
//    删除友链
    void deleteLink(int id);
//    查询所有友链
    List<FriendLink> getAllLink();
}
