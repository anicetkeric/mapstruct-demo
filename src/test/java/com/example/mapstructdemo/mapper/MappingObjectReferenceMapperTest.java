package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.MappingObjectReferenceModel;
import com.example.mapstructdemo.domain.ObjectReferenceModel;
import com.example.mapstructdemo.dto.MappingObjectReferenceDto;
import com.example.mapstructdemo.dto.ObjectReferenceModelDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MappingObjectReferenceMapperTest {

    @Autowired
    MappingObjectReferenceMapper modelMapper;


    @Test
    public void shouldToDto() {
        ObjectReferenceModel objectReferenceModel = ObjectReferenceModel.builder().label("label").build();
        MappingObjectReferenceModel model = new MappingObjectReferenceModel(1,"name11", objectReferenceModel);


        MappingObjectReferenceDto dto = modelMapper.toDto(model);

        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getName(), model.getName());
        assertEquals(dto.getObjectReferenceModelDto().getLabel(), model.getObjectReferenceModel().getLabel());
    }

    @Test
    public void shouldToModel() {
        ObjectReferenceModelDto objectReferenceModelDto = new ObjectReferenceModelDto("label");
        MappingObjectReferenceDto dto = new MappingObjectReferenceDto(2,"name1", objectReferenceModelDto);


        MappingObjectReferenceModel model  = modelMapper.toModel(dto);

        assertEquals(dto.getName(), model.getName());
        assertEquals(dto.getId(), model.getId());
        assertEquals(dto.getObjectReferenceModelDto().getLabel(), model.getObjectReferenceModel().getLabel());
    }
}