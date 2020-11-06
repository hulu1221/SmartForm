package com.bank.lienviet.domain.contract.infor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor()
@AllArgsConstructor()
public class AccountRegistration {

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
