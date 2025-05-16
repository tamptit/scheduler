package com.example.scheduler.domain.target;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "ADMIN_ROLE")
public class ARole {
    @Id
    @Column(name = "ROLE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "ROLE_NAME", length = 300)
    private String roleName;

    @Nationalized
    @Column(name = "NOTE", length = 300)
    private String note;

    @Column(name = "ADMIN")
    private Integer admin;

    @Column(name = "QTCT")
    private Integer qtct;

    @Column(name = "UPDATED")
    private Instant updated;

}