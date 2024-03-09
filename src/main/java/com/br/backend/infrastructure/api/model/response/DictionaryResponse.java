package com.br.backend.infrastructure.api.model.response;

import com.br.backend.infrastructure.db.model.dictionary.DUserAccountStatus;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DictionaryResponse implements Serializable {

    private List<DUserAccountStatus> dUserAccountStatuses;
}
