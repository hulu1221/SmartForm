package com.bank.lienviet.domain.contract;

import com.bank.lienviet.domain.contract.infor.DigitalBanking;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ContractConstructor {
    public Contract getContract() {
        Contract contract = new Contract();
        contract.setContractId("123456");
        contract.setCIF("111222");
        contract.setBankAgency("Tân Định");

        // I Thông tin chủ tài khoản
        contract.setCustomerName("Nguyễn Văn Hưởng");
        contract.setCustomerGender(true);
        contract.setCustomerBirthday(new Timestamp(System.currentTimeMillis()));
        contract.setCustomerBirthPlace("Quang Binh");
        contract.setCustomerResident(false);
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
        contract.setAccountName("accoutn name");
        contract.setAccountPlan("account plan");
        contract.setAccountTypePayment(true);
        contract.setAccountTypeReceiveSalary(false);
        contract.setAccountTypeOther(false);
        contract.setAccountTypeOtherStr("other account type");
        contract.setCurrencyTypeVND(true);
        contract.setCurrencyTypeUSD(false);
        contract.setCurrencyTypeOther(false);
        contract.setCurrencyTypeOtherStr("other currency type");

        // III Đăng ký các dịch vụ ngân hàng số
        List<DigitalBanking> listAcc = new ArrayList<>();
        DigitalBanking newAcc1 = new DigitalBanking(true, "default account 1", true, false, false, "other debit card",
                false, false, true, false, "other class", "123456789", true, false, "receiving card place", "security question", "answer",
                true, true, "mobileBankingPhoneReg1", "mobileBankingPhoneReg2", true, true, false, false, true, "bankPlusPhoneReg",
                true, true, true, true, "email@email.com", true, true, true, "0123456789");
        DigitalBanking newAcc2 = new DigitalBanking(true, "default account 2", true, false, false, "other debit card",
                false, false, true, false, "other class", "123456789", true, false, "receiving card place", "security question", "answer",
                true, true, "mobileBankingPhoneReg1", "mobileBankingPhoneReg2", true, true, false, false, true, "bankPlusPhoneReg",
                true, true, true, true, "email@email.com", true, true, true, "0123456789");

        listAcc.add(newAcc1);
        listAcc.add(newAcc2);
        JRBeanCollectionDataSource accDataSource = new JRBeanCollectionDataSource(listAcc);
        contract.setDigitalBanking(accDataSource);

        // IV Nhận ủy thác của ủy thác nước ngoài
        contract.setForeignTrust1(true);
        contract.setForeignTrust2(true);

        // VI Thông tin Người đồng sở hữu/Người giám hộ/Người được ủy quyền
        contract.setCoOwnerWithAccountHolder(true);
        contract.setGuardianOfAccountHolder(true);
        contract.setPersonAuthorizedByAccountHolder(true);
        contract.setCoName("co owner name");
        contract.setCoGender(false);
        contract.setCoBirthday(new Timestamp(System.currentTimeMillis()));
        contract.setCoBirthPlace("co-owner birth place");
        contract.setCoResident(true);
        contract.setCoNationality("Vietnam");
        contract.setRelationshipWithAccountHolder("wife");
        contract.setCoVerificationPapers("CMT");
        contract.setCoVerificationPaperDate(new Timestamp(System.currentTimeMillis()));
        contract.setCoVerificationPaperPlace("Hà nội");
        contract.setCoFreeVisa(true);
        contract.setCoBeginDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setCoEndDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setCoPermanentAddress("Hoàng Mai, Hà nội");
        contract.setCoCurrentAddress("Hà nội, Việt Nam");
        contract.setCoLandlinePhone("024568789");
        contract.setCoMobilePhone("036987456");
        contract.setCoEmail("email2@email.com");
        contract.setCoJobOfficeWorker(true);
        contract.setCoJobCivilServant(false );
        contract.setCoJobRetired(false);
        contract.setCoJobStudent(false);
        contract.setCoJobOther(false);
        contract.setCoJobSelfEmployed(false);
        contract.setCoJobOtherStr("công việc khác");
        contract.setCoJobPosition("vị trí làm việc");
        contract.setCoWorkPlace("nơi làm việc");
        contract.setAuthorizationScopeAll(false);
        contract.setAuthorizationScopeOther(true);
        contract.setAuthorizationScopeOtherStr("phạm vi ủy quyền khác");
        contract.setAuthorizationPeriodByDate(true);
        contract.setAuthorizationPeriodWaitUntilDone(true);
        contract.setAuthorizationPeriodFromDate(true);


        // VI Thông tin FATCA
        contract.setFatCa1(true);
        contract.setFatCa2(true);

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
