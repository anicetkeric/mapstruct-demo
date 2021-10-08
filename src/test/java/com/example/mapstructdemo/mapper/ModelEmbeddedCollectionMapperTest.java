package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.ModelEmbeddedCollection;
import com.example.mapstructdemo.domain.SimpleModel;
import com.example.mapstructdemo.dto.ModelEmbeddedCollectionDto;
import com.example.mapstructdemo.dto.SimpleModelDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ModelEmbeddedCollectionMapperTest {

    @Autowired
    ModelEmbeddedCollectionMapper modelMapper;


    @Test
    public void shouldToDto() {
        SimpleModel simpleModel = new SimpleModel("name", "description");
        ModelEmbeddedCollection model = new ModelEmbeddedCollection(1, "label1", Collections.singletonList(simpleModel));


        ModelEmbeddedCollectionDto dto = modelMapper.toDto(model);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getName(), model.getLabel());
        assertEquals(dto.getSimpleModelDtos().get(0).getName(), model.getSimpleModels().get(0).getName());
        assertEquals(dto.getSimpleModelDtos().get(0).getDescription(), model.getSimpleModels().get(0).getDescription());
    }

    @Test
    public void shouldToModel() {
        SimpleModelDto simpleModelDto = new SimpleModelDto("name", "description");
        ModelEmbeddedCollectionDto dto = new ModelEmbeddedCollectionDto(2, "label2", Collections.singletonList(simpleModelDto));


        ModelEmbeddedCollection model = modelMapper.toModel(dto);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getName(), model.getLabel());
        assertEquals(dto.getSimpleModelDtos().get(0).getName(), model.getSimpleModels().get(0).getName());
        assertEquals(dto.getSimpleModelDtos().get(0).getDescription(), model.getSimpleModels().get(0).getDescription());
    }
}