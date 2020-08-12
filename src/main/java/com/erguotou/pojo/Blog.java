package com.erguotou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private int id;
    private User userNameId;
    private String titles;
    private Classfiy classfileId;
    private Tags tagsId;
    private String blogText;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", userName='" + userNameId + '\'' +
                ", titles='" + titles + '\'' +
                ", classfiy=" + classfileId +
                ", tags=" + tagsId +
                ", blogText='" + blogText + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
