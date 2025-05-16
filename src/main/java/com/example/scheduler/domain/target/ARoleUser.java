package com.example.scheduler.domain.target;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "ADMIN_ROLE_USER")
public class ARoleUser {
    @Id
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "CREATED")
    private Instant created;

    @Column(name = "UPDATED")
    private Instant updated;

    @Column(name = "CREATED_BY", length = 100)
    private String createdBy;

    @Column(name = "UPDATED_BY", length = 100)
    private String updatedBy;

}