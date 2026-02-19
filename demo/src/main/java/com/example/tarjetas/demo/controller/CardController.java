package com.example.tarjetas.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarjetas.demo.dto.CardDtoActivate;
import com.example.tarjetas.demo.dto.CardDtoBlock;
import com.example.tarjetas.demo.dto.CardDtoCreacion;
import com.example.tarjetas.demo.dto.CardDtoGet;
import com.example.tarjetas.demo.servicio.CardServicio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardServicio servicio;
    public CardController(CardServicio servicio) {
        this.servicio = servicio;
    }
    @PostMapping("/test")
    public String test(@RequestBody String body) {
        return body;
    }
    @PostMapping(consumes = "application/json")
    public ResponseEntity<CardDtoCreacion> creacionCard(@RequestBody HashMap<String,String> card) {
        
        return ResponseEntity.ok(servicio.creacion(card));
    }

    @PostMapping("/{id}/activate")
    public ResponseEntity<CardDtoActivate> activar(@PathVariable Long id){
        return ResponseEntity.ok(servicio.activacion(id));
    }
    @PostMapping("{id}/block")
    public ResponseEntity<CardDtoBlock> bloquear(@PathVariable Long id, @RequestBody HashMap<String,String> reason){
        return ResponseEntity.ok(servicio.bloquear(id, reason.get("reason")));
    }
    


    @GetMapping("{id}")
    public ResponseEntity<CardDtoGet> buscarid(@PathVariable Long id) {
        return ResponseEntity.ok(servicio.buscar(id));
    }
    
    
    
    
}
