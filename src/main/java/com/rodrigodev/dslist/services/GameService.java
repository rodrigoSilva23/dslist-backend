package com.rodrigodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigodev.dslist.dto.GameMinDTO;
import com.rodrigodev.dslist.entities.Game;
import com.rodrigodev.dslist.repositories.GameRepository;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();

  }
}
