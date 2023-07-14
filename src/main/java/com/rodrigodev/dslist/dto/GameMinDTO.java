package com.rodrigodev.dslist.dto;

import com.rodrigodev.dslist.entities.Game;
import com.rodrigodev.dslist.projections.GameMinProjection;

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

  public GameMinDTO(Game entity) {
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.year = entity.getYear();
    this.imgUrl = entity.getImgUrl();
    this.shortDescription = entity.getShortDescription();
  }

  public GameMinDTO(GameMinProjection projection) {
    this.id = projection.getId();
    this.title = projection.getTitle();
    this.year = projection.getYear();
    this.imgUrl = projection.getImgUrl();
    this.shortDescription = projection.getShortDescription();
  }
}
