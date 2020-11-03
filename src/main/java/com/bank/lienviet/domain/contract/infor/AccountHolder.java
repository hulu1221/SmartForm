package com.bank.lienviet.domain.contract.infor;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class AccountHolder extends ApplyingNewAccount {

    private String customerName;

    private Boolean customerGender;

    private Timestamp customerBirthday;

    private String customerBirthPlace;

    private Boolean customerResident;

    private String customerNationality;

    private String customerVerificationPapers;

    private Timestamp customerVerificationPaperDate;

    private String customerVerificationPaperPlace;

    private Boolean customerFreeVisa;

    private Timestamp customerBeginDateVisa;

    private Timestamp customerEndDateVisa;

    private String customerPermanentAddress;

    private String customerCurrentAddress;

    private String customerLandlinePhone;

    private String customerMobilePhone;

    private String customerEmail;

    //single: Độc thân;  married: Đã kết hôn;  other: Khác
    private Boolean customerMaritalStatusSingle;

    private Boolean customerMaritalStatusMarried;

    private Boolean customerMaritalStatusOther;

    private String customerMaritalStatusOtherStr;

    //Trình độ học vấn: THPT; Trung cấp; Cao đẳng; Đại học; Trên đại học
    private Boolean customerAcademicLevelHighSchool;

    private Boolean customerAcademicLevelAssociate;

    private Boolean customerAcademicLevelIntermediate;

    private Boolean customerAcademicLevelUniversity;

    private Boolean customerAcademicLevelHigherUniversity;

    //Nghề nghiệp: Nhân viên văn phòng; Công chức; Hưu trí; Học sinh, sinh viên;
    private Boolean customerJobOfficeWorker;

    private Boolean customerJobCivilServant;

    private Boolean customerJobRetired;

    private Boolean customerJobStudent;

    private Boolean customerJobSelfEmployed;

    private Boolean customerJobOther;

    private String customerJobOtherStr;

    private String customerJobPosition;

    private Boolean customerIncomeUnder10m;

    private Boolean customerIncomeFrom10To20m;

    private Boolean customerIncomeFrom20To30m;

    private Boolean customerIncomeOver30m;

    private Boolean customerIncomeViaBank;

    private String customerWorkPlace;

    private Boolean usingOverDraft;

}
