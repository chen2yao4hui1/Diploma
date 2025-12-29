package org.example.freshecommercestore_api.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("users")
public class User {
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @TableField(exist = false)
    private String role;
    @JsonIgnore
    @TableId
    private String userId;
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String nickName;
    private String email;
    private Integer vipRank;
    private LocalDate registerTime;
    private LocalDateTime lastLoginTime;
    @JsonIgnore
    private Integer phone;
    private String avatarUrl;
}