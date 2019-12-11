package com.softkit.tgbot.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityId;

    private String cityName;

    public Cities(){
    }

    public Cities( String cityName )
    {
        this.cityName = cityName;
    }

    public long getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cities)) return false;
        Cities cities = (Cities) o;
        return cityId == cities.cityId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId);
    }
}
