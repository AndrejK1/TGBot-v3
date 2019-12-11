package com.softkit.tgbot.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class UserSpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int specializationId;

    private String specializationDescription;

    public UserSpecialization() {
    }

    public UserSpecialization( String specializationDescription ) {
        this.specializationDescription = specializationDescription;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public String getSpecializationDescription() {
        return specializationDescription;
    }

    public void setSpecializationDescription(String specializationDescription) {
        this.specializationDescription = specializationDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserSpecialization)) return false;
        UserSpecialization that = (UserSpecialization) o;
        return specializationId == that.specializationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specializationId);
    }
}
