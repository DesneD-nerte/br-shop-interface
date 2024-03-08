package com.br.backend.infrastructure.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_account")
public class UserAccount {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "status")
    private Long status;

    public UserAccount(Long id, String name, String login, Long status){
        this.id = id;
        this.name = name;
        this.login = login;
        this.status = status;
    }
}
