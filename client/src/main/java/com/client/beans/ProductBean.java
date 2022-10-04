package com.client.beans;


import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductBean {
    private int id;
    private String titre;
    private String description;
    private String image;
    private Double prix;
}
