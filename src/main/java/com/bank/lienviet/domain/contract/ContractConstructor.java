package com.bank.lienviet.domain.contract;

import com.bank.lienviet.domain.contract.infor.AccountCoOwner;
import com.bank.lienviet.domain.contract.infor.AccountRegistration;
import com.bank.lienviet.domain.contract.infor.DigitalBanking;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ContractConstructor {
    public Contract getContract() {
        Contract contract = new Contract();
        contract.setContractId("123456");
        contract.setCIF("111222");
        contract.setBankAgency("Tân Định");
        contract.setDate(new Timestamp(System.currentTimeMillis()));

        // I Thông tin chủ tài khoản
        contract.setCustomerName("Nguyễn Văn Hưởng");
        contract.setCustomerGender(true);
        contract.setCustomerBirthday(new Timestamp(System.currentTimeMillis()));
        contract.setCustomerBirthPlace("Quang Binh");
        contract.setCustomerResident(true);
        contract.setCustomerNationality("Việt Nam");
        contract.setCustomerVerificationPapers("CMND");
        contract.setCustomerVerificationPaperDate(new Timestamp(System.currentTimeMillis()));
        contract.setCustomerVerificationPaperPlace("Hà nội");
        contract.setCustomerFreeVisa(true);
        contract.setCustomerBeginDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setCustomerEndDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setCustomerPermanentAddress("Hà Nội, Việt Nam");
        contract.setCustomerCurrentAddress("332 Truong Dinh, Hoang Mai, Hà Nội");
        contract.setCustomerLandlinePhone("0123456789");
        contract.setCustomerMobilePhone("0987654321");
        contract.setCustomerEmail("email@email.com");
        contract.setCustomerMaritalStatusSingle(true);
        contract.setCustomerMaritalStatusMarried(false);
        contract.setCustomerMaritalStatusOther(false);
        contract.setCustomerMaritalStatusOtherStr("other marital status");
        contract.setCustomerAcademicLevelHighSchool(false);
        contract.setCustomerAcademicLevelAssociate(false);
        contract.setCustomerAcademicLevelIntermediate(false);
        contract.setCustomerAcademicLevelUniversity(true);
        contract.setCustomerAcademicLevelHigherUniversity(false);
        contract.setCustomerJobOfficeWorker(true);
        contract.setCustomerJobCivilServant(false);
        contract.setCustomerJobRetired(false);
        contract.setCustomerJobStudent(false);
        contract.setCustomerJobSelfEmployed(false);
        contract.setCustomerJobOther(false);
        contract.setCustomerJobOtherStr("Other job");
        contract.setCustomerJobPosition("job position");
        contract.setCustomerIncomeUnder10m(false);
        contract.setCustomerIncomeFrom10To20m(false);
        contract.setCustomerIncomeFrom20To30m(false);
        contract.setCustomerIncomeOver30m(true);
        contract.setCustomerIncomeViaBank(false);
        contract.setCustomerWorkPlace("customer work place");
        contract.setUsingOverDraft(true);

        // II Đăng ký mở tài khoản
        List<AccountRegistration> accRegList = new ArrayList<>();
        AccountRegistration reg1 = new AccountRegistration(
                "account name 1",
                "account plan 1",
                true,
                false,
                false,
                "",
                true,
                false,
                false,
                ""
                );
        AccountRegistration reg2 = new AccountRegistration(
                "account name 2",
                "account plan 2",
                false,
                true,
                false,
                "",
                false,
                true,
                false,
                ""
        );
        AccountRegistration reg3 = new AccountRegistration(
                "account name 3",
                "account plan 3",
                false,
                false,
                true,
                "other account type",
                false,
                false,
                true,
                "other currency type"
        );
        accRegList.add(reg1);
//        accRegList.add(reg2);
//        accRegList.add(reg3);
//        accRegList.add(reg1);
//        accRegList.add(reg2);
//        accRegList.add(reg3);
//        accRegList.add(reg3);
        contract.setAccountRegistration(accRegList);

        // III Đăng ký các dịch vụ ngân hàng số
        List<DigitalBanking> listAcc = new ArrayList<>();

        List<DigitalBanking> listAcc1 = new ArrayList<>();
        List<DigitalBanking> listAcc2 = new ArrayList<>();
        DigitalBanking newAcc1 = new DigitalBanking(
                true,
                "default account 1",
                true,
                false,
                false,
                "other debit card",
                false,
                false,
                true,
                false,
                "other class",
                "12345678",
                true,
                false,
                "receiving card place",
                "security question",
                "answer",
                true,
                true,
                "mobileBankingPhoneReg1",
                "mobileBankingPhoneReg2",
                true,
                true,
                false,
                false,
                true,
                "bankPlusPhoneReg",
                true,
                true,
                true,
                true,
                "email@email.com",
                true,
                "0355848043",
                true,
                true,
                "0123456789");
        DigitalBanking newAcc2 = new DigitalBanking(
                true,
                "default account 2",
                true,
                false,
                false,
                "other debit card",
                false,
                false,
                true,
                false,
                "other class",
                "NGUYEN VAN HUONG 87654321",
                true,
                false,
                "receiving card place",
                "security question",
                "answer",
                true,
                true,
                "mobileBankingPhoneReg1",
                "mobileBankingPhoneReg2",
                true,
                true,
                false,
                false,
                true,
                "bankPlusPhoneReg",
                true,
                true,
                true,
                true,
                "email@email.com",
                true,
                "0355848044",
                true,
                true,
                "0123456789");
        DigitalBanking newAcc3 = new DigitalBanking(
                true,
                "default account 3",
                true,
                false,
                false,
                "other debit card",
                false,
                false,
                true,
                false,
                "other class",
                "NGUYEN VAN HUONG 87654321",
                true,
                false,
                "receiving card place",
                "security question",
                "answer",
                true,
                true,
                "mobileBankingPhoneReg1",
                "mobileBankingPhoneReg2",
                true,
                true,
                false,
                false,
                true,
                "bankPlusPhoneReg",
                true,
                true,
                true,
                true,
                "email@email.com",
                true,
                "0355848045",
                true,
                true,
                "0123456789");
        listAcc.add(newAcc1);
//        listAcc.add(newAcc2);
//        listAcc.add(newAcc3);

        contract.setDigitalBanking(listAcc);
        // IV Nhận ủy thác của ủy thác nước ngoài
        contract.setForeignTrust1(true);
        contract.setForeignTrust2(true);

        // VI Thông tin Người đồng sở hữu/Người giám hộ/Người được ủy quyền
        List<AccountCoOwner> coOwnersList = new ArrayList<>();
        AccountCoOwner coOwner1 = new AccountCoOwner(
                true,
                false,
                false,
                "co owner name 1",
                true,
                new Timestamp(System.currentTimeMillis()),
                "co owner birth place",
                true,
                "Vietnam",
                "relationship 1",
                "GTXM1",
                new Timestamp(System.currentTimeMillis()),
                "paper place",
                true,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                "permanent address",
                "current address",
                "01234657",
                "031245545",
                "email@email.com",
                true,
                true,
                true,
                true,
                true,
                true,
                "other job",
                "job position",
                "co-owner work place",
                true,
                true,
                " other scope",
                true,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                true,
                new Timestamp(System.currentTimeMillis()),
                true
                );

        AccountCoOwner coOwner2 = new AccountCoOwner(
                true,
                false,
                false,
                "co owner name 2",
                true,
                new Timestamp(System.currentTimeMillis()),
                "co owner birth place",
                true,
                "Vietnam",
                "relationship 1",
                "GTXM1",
                new Timestamp(System.currentTimeMillis()),
                "paper place",
                true,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                "permanent address",
                "current address",
                "01234657",
                "031245545",
                "email@email.com",
                true,
                true,
                true,
                true,
                true,
                true,
                "other job",
                "job position",
                "co-owner work place",
                true,
                true,
                " other scope",
                true,
                new Timestamp(System.currentTimeMillis()),
                new Timestamp(System.currentTimeMillis()),
                true,
                new Timestamp(System.currentTimeMillis()),
                true
        );
        coOwnersList.add(coOwner1);
//        coOwnersList.add(coOwner2);
//        coOwnersList.add(coOwner2);
        contract.setCoOwnerList(coOwnersList);

        // VI Thông tin FATCA
        contract.setFatCa1(false);
        contract.setFatCa2(false);

        // VII Xác nhận của khách hàng
        contract.setConfirmation2(true);
        contract.setAccountHolderName("tên chu tàn khoản");
        contract.setTheCoOwner(true);
        contract.setTheGuardian(false);
        contract.setTheAuthorizedPerson(false);
        contract.setOtherOwnerName("other owner name");

        //VIII Dành cho ngân hàng
        contract.setEmployeeId("14569787");
        contract.setAccountNumberVND("0154554");
        contract.setAccountNumberForeign("465465465");
        contract.setAccountNumberViViet("454546545");
        contract.setAccountOpeningDate(new Timestamp(System.currentTimeMillis()));
        contract.setTellersName("Giao dịch viên");
        contract.setSurveyorName("Kiểm soát viên");
        contract.setBusinessHeadName("Trưởng đơn vị kinh doanh");
        return contract;
    }
}
