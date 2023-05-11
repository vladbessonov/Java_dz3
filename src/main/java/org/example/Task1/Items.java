package org.example.Task1;

import lombok.RequiredArgsConstructor;
import lombok.Data;
@RequiredArgsConstructor
@Data

public class Items {
    private String name;
    private Double price;
    private Integer sort;

    public Items(String name, Double price, Integer sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }
}
