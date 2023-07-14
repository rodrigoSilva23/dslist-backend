package com.rodrigodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigodev.dslist.dto.GameListDTO;
import com.rodrigodev.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/games-list")
public class GameListController {
 
  @Autowired
  private  GameListService gameListService;
  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }
}
