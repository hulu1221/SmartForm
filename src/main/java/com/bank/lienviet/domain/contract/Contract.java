package com.bank.lienviet.domain.contract;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Contract extends iAccountHolder implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

//    public Contract(String contractId) {
//
//    }

    private String contractId;

    private String CIF;

    private String bankAgency;

}
