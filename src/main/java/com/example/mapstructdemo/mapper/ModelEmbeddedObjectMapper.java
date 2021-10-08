package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.ModelEmbeddedObject;
import com.example.mapstructdemo.dto.ModelEmbeddedObjectDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {SimpleModelMapper.class})
public interface ModelEmbeddedObjectMapper {

    @Mapping(source = "model.label", target = "name")
    @Mapping(source = "model.simpleModel", target = "simpleModelDto")
    ModelEmbeddedObjectDto toDto(ModelEmbeddedObject model);

    @InheritInverseConfiguration
    ModelEmbeddedObject toModel(ModelEmbeddedObjectDto dto);
}
