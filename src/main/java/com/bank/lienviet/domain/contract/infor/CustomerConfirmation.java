package com.bank.lienviet.domain.contract.infor;

import lombok.Data;

@Data
public class CustomerConfirmation extends ForBanks {

    private Boolean confirmation2;

    private String accountHolderName;

    private Boolean theCoOwner;

    private Boolean theGuardian;

    private Boolean theAuthorizedPerson;

    private String otherOwnerName;
}
