package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CandidateId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Acceleration acceleration;

    @ManyToOne
    private Company company;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CandidateId))
            return false;

        CandidateId obj = (CandidateId) o;

        if (user != null ? !user.equals(obj.user) : obj.user != null)
            return false;
        if (acceleration != null ? !acceleration.equals(obj.acceleration) : obj.acceleration != null)
            return false;
        return company != null ? company.equals(obj.company) : obj.company == null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}