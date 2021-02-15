package edu_project.japaneserestaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Position {
    @Id
    private Long id;

    private String name;

    private BigDecimal price;

    private String img;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category categoryId;
}
