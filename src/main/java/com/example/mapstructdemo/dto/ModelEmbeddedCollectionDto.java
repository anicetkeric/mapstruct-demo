package com.example.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelEmbeddedCollectionDto {

    private int id;
    private String name;

    private List<SimpleModelDto> simpleModelDtos;
}

