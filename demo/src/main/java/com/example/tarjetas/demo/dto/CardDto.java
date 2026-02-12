package com.example.tarjetas.demo.dto;

import java.time.LocalDate;

public class CardDto {
    private Long id;
    private Long cardNumber;
    private String holderName;
    private LocalDate issuedAt;
    private LocalDate expiresAt;
    private String status;
    private LocalDate blockedAt;
    private String blockedReason;
    private Double balance;
    private String currency;

    



    public CardDto(Long id, Long cardNumber, String holderName, LocalDate issuedAt, LocalDate expiresAt, String status,
            LocalDate blockedAt, String blockedReason, Double balance, String currency) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
        this.status = status;
        this.blockedAt = blockedAt;
        this.blockedReason = blockedReason;
        this.balance = balance;
        this.currency = currency;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public LocalDate getIssuedAt() {
        return issuedAt;
    }
    public void setIssuedAt(LocalDate issuedAt) {
        this.issuedAt = issuedAt;
    }
    public LocalDate getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
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
