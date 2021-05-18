package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.ModelEmbeddedCollection;
import com.example.mapstructdemo.dto.ModelEmbeddedCollectionDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { SimpleModelMapper.class })
public interface ModelEmbeddedCollectionMapper {

    @Mapping(source = "model.label", target = "name")
    @Mapping(source = "model.simpleModels", target = "simpleModelDtos")
    ModelEmbeddedCollectionDto toDto(ModelEmbeddedCollection model);

    @InheritInverseConfiguration
    ModelEmbeddedCollection toModel(ModelEmbeddedCollectionDto dto);
}
