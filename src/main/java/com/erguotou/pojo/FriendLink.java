package com.erguotou.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FriendLink {
    private int id;
    private String friendLink;
    private String friendName;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
}
