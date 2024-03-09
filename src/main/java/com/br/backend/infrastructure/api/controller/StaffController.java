package com.br.backend.infrastructure.api.controller;

import com.br.backend.core.services.StaffService;
import com.br.backend.infrastructure.db.model.UserAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@Component
//@RequiredArgsConstructor
@RequestMapping("/api/staff")
public class StaffController {
    private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/{id}")
    public Optional<UserAccount> findById(@PathVariable long id) {
        return staffService.getUser(id);
    }

}
