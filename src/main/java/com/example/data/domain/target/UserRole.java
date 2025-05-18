package com.example.data.domain.target;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "USER_ROLE")
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {//AbstractAuditingCreateEntity
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "AREA_CODE")
    private String areaCode;

    @Column(name = "AREA_TYPE")
    private String areaType;
}
