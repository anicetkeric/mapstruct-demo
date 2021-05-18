package com.example.mapstructdemo.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelEmbeddedCollection {
    private int id;
    private String label;

    private List<SimpleModel> simpleModels;
}


