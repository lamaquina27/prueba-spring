package com.example.tarjetas.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarjetas.demo.dto.CardDto;
import com.example.tarjetas.demo.servicio.CardServicio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/cards")
public class CardController {
    private CardServicio servicio;

    @PostMapping
    public CardDto creacionCard(@RequestBody HashMap<String,Object> card) {
        
        return servicio.creacion(card);
    }

    @PostMapping("/{id}/activate")
    public CardDto activar(@PathVariable Long id){
        return servicio.activacion(id);
    }
    @PostMapping("{id}/block")
    public CardDto bloquear(@PathVariable Long id, @RequestBody String reason){
        return servicio.bloquear(id, reason);
    }
    


    @GetMapping("{id}")
    public CardDto buscarid(@PathVariable Long id) {
        return servicio.buscar(id);
    }
    
    
    
    
}
