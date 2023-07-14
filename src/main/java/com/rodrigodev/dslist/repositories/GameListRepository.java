package com.rodrigodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigodev.dslist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long>{
  
}
