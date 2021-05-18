package com.example.mapstructdemo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MappingObjectReferenceDto {

    private int id;
    private String name;
    private ObjectReferenceModelDto objectReferenceModelDto;
}
