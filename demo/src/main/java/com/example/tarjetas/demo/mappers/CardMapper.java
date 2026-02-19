package com.example.tarjetas.demo.mappers;

import com.example.tarjetas.demo.dto.CardDtoActivate;
import com.example.tarjetas.demo.dto.CardDtoBlock;
import com.example.tarjetas.demo.dto.CardDtoCreacion;
import com.example.tarjetas.demo.dto.CardDtoGet;
import com.example.tarjetas.demo.entity.Card;

public class CardMapper {
    public static CardDtoCreacion toDtoCreacion(Card card){
        return new CardDtoCreacion(card.getId(), card.getCardNumber(), card.getHolderName(), card.getExpiresAt(), card.getBalance(), card.getCurrency());

    }
    public static CardDtoActivate toDtoActivacion(Card card){
        return new CardDtoActivate(card.getId(),card.getStatus());
    }
    public static CardDtoBlock toDtoBlock(Card card){
        return new CardDtoBlock(card.getId(),card.getStatus());
    }

    public static CardDtoGet toDtoGet(Card card){
        return new CardDtoGet(card.getId(), card.getCardNumber(), card.getHolderName(),card.getStatus(),card.getBlockedAt(),card.getBlockedReason(), card.getExpiresAt(), card.getBalance(), card.getCurrency());
    }
    public static Card toEntity(CardDtoCreacion dto){
        Card card = new Card();
        card.setId(dto.getId());
        card.setCardNumber(dto.getCardNumber());
        card.setExpiresAt(dto.getExpiresAt());
        card.setBalance(dto.getBalance());
        card.setCurrency(dto.getCurrency());
        return card;
    }
}
