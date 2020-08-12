package com.erguotou.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Repository
@Accessors(chain = true)
public class User {
//  @JsonIgnore过滤掉不会传输给前端
  @JsonIgnore
  private long id;
  private String userName;
  @JsonIgnore
  private String userPasswd;
  private String userEmail;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private LocalDateTime creatTime;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private LocalDateTime updateTime;
  @JsonIgnore
  private long enable;
  @JsonIgnore
  private long blogNumber;
  private List<Blog> blogList;
}
