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

    @Column(columnDefinition = "smallint")
    @Enumerated(EnumType.ORDINAL)
    private PhoneTypesEnum phoneTypesEnum;

    @Column
    private String description;

}

enum PhoneTypesEnum {
    HOME,
    WORK,
    MOBILE
}