package com.example.tarjetas.demo.mappers;

import com.example.tarjetas.demo.dto.CardDto;
import com.example.tarjetas.demo.entity.Card;

public class CardMapper {
    public static CardDto toDto(Card card){
        return new CardDto(card.getId(), card.getCardNumber(), card.getHolderName(), card.getIssuedAt(), card.getExpiresAt(), card.getStatus(), card.getBlockedAt(),card.getBlockedReason(), card.getBalance(), card.getCurrency());

    }

    public static Card toEntity(CardDto dto){
        Card card = new Card();
        card.setId(dto.getId());
        card.setCardNumber(dto.getCardNumber());
        card.setHolderName(dto.getHolderName());
        card.setIssuedAt(dto.getIssuedAt());
        card.setExpiresAt(dto.getExpiresAt());
        card.setStatus(dto.getStatus());
        card.setBlockedAt(dto.getBlockedAt());
        card.setBlockedReason(dto.getBlockedReason());
        card.setBalance(dto.getBalance());
        card.setCurrency(dto.getCurrency());
        return card;
    }
}
