package com.melnykov.thermoVisor.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melnykov.thermoVisor.dto.DataDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class DataService {

    @Autowired
    ObjectMapper objectMapper;

    DataDto dataDto;

    public String getDataAsJson() throws JsonProcessingException {
        return mapDataDtoToJson(dataDto);
    }

    private String mapDataDtoToJson(DataDto from) throws JsonProcessingException {
        return objectMapper.writeValueAsString(from);
    }
}
