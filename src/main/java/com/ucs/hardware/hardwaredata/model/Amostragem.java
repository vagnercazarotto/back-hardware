package com.ucs.hardware.hardwaredata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Amostragem {

    @JsonProperty("tensao")
    private float tensao;

    @JsonProperty("corrente")
    private float corrente;

}
