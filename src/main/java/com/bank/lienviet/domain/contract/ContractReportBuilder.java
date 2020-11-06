package com.bank.lienviet.domain.contract;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.List;

public class ContractReportBuilder {
    private Contract contract;

    public ContractReportBuilder(Contract contract) {
        this.contract = contract;
    }

    public JRBeanCollectionDataSource getReportDataSource() {
        List<Contract> contractList = new ArrayList<>();
        contractList.add(this.contract);
        return new JRBeanCollectionDataSource(contractList);
    }
}
