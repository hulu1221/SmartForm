package com.bank.lienviet.domain.contract;

import com.bank.lienviet.domain.contract.infor.AccountHolder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * {All component of a contract}
 *
 * I    AccountHolder
 * II   ApplyingNewAccount
 * III  DigitalBanking
 * IV   ForeignTrust
 * V    CoOwnerGuardianAuthorizedPerson
 * VI   FATCA
 * VII  CustomerConfirmation
 * VIII ForBanks
 */

@Data
@NoArgsConstructor
public class Contract extends AccountHolder implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    private String contractId;

    private String CIF;

    private String bankAgency;
}

