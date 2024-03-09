package com.br.backend.core.services;

import com.br.backend.infrastructure.db.model.UserAccount;
import com.br.backend.infrastructure.db.repository.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class StaffService {
    private final UserAccountRepository authRepository;

    public Optional<UserAccount> getUser(Long userid) {
        Optional<UserAccount> staff = authRepository.findById(userid);

        log.info(staff.map((UserAccount::getName)).orElse("Пользователь не найден"));
        log.debug(staff.get().getName());

        return staff;
    }
}
