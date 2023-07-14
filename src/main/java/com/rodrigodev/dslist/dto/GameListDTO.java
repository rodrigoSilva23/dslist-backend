package com.rodrigodev.dslist.dto;

import com.rodrigodev.dslist.entities.GameList;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GameListDTO {
  private Long id;
  private String name;

  public GameListDTO(GameList entity) {
    this.id = entity.getId();
    this.name = entity.getName();
  }
}
