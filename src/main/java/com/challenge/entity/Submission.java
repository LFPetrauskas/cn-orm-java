package com.challenge.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Submission implements Serializable {

    @EmbeddedId
    private SubmissionId submissionId;

    @NotNull
    private Float score;

    @CreatedDate
    private Timestamp createdAt;

}