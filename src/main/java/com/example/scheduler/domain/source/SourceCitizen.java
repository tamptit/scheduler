package com.example.scheduler.domain.source;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;


//@Entity
//@Table(name = "resident_citizen")
@Getter
@Setter
public class SourceCitizen {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "PERSONAL_ID")
    private String personalId;
    @Column(name = "IDENTITY")
    private String identity;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "BLOOD")
    private String blood;
    @Column(name = "BIRTH_DATE")
    private String birthDate;
    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "UPDATE_TIME")
    private Timestamp updateTime;

    public SourceCitizen() {
    }

    public SourceCitizen(String personalId, String identity, String name, String gender, String blood, String birthDate, String nationality) {
        this.personalId = personalId;
        this.identity = identity;
        this.name = name;
        this.gender = gender;
        this.blood = blood;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public SourceCitizen(String id, String personalId, String identity, String name, String gender, String blood, String birthDate, String nationality) {
        this.id = id;
        this.personalId = personalId;
        this.identity = identity;
        this.name = name;
        this.gender = gender;
        this.blood = blood;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceCitizen that = (SourceCitizen) o;
        return id.equals(that.id) && personalId.equals(that.personalId) && identity.equals(that.identity) && name.equals(that.name) && gender.equals(that.gender) && blood.equals(that.blood) && birthDate.equals(that.birthDate) && nationality.equals(that.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personalId, identity, name, gender, blood, birthDate, nationality);
    }

    @Override
    public String toString() {
        return "NatCitizenDto{" + "id='" + id + '\'' +", personalId='" + personalId + '\'' +
                ", identity='" + identity + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", blood='" + blood + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }


}
