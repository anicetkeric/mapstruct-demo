package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.MappingObjectReferenceModel;
import com.example.mapstructdemo.domain.ObjectReferenceModel;
import com.example.mapstructdemo.dto.MappingObjectReferenceDto;
import com.example.mapstructdemo.dto.ObjectReferenceModelDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MappingObjectReferenceMapper {

    @Mapping(target = "objectReferenceModelDto", source = "model.objectReferenceModel")
    MappingObjectReferenceDto toDto(MappingObjectReferenceModel model);

    @InheritInverseConfiguration
    MappingObjectReferenceModel toModel(MappingObjectReferenceDto dto);


    ObjectReferenceModelDto toDto(ObjectReferenceModel model);

    ObjectReferenceModel toModel(ObjectReferenceModelDto dto);
}
