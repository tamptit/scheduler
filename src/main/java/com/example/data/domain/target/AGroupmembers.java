package com.example.data.domain.target;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "Groupmembers")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(AGroupmembersPK.class)
public class AGroupmembers {
    @Id
    @Column(name = "G_NAME")
    private String gName;
    
    @Id
    @Column(name = "G_MEMBER")
    private String gMember;

    @Id
    @Column(name = "DOMAIN")
    private String domain;

    @Column(name = "TAXO")
    private String taxo;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp updated;

    @Column(name = "GROUP_ID")
    private Long groupId;   // kiểu Long vì cột trong DB kiểu Number

    @Column(name = "USER_ID")
    private Long userId;

    public AGroupmembers(String gMember, String domain, String taxo, String descr) {
        this.gMember = gMember;
        this.domain = domain;
        this.taxo = taxo;
        this.descr = descr;
    }
    public AGroupmembers(String gName, String gMember, String domain, String taxo, String descr, Long groupId, Long userId) {
        this.gName = gName;
        this.gMember = gMember;
        this.domain = domain;
        this.taxo = taxo;
        this.descr = descr;
        this.groupId = groupId;
        this.userId = userId;
    }
    public AGroupmembers(String gName, String gMember, String domain, String taxo, String status, String descr, Long groupId, Long userId) {
        this.gName = gName;
        this.gMember = gMember;
        this.domain = domain;
        this.taxo = taxo;
        this.status = status;
        this.descr = descr;
        this.groupId = groupId;
        this.userId = userId;
    }

//    AGroupmembers(String gName,String gMember, String domain, String taxo, String descr, String updated)


    public AGroupmembers(String gName, String gMember, String domain, String taxo, String descr, Timestamp updated) {
        this.gName = gName;
        this.gMember = gMember;
        this.domain = domain;
        this.taxo = taxo;
        this.descr = descr;
        this.updated = updated;
    }

    public AGroupmembers(String gName, Long groupId) {
        this.gName = gName;
        this.groupId = groupId;
    }

}
