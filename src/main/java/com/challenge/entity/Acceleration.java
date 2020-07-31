package com.challenge.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Acceleration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(max = 100)
    private String name;
    
    @NotNull
    @Size(max = 50)
    private String slug;

    @CreatedDate
    private Timestamp createdAt;

    @ManyToOne
    private Challenge challenge;

    @OneToMany
    private List<Candidate> candidates;
}