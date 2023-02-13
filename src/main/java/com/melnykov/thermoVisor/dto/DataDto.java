package com.melnykov.thermoVisor.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DataDto {
    @NotNull
    @Size(min=40, max=40)
    private List<Float> temperatures;
    @NotNull
    @Size(min=40, max=40)
    private List<Integer> colors;
    @NotNull
    private float max;
    @NotNull
    private float avg;
    @NotNull
    private float min;
}
