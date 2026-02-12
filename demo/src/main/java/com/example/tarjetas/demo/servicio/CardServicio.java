package com.example.tarjetas.demo.servicio;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tarjetas.demo.dto.CardDto;
import com.example.tarjetas.demo.entity.Card;
import com.example.tarjetas.demo.mappers.CardMapper;
import com.example.tarjetas.demo.repositorio.CardRepository;


@Service
public class CardServicio {
    @Autowired
    private CardRepository repo;



    public CardDto creacion(HashMap<String,Object> request ){
        Card nuevo = new Card();
        nuevo.setBalance(0.00);
        nuevo.setCurrency("USD");
        nuevo.setId(Long.parseLong((String) request. get("productId")));
        nuevo.setBlockedAt(null);
        nuevo.setStatus("ISSUED");
        nuevo.setCardNumber(null);


        Card insertado = repo.save(nuevo);
        return CardMapper.toDto(insertado);
    }

    public CardDto activacion(Long id){
        Card card = repo.findById(id).orElse(null);
        if(card.getStatus().equalsIgnoreCase("ISSUED")){
            card.setStatus("ACTIVATE");
            Card actualizada = repo.save(card);
            return CardMapper.toDto(actualizada);
        }else{
            return  null;
        }
        
    }

    public CardDto bloquear(Long id,String reason){
        Card card = repo.findById(id).orElse(null);
        if(!card.getStatus().equalsIgnoreCase("BLOCKED")){
            card.setBlockedReason(reason);
            card.setBlockedAt(null);
            Card actualizada = repo.save(card);
            return CardMapper.toDto(actualizada);
        }else{
            return  null;
        }
    }
    public CardDto buscar(Long id){
        Card card = repo.findById(id).orElse(null);
        return (card != null) ? CardMapper.toDto(card) : null;
    }
    

}
