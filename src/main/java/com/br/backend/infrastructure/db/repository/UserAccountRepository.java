package com.br.backend.infrastructure.db.repository;

import com.br.backend.infrastructure.db.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    @Query(nativeQuery = true, value = """
            SELECT * from staff where login = :login""")
    Optional<UserAccount> findByLogin(String login);
}
