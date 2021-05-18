package com.example.mapstructdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataTypeConversionModel {
    private int id;
    private int key;
    private LocalDateTime startDate;
}
