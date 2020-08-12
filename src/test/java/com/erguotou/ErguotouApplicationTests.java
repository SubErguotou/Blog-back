package com.erguotou;

import com.erguotou.mapper.BlogMapper;
import com.erguotou.mapper.FriendLinkMapper;
import com.erguotou.mapper.TagsMapper;
import com.erguotou.pojo.FriendLink;
import com.erguotou.service.FriendLinkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErguotouApplicationTests {

    @Autowired
    BlogMapper blogMapper;

    @Test
    public void TestSpring(){
        System.out.println(blogMapper.getBlog(1));
    }

    @Autowired
    FriendLinkService friendLinkService;
    @Test
    public void TestFriendLink(){
        friendLinkService.getAllLink();
    }

}
