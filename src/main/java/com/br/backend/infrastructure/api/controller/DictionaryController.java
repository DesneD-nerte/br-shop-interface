package com.br.backend.infrastructure.api.controller;

import com.br.backend.infrastructure.api.model.response.DictionaryResponse;
import com.br.backend.infrastructure.service.DictionaryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/dictionary")
@Tag(name = "Контроллер для взаимодействия со словарями")
public class DictionaryController {
   public DictionaryService dictionaryService;

   public DictionaryController (DictionaryService dictionaryService) {
       this.dictionaryService = dictionaryService;
   }

   @GetMapping("/getAll")
   @Operation(summary = "Получить все справочники")
    public DictionaryResponse getAllDictionaries() {
        return dictionaryService.getAll();
    }
}
