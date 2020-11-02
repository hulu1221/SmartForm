package com.bank.lienviet.domain.contract;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class vCoOwnerGuardianAuthorizedPerson extends viFATCA {

    private Boolean coOwnerWithAccountHolder;

    private Boolean guardianOfAccountHolder;

    private Boolean personAuthorizedByAccountHolder;

    private String vName;

    private Boolean vGender;

    private Timestamp vBirthday;

    private String vBirthPlace;

    private Boolean vResident;

    private String vNationality;

    private String relationshipWithAccountHolder;

    private String vVerificationPapers;

    private Timestamp vVerificationPaperDate;

    private String vVerificationPaperPlace;

    private Boolean vFreeVisa;

    private Timestamp vStartDateVisa;

    private Timestamp vEndDateVisa;

    private String vPermanentAddress;

    private String vCurrentAddress;

    private String vLandlinePhone;

    private String vMobilePhone;

    private String vEmail;

    private Boolean vJobOfficeWorker;

    private Boolean vJobCivilServant;

    private Boolean vJobRetired;

    private Boolean vJobStudent;

    private Boolean vJobSelfEmployed;

    private Boolean vJobOther;

    private String vJobOtherStr;

    private String vJobPosition;

    private String vWorkPlace;

    private Boolean authorizationScopeAll;

    private Boolean authorizationScopeOther;

    private String authorizationScopeOtherStr;

    private Boolean authorizationPeriodByDate;

    private Boolean authorizationPeriodWaitUntilDone;

    private Boolean authorizationPeriodFromDate;

}
