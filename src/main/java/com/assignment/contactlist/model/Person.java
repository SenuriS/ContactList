package com.assignment.contactlist.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer person_id;

    @Column
    private String person_name;

    @Column
    private String person_image;
}
