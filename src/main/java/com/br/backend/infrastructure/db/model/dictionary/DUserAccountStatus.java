package com.br.backend.infrastructure.db.model.dictionary;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "d_user_account_status")
public class DUserAccountStatus {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

}
