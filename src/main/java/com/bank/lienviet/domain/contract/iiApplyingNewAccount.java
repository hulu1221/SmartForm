package com.bank.lienviet.domain.contract;

import lombok.Data;

@Data
public class iiApplyingNewAccount extends iiiDigitalBanking {

    private String accountName;

    private String accountPlan;

    private Boolean accountTypePayment;

    private Boolean accountTypeReceiveSalary;

    private Boolean accountTypeOther;

    private String accountTypeOtherStr;

    private Boolean currencyTypeVND;

    private Boolean currencyTypeUSD;

    private Boolean currencyTypeOther;

    private String currencyTypeOtherStr;

}
