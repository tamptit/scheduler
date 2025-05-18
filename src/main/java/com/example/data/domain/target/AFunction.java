package com.example.data.domain.target;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "ADMIN_FUNCTION")
public class AFunction {
    @Id
    @Column(name = "FUNC_ID", nullable = false)
    private Integer funcId;

//    @Size(max = 300)
    @Nationalized
    @Column(name = "FUNC_NAME", length = 300)
    private String funcName;

//    @Size(max = 200)
    @Column(name = "FUNC_CODE", length = 200)
    private String funcCode;

}