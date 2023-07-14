package com.rodrigodev.dslist.dto;

import com.rodrigodev.dslist.entities.Game;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@EqualsAndHashCode
public class GameMinDTO {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO(Game game) {
    this.id = game.getId();
    this.title = game.getTitle();
    this.year = game.getYear();
    this.imgUrl = game.getImgUrl();
    this.shortDescription = game.getShortDescription();
  }
}
