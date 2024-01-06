package com.example.demo.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SwitchGame {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String genre;
    private Boolean inStock;
    private Date releaseDate;
    private String rating;
}
