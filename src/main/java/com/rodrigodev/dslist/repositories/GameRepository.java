package com.rodrigodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodev.dslist.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{
  
}
