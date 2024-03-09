package com.br.backend.infrastructure.service;

import com.br.backend.infrastructure.api.model.response.DictionaryResponse;
import com.br.backend.infrastructure.db.model.dictionary.DUserAccountStatus;
import com.br.backend.infrastructure.db.repository.dictionary.DUserAccountStatusRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DictionaryService {
    private final DUserAccountStatusRepository dUserAccountStatusRepository;

    public DictionaryService (DUserAccountStatusRepository dUserAccountStatusRepository) {
        this.dUserAccountStatusRepository = dUserAccountStatusRepository;
    }

    public DictionaryResponse getAll() {
        return DictionaryResponse.builder().dUserAccountStatuses(dUserAccountStatusRepository.findAll()).build();
    }

}
