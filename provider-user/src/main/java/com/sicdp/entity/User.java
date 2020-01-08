package com.sicdp.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;

    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;

    @CreatedDate
    private Date createTime;
}
