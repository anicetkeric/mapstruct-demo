package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.ModelEmbeddedObject;
import com.example.mapstructdemo.domain.SimpleModel;
import com.example.mapstructdemo.dto.ModelEmbeddedObjectDto;
import com.example.mapstructdemo.dto.SimpleModelDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ModelEmbeddedObjectMapperTest {

    @Autowired
    ModelEmbeddedObjectMapper modelMapper;


    @Test
    public void shouldToDto() {
        SimpleModel simpleModel = new SimpleModel("name", "description");
        ModelEmbeddedObject model = new ModelEmbeddedObject(1, "label1", simpleModel);


        ModelEmbeddedObjectDto dto = modelMapper.toDto(model);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getName(), model.getLabel());
        assertEquals(dto.getSimpleModelDto().getName(), model.getSimpleModel().getName());
        assertEquals(dto.getSimpleModelDto().getDescription(), model.getSimpleModel().getDescription());
    }

    @Test
    public void shouldToModel() {
        SimpleModelDto simpleModelDto = new SimpleModelDto("name", "description");
        ModelEmbeddedObjectDto dto = new ModelEmbeddedObjectDto(2, "label2", simpleModelDto);


        ModelEmbeddedObject model = modelMapper.toModel(dto);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getName(), model.getLabel());
        assertEquals(dto.getSimpleModelDto().getName(), model.getSimpleModel().getName());
        assertEquals(dto.getSimpleModelDto().getDescription(), model.getSimpleModel().getDescription());
    }
}