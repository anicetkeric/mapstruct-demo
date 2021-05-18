package com.example.mapstructdemo.dto;

import com.example.mapstructdemo.domain.SimpleModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelEmbeddedObjectDto {

    private int id;
    private String name;

    private SimpleModelDto simpleModelDto;
}

