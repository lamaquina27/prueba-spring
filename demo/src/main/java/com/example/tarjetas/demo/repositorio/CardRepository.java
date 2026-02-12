package com.example.tarjetas.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tarjetas.demo.entity.Card;

public interface CardRepository extends JpaRepository<Card,Long>{

    
}
