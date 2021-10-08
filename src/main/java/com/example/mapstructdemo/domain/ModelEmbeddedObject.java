package com.example.mapstructdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelEmbeddedObject {
    private int id;
    private String label;

    private SimpleModel simpleModel;
}


