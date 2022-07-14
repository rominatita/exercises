package com.exercise.mili.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Program {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "DESCRIPCION")
    private String description;

}
