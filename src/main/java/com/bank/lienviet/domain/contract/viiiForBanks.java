package com.bank.lienviet.domain.contract;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class viiiForBanks {

    private String employeeId;

    private String accountNumberVND;

    private String accountNumberForeign;

    private String accountNumberViViet;

    private Timestamp accountOpeningDate;

    private String tellersName;

    private String surveyorName;

    private String businessHeadName;


}
