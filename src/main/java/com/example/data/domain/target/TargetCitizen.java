package com.example.data.domain.target;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "nat_citizen")
public class TargetCitizen {
    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    private String id;
    @Column(name = "PERSONAL_ID")
    private String personalId;
    @Column(name = "IDENTITY")
    private String identity;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GENDER")
    private short gender;
    @Column(name = "BLOOD")
    private short blood;
    @Column(name = "BIRTH_DATE")
    private String birthDate;
    @Column(name = "NATIONALITY")
    private String nationality;

    @Transient
    private short mon;
    @Transient
    private short year;


    public TargetCitizen() {
    }

    public TargetCitizen(String id, String personalId, String identity, String name, String birthDate, String nationality) {
        this.id = id;
        this.personalId = personalId;
        this.identity = identity;
        this.name = name;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public short getBlood() {
        return blood;
    }

    public void setBlood(short blood) {
        this.blood = blood;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetCitizen that = (TargetCitizen) o;
        return gender == that.gender && personalId.equals(that.personalId) && identity.equals(that.identity) && Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalId, identity, gender, birthDate);
    }
}
