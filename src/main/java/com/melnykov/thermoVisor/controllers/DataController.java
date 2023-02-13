package com.melnykov.thermoVisor.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.melnykov.thermoVisor.dto.DataDto;
import com.melnykov.thermoVisor.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @Autowired
    DataService dataService;

    @GetMapping("/data")
    public ResponseEntity<String> getData() throws JsonProcessingException {
        return new ResponseEntity<String>(dataService.getDataAsJson(), HttpStatus.OK);
    }

    @PutMapping("/data")
    public ResponseEntity<String> setData(@Validated @RequestBody DataDto newData) {
        dataService.saveNewData(newData);
        return new ResponseEntity<String>("Data updated", HttpStatus.CREATED);
    }
}
