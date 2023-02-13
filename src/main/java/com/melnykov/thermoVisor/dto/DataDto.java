package com.melnykov.thermoVisor.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataDto implements Serializable {
    @NotNull
    @Size(min=64, max=64)
    private List<Float> temperatures = new ArrayList<>(Collections.nCopies(64, 0f));
}
