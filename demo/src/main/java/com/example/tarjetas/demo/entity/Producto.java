package com.example.tarjetas.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table
@Entity
@Data

public class Producto {

    @Id
    private Long id;
    private String name;
    private String Type;

}
