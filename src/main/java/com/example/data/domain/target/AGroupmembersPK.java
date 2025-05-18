package com.example.data.domain.target;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AGroupmembersPK implements Serializable {
    @Id
    @Column(name="G_MEMBER")
    private String gMember;

    @Id
    @Column(name="G_NAME")
    private String gName;

    @Id
    @Column(name = "DOMAIN")
    private String domain;
}
