package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.SimpleModel;
import com.example.mapstructdemo.dto.SimpleModelDto;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleModelMapper {
    SimpleModelDto sourceToDestination(SimpleModel source);

    SimpleModel destinationToSource(SimpleModelDto destination);
}
