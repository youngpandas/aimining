package com.sicdp.entity;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nid;

    private String param;

    private Integer jobId;

    private Integer nodeId;

    private String pythonPath;

    private String modelName;

}
