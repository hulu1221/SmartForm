package com.bank.lienviet.domain.contract.infor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCoOwner {

    private Boolean coOwnerWithAccountHolder;

    private Boolean guardianOfAccountHolder;

    private Boolean personAuthorizedByAccountHolder;

    private String coName;

    private Boolean coGender;

    private Timestamp coBirthday;

    private String coBirthPlace;

    private Boolean coResident;

    private String coNationality;

    private String relationshipWithAccountHolder;

    private String coVerificationPapers;

    private Timestamp coVerificationPaperDate;

    private String coVerificationPaperPlace;

    private Boolean coFreeVisa;

    private Timestamp coBeginDateVisa;

    private Timestamp coEndDateVisa;

    private String coPermanentAddress;

    private String coCurrentAddress;

    private String coLandlinePhone;

    private String coMobilePhone;

    private String coEmail;

    private Boolean coJobOfficeWorker;

    private Boolean coJobCivilServant;

    private Boolean coJobRetired;

    private Boolean coJobStudent;

    private Boolean coJobSelfEmployed;

    private Boolean coJobOther;

    private String coJobOtherStr;

    private String coJobPosition;

    private String coWorkPlace;

    private Boolean authorizationScopeAll;

    private Boolean authorizationScopeOther;

    private String authorizationScopeOtherStr;

    private Boolean authorizationPeriodByDate;

    private Timestamp authorizationPeriodByDateBegin;

    private Timestamp authorizationPeriodByDateEnd;

    private Boolean authorizationPeriodWaitUntilDone;

    private Timestamp authorizationPeriodFromDateBegin;

    private Boolean authorizationPeriodFromDate;

}
