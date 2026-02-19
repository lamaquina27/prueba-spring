package com.example.tarjetas.demo.servicio;
import java.util.Random;

import java.time.LocalDate;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.tarjetas.demo.dto.CardDtoActivate;
import com.example.tarjetas.demo.dto.CardDtoBlock;
import com.example.tarjetas.demo.dto.CardDtoCreacion;
import com.example.tarjetas.demo.dto.CardDtoGet;
import com.example.tarjetas.demo.dto.CardRequest;
import com.example.tarjetas.demo.entity.Card;
import com.example.tarjetas.demo.mappers.CardMapper;
import com.example.tarjetas.demo.repositorio.CardRepository;


@Service
public class CardServicio {
    @Autowired
    private CardRepository repo;



    public CardDtoCreacion  creacion(CardRequest card){
        Card nuevo = CardMapper.toEntity(card);
        nuevo.setBalance(0.00);
        nuevo.setCurrency("USD");
        nuevo.setBlockedAt(null);
        nuevo.setStatus("ISSUED");
        nuevo.setIssuedAt(LocalDate.now());
        nuevo.setExpiresAt(nuevo.getIssuedAt().plusYears(3));
        Random r = new Random();
        Long l = 1_000_000_000L + (long)(r.nextDouble() * 9_000_000_000L);
        nuevo.setCardNumber(card.getId()+Long.toString(l));


        Card insertado = repo.save(nuevo);
        return CardMapper.toDtoCreacion(insertado);
    }

    public CardDtoActivate activacion(Long id){
        Card card = repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
        if(card.getStatus().equalsIgnoreCase("ISSUED")){
            card.setStatus("ACTIVATE");
            Card actualizada = repo.save(card);
            return CardMapper.toDtoActivacion(actualizada);
        }else if(card.getStatus().equalsIgnoreCase("ACTIVATE")){
            throw new ResponseStatusException(HttpStatusCode.valueOf(200));
        }else{
            throw new ResponseStatusException(HttpStatusCode.valueOf(409));
        }
        
        
    }

    public CardDtoBlock bloquear(Long id,String reason){
        Card card = repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
        if(!card.getStatus().equalsIgnoreCase("BLOCKED")){
            

            card.setBlockedReason(reason);
            card.setBlockedAt(LocalDate.now());  // ✅ Fecha actual
            card.setStatus("BLOCKED");   
            Card actualizada = repo.save(card);
            return CardMapper.toDtoBlock(actualizada);
        }else{
            throw new ResponseStatusException(HttpStatusCode.valueOf(200));
        }
    }
    public CardDtoGet buscar(Long id){
        Card card = repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
        return CardMapper.toDtoGet(card);
    }
    

}
