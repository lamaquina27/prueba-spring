package com.example.tarjetas.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table
@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;
    @Column(name="cardNumber")
    private String cardNumber;
    @Column(name="holderName")
    private String holderName;
    @Column(name="issuedAt")
    private LocalDate issuedAt;
    @Column(name="expiresAt")
    private LocalDate expiresAt;
    @Column(name="status")
    private String status;
    @Column(name="blockedAt")
    private LocalDate blockedAt;
    @Column(name="blockedReason")
    private String blockedReason;
    @Column(name="balance")
    private Double balance;
    @Column(name="currency")
    private String currency;


}
