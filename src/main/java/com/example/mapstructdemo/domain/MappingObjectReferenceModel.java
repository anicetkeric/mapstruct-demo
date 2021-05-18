package com.example.mapstructdemo.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MappingObjectReferenceModel {

    private int id;
    private String name;
    private ObjectReferenceModel objectReferenceModel;
}
