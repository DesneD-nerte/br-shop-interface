package com.br.backend.integration.response;

import com.br.backend.integration.response.dto.LineDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LineResponse {

    @JsonProperty("result")
    public Integer result;
    @JsonProperty("lines")
    public List<LineDTO> lines;
}
