package com.erguotou.service;

import com.erguotou.mapper.FriendLinkMapper;
import com.erguotou.pojo.FriendLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FriendLinkService {
    @Autowired
    FriendLinkMapper friendLinkMapper;

//    添加友链
    public void addLink(FriendLink friendLink){
        friendLinkMapper.addLink(friendLink);
    }
//    删除友链
    public void deleteLink(int id){
        friendLinkMapper.deleteLink(id);
    }
//    查询所有友链
    public List<FriendLink> getAllLink(){
        for (FriendLink friendLink:
             friendLinkMapper.getAllLink()) {
            System.out.println(friendLink);
        }
        return friendLinkMapper.getAllLink();
    }


}
