package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.DataTypeConversionModel;
import com.example.mapstructdemo.dto.DataTypeConversionDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DataTypeConversionMapperTest {

    @Autowired
    DataTypeConversionMapper modelMapper;

    private static final String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";

    @Test
    public void shouldToDto() {

        DataTypeConversionModel model = new DataTypeConversionModel(1,1, LocalDateTime.of(2021,10,30,10,25,1));


        DataTypeConversionDto dto = modelMapper.toDto(model);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getKey(), String.valueOf(model.getKey()));
        assertEquals(dto.getStartDate(), "30-10-2021 10:25:01");
    }

    @Test
    public void shouldToModel() {

        DataTypeConversionDto dto = new DataTypeConversionDto(2,"1", "31-10-2021 10:18:01");


        DataTypeConversionModel model  = modelMapper.toModel(dto);

        assertEquals(dto.getId(), model.getId());
        assertEquals(Integer.parseInt(dto.getKey()),model.getKey());
        assertEquals(dto.getStartDate(),model.getStartDate().format(DateTimeFormatter.ofPattern(DATE_FORMAT)));
    }
}