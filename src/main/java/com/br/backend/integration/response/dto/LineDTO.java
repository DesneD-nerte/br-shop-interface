package com.br.backend.integration.response.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LineDTO {

    @JsonProperty("line_id")
    private Long lineId;
    @JsonProperty("number")
    private String number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("region")
    private String region;
    @JsonProperty("schema_id")
    private Long schemaId;
    @JsonProperty("schema_name")
    private String schemaName;
}
