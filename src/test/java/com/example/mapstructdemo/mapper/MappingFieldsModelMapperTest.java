package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.MappingFieldsModel;
import com.example.mapstructdemo.dto.MappingFieldsModelDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MappingFieldsModelMapperTest {

    @Autowired
    MappingFieldsModelMapper modelMapper;


    @Test
    public void shouldToDto() {

        MappingFieldsModel model = new MappingFieldsModel(1, "name11");


        MappingFieldsModelDto dto = modelMapper.toDto(model);

        assertEquals(dto.getModelId(), model.getId());
        assertEquals(dto.getModelName(), model.getName());
    }

    @Test
    public void shouldToModel() {

        MappingFieldsModelDto dto = new MappingFieldsModelDto(2, "name1");


        MappingFieldsModel model = modelMapper.toModel(dto);

        assertEquals(dto.getModelId(), model.getId());
        assertEquals(dto.getModelName(), model.getName());
    }
}