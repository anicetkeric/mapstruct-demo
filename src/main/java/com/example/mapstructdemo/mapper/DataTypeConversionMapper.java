package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.DataTypeConversionModel;
import com.example.mapstructdemo.dto.DataTypeConversionDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DataTypeConversionMapper {

    @Mapping(target = "startDate", source = "model.startDate",
            dateFormat = "dd-MM-yyyy HH:mm:ss")
    DataTypeConversionDto toDto(DataTypeConversionModel model);

    @InheritInverseConfiguration
    DataTypeConversionModel toModel(DataTypeConversionDto dto);
}
