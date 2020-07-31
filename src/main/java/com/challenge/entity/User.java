package com.challenge.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Getter @Setter

public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Size(max = 100)
    private String fullName;
    
    @Email
    @NotNull
    @Size(max = 100)
    private String email;
    
    @NotNull
    @Size(max = 50)
    private String nickname;
    
    @NotNull
    @Size(max = 255)
    private String password;
    
    @CreatedDate
    private Timestamp createdAt;

    @OneToMany
    private List<Candidate> candidates;

    @OneToMany
    private List<Submission> submissions;
}