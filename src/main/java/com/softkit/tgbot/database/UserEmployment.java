package com.softkit.tgbot.database;

import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class UserEmployment {

    @Id
    @Column( unique = true )
    private long telegramId;

    @Type( type = "int-array" )
    @Column(
            columnDefinition = "integer[]"
    )
    private int [] arrayEmployments;

    public UserEmployment() {
    }

    public UserEmployment(long telegramId ) {
        this.telegramId = telegramId;
    }

    public long getTelegramId() {
        return telegramId;
    }

    public int[] getArrayEmployments() {
        return arrayEmployments;
    }

    public void setArrayEmployments(int[] arrayEmployments) {
        this.arrayEmployments = arrayEmployments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEmployment)) return false;
        UserEmployment that = (UserEmployment) o;
        return telegramId == that.telegramId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(telegramId);
    }
}
