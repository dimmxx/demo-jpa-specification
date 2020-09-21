package com.example.demojpaspecification.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "phone_types")
@Data
@NoArgsConstructor
public class PhoneType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PhoneTypeEnum phoneTypeEnum;

    @Column
    private String description;

}