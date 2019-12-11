package com.softkit.tgbot.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class UserEnglishLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int englishLevelId;

    private String experienceDescription;

    public UserEnglishLevel() {
    }

    public UserEnglishLevel( String experienceDescription )
    {
        this.experienceDescription = experienceDescription;
    }

    public int getEnglishLevelId() {
        return englishLevelId;
    }

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEnglishLevel)) return false;
        UserEnglishLevel that = (UserEnglishLevel) o;
        return englishLevelId == that.englishLevelId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(englishLevelId);
    }
}
