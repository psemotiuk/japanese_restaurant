package edu_project.japaneserestaurant.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class PositionInfo {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "positionId")
    private Position position;

    private String description;
}
