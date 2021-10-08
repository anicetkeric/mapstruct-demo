package com.example.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataTypeConversionDto {
    private int id;
    private String key;
    private String startDate;
}
