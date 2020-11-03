package com.bank.lienviet.domain.contract.infor;

import lombok.Data;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Data
public class ApplyingNewAccount extends ForeignTrust {

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

    private JRBeanCollectionDataSource digitalBanking;

}
