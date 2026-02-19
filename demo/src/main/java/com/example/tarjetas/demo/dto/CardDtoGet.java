package com.example.tarjetas.demo.dto;

import java.time.LocalDate;

public class CardDtoGet {
    private Long id;
    private String cardNumber;
    private String holderName;
    private String status;
    private LocalDate blockedAt;
    private String blockedReason;
    private LocalDate expiresAt;
    private Double balance;
    private String currency;


    
    public CardDtoGet(Long id, String cardNumber, String holderName, String status, LocalDate blockedAt,
            String blockedReason, LocalDate expiresAt, Double balance, String currency) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.status = status;
        this.blockedAt = blockedAt;
        this.blockedReason = blockedReason;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDate getBlockedAt() {
        return blockedAt;
    }
    public void setBlockedAt(LocalDate blockedAt) {
        this.blockedAt = blockedAt;
    }
    public String getBlockedReason() {
        return blockedReason;
    }
    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
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
