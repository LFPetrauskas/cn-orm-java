package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class SubmissionId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Challenge challenge;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof SubmissionId))
            return false;

        SubmissionId obj = (SubmissionId) o;

        if (user != null ? !user.equals(obj.user) : obj.user != null)
            return false;
        return challenge != null ? challenge.equals(obj.challenge) : obj.challenge == null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}