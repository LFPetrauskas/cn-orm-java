package com.challenge.entity;

import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Candidate {

    @EmbeddedId
    private CandidateId candidateId;
    
    @NotNull
    private Integer status;
    
    @CreatedDate
    private Timestamp createdAt;

}