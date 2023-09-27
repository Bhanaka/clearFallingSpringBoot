package com.example.demo.DTO.Admintation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class RoleStatusDTO {
    @JsonProperty("Id")
    private String Id ;
    @JsonProperty("Status")
    private String Status ;
}
