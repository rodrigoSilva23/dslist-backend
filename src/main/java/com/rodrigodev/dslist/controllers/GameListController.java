package com.rodrigodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodev.dslist.dto.GameListDTO;
import com.rodrigodev.dslist.dto.GameMinDTO;
import com.rodrigodev.dslist.services.GameListService;
import com.rodrigodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService gameListService;
  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }

  @GetMapping(value = "/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable Long listId) {
    List<GameMinDTO> result = gameService.findByList(listId);
    return result;
  }
}
