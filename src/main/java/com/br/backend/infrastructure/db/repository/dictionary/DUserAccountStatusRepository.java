package com.br.backend.infrastructure.db.repository.dictionary;

import com.br.backend.infrastructure.db.model.dictionary.DUserAccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DUserAccountStatusRepository extends JpaRepository<DUserAccountStatus, Integer> {
}
