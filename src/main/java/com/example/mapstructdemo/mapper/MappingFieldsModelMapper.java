package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.MappingFieldsModel;
import com.example.mapstructdemo.dto.MappingFieldsModelDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MappingFieldsModelMapper {

    @Mapping(source = "model.id", target = "modelId")
    @Mapping(source = "model.name", target = "modelName")
    MappingFieldsModelDto toDto(MappingFieldsModel model);

    @Mapping(source = "dto.modelId", target = "id")
    @Mapping(source = "dto.modelName", target = "name")
    MappingFieldsModel toModel(MappingFieldsModelDto dto);

}
