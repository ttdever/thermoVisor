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
public class DataService  {

    @Autowired
    private ObjectMapper objectMapper;
    private DataDto dataDto;
    private boolean loggingEnabled = false;
    private final String logFileName = "logs.txt";

    public String getDataAsJson() throws JsonProcessingException {
        return mapDataDtoToJson(dataDto);
    }

    public void saveNewData(DataDto newData) {
        dataDto = newData;
        if(loggingEnabled){

        }
    }

    private void logReadingsToFile(DataDto newData) {

    }

    private String mapDataDtoToJson(DataDto from) throws JsonProcessingException {
        return objectMapper.writeValueAsString(from);
    }
}
