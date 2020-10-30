package com.bank.lienviet.domain.contract;

import lombok.Data;

@Data
public class viiCustomerConfirmation extends viiiForBanks {

    private Boolean confirmation2;

    private String accountHolderName;

    private Boolean theCoOwner;

    private Boolean theGuardian;

    private Boolean theAuthorizedPerson;

    private String otherOwnerName;
}
