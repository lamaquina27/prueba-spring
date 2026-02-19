package com.example.tarjetas.demo.dto;

import java.time.LocalDate;

public class CardDtoCreacion {
    private Long id;
    private String cardNumber;
    private String holderName;
    private LocalDate expiresAt;
    private Double balance;
    private String currency;


    
    public CardDtoCreacion(Long id, String cardNumber, String holderName, LocalDate expiresAt, Double balance,
            String currency) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiresAt = expiresAt;
        this.balance = balance;
        this.currency = currency;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public LocalDate getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    



    

}
