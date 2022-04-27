package com.quiz.persistence.mapper;

import com.quiz.domain.Option;
import com.quiz.persistence.entity.Opcion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface OptionMapper {
    @Mappings({
            @Mapping(source = "idOpcion", target = "optionId"),
            @Mapping(source = "idPregunta", target = "questionId"),
            @Mapping(source = "contenidoOpcion", target = "optionContent"),
    })
    Option toOption(Opcion opcion);

    @InheritInverseConfiguration
    Opcion toOpcion(Option option);

}
