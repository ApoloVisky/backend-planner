package com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//Reposity = Classe que estabelece a comunicação com o Banco de dados

public interface TripRepository extends JpaRepository<Trip, UUID> {

}
