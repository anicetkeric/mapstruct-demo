package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.SimpleModel;
import com.example.mapstructdemo.dto.SimpleModelDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleModelMapperTest {

    @Autowired
    SimpleModelMapper simpleModelMapper;


    @Test
    public void shouldMapSimpleModelToDto() {

        SimpleModel model = new SimpleModel("name", "description");


        SimpleModelDto dto = simpleModelMapper.sourceToDestination(model);

        assertEquals(dto.getDescription(), model.getDescription());
        assertEquals(dto.getName(), model.getName());
    }

    @Test
    public void shouldMapSimpleModelToDomain() {

        SimpleModelDto dto = new SimpleModelDto("name", "description");


        SimpleModel model = simpleModelMapper.destinationToSource(dto);

        assertEquals(dto.getDescription(), model.getDescription());
        assertEquals(dto.getName(), model.getName());
    }

}