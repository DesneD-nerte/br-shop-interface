package com.br.backend.core.entities;

import lombok.*;

@Getter
@Setter
public class UserAccount {
    private long id;
    private String name;
    private String login;
    private long status;
}
