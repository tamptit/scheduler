package com.example.data.domain.target;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ADMIN_ROLE_FUNC")
public class ARoleFunc {
    @Id
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "FUNC_ID")
    private Integer funcId;

}