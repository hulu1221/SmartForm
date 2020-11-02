package com.bank.lienviet.services;

import com.bank.lienviet.domain.contract.Contract;
import com.bank.lienviet.domain.contract.DigitalBanking;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.web.util.ContentTypeMappingExtensionsRegistryFactory;
import org.springframework.jca.cci.CciOperationNotSupportedException;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ContractController {

    @GetMapping("/contract")
    public String generateContractReportPdf() throws FileNotFoundException, JRException {
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
        contract.setIssuingNewCard(true);
        contract.setDefaultAccount("default account");
        contract.setDebitCardDomestic(true);
        contract.setDebitCardInternational(false);
        contract.setDebitCardOther(false);
        contract.setDebitCardOtherStr("other debit card type");
        contract.setCardClassStandard(false);
        contract.setCardClassGold(false);
        contract.setCardClassDiamond(true);
        contract.setCardClassOther(false);
        contract.setCardClassOtherStr("other card class");
        contract.setEmbossedName("NGUYEN VAN HUONG");
        contract.setIssuingFormNormally(true);
        contract.setIssuingFormImmediately(false);
        contract.setReceivingCardPlace("receiving card place");
        contract.setSecurityQuestion("your security question");
        contract.setAnswerSecurityQuestion("answer for security question");
        contract.setSmsBanking(true);
        contract.setMobileBanking(true);
        contract.setMobileBankingPhoneReg1("0123456789");
        contract.setMobileBankingPhoneReg2("0223456798");
        contract.setAccountBalanceFluctuation(true);
        contract.setMobileBankingSilver(false);
        contract.setMobileBankingGold(false);
        contract.setMobileBankingDiamond(true);
        contract.setBankPlus(true);
        contract.setBankPlusPhoneReg("0369852147");
        contract.setInternetBanking(true);
        contract.setInternetBankingSilver(false);
        contract.setInternetBankingGold(false);
        contract.setInternetBankingDiamond(true);
        contract.setEmailForPassword("hulu1221@gmail.com");
        contract.setSecurityMethodPhoneNumber(true);
        contract.setSecurityMethodTokenKey(true);
        contract.setViViet(true);
        contract.setViVietPhoneReg("0258963147");

        // IV Nhận ủy thác của ủy thác nước ngoài
        contract.setForeignTrust1(true);
        contract.setForeignTrust2(true);

        // VI Thông tin Người đồng sở hữu/Người giám hộ/Người được ủy quyền
        contract.setCoOwnerWithAccountHolder(true);
        contract.setGuardianOfAccountHolder(true);
        contract.setPersonAuthorizedByAccountHolder(true);
        contract.setVName("co-owner name");
        contract.setVGender(false);
        contract.setVBirthday(new Timestamp(System.currentTimeMillis()));
        contract.setVBirthPlace("co-owner birth place");
        contract.setVResident(true);
        contract.setVNationality("Vietnam");
        contract.setRelationshipWithAccountHolder("wife");
        contract.setVVerificationPapers("CMT");
        contract.setVVerificationPaperDate(new Timestamp(System.currentTimeMillis()));
        contract.setVVerificationPaperPlace("Hà nội");
        contract.setVFreeVisa(true);
        contract.setVStartDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setVEndDateVisa(new Timestamp(System.currentTimeMillis()));
        contract.setVPermanentAddress("Hoàng Mai, Hà nội");
        contract.setVCurrentAddress("Hà nội, Việt Nam");
        contract.setVLandlinePhone("024568789");
        contract.setVMobilePhone("036987456");
        contract.setVEmail("email2@email.com");
        contract.setVJobOfficeWorker(true);
        contract.setVJobCivilServant(false );
        contract.setVJobRetired(false);
        contract.setVJobStudent(false);
        contract.setVJobOther(false);
        contract.setVJobSelfEmployed(false);
        contract.setVJobOtherStr("công việc khác");
        contract.setVJobPosition("vị trí làm việc");
        contract.setVWorkPlace("nơi làm việc");
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

        System.out.println(contract);
        return exportReport(contract);
    }

    @GetMapping("/digitalbanking")
    public DigitalBanking getDigitalBanking() {
        DigitalBanking newAcc = new DigitalBanking(true, "default account 1", true, false, false, "other debit card",
                false, false, true, false, "other class", "123456789", true, false, "receiving card place", "security question", "answer",
                true, true, "mobileBankingPhoneReg1", "mobileBankingPhoneReg2", true, true, false, false, true, "bankPlusPhoneReg",
                true, true, true, true, "email@email.com", true, true, true, "0123456789");
        System.out.println(newAcc);
        return newAcc;
    }


    public String exportReport(Contract contract) throws FileNotFoundException, JRException {
        File file = ResourceUtils.getFile("classpath:DeNghiKiemHopDong.jrxml");
        String path = "D:\\DEV\\printed reports\\";

        // list reg new account
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
//        listAcc.add(newAcc2);

        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource accDataSource = new JRBeanCollectionDataSource(listAcc);

        Map<String, Object> parameters = new HashMap<String, Object>();
        // I Thong tin chu tai khoan
        parameters.put("ContractNo", contract.getContractId());
        parameters.put("CIF", contract.getCIF());
        parameters.put("BankAgency", contract.getBankAgency());
        parameters.put("CustomerName", contract.getCustomerName());
        parameters.put("CustomerGender", contract.getCustomerGender());
        parameters.put("CustomerResident", contract.getCustomerResident());
        parameters.put("CustomerBirthday", contract.getCustomerBirthday());
        parameters.put("CustomerBirthPlace", contract.getCustomerBirthPlace());
        parameters.put("CustomerNationality", contract.getCustomerNationality());
        parameters.put("VerificationPapers", contract.getCustomerVerificationPapers());
        parameters.put("VerificationPaperDate", contract.getCustomerVerificationPaperDate());
        parameters.put("VerificationPaperPlace", contract.getCustomerVerificationPaperPlace());
        parameters.put("CustomerFreeVisa", contract.getCustomerFreeVisa());
        parameters.put("CustomerBeginDateVisa", contract.getCustomerBeginDateVisa());
        parameters.put("CustomerEndDateVisa", contract.getCustomerEndDateVisa());
        parameters.put("CustomerPermanentAddress", contract.getCustomerPermanentAddress());
        parameters.put("CustomerCurrentAddress", contract.getCustomerCurrentAddress());
        parameters.put("CustomerLandlinePhone", contract.getCustomerLandlinePhone());
        parameters.put("CustomerMobilePhone", contract.getCustomerMobilePhone() );
        parameters.put("CustomerEmail", contract.getCustomerEmail());
        parameters.put("CustomerMaritalStatusSingle", contract.getCustomerMaritalStatusSingle());
        parameters.put("CustomerMaritalStatusMarried", contract.getCustomerMaritalStatusMarried());
        parameters.put("CustomerMaritalStatusOther", contract.getCustomerMaritalStatusOther());
        parameters.put("CustomerMaritalStatusOtherStr", contract.getCustomerMaritalStatusOtherStr());
        parameters.put("CustomerAcademicLevelHighSchool", contract.getCustomerAcademicLevelHighSchool());
        parameters.put("CustomerAcademicLevelAssociate", contract.getCustomerAcademicLevelAssociate());
        parameters.put("CustomerAcademicLevelIntermediate", contract.getCustomerAcademicLevelIntermediate());
        parameters.put("CustomerAcademicLevelUniversity", contract.getCustomerAcademicLevelUniversity());
        parameters.put("CustomerAcademicLevelHigherUniversity", contract.getCustomerAcademicLevelHigherUniversity());
        parameters.put("CustomerJobOfficeWorker", contract.getCustomerJobOfficeWorker());
        parameters.put("CustomerJobCivilServant", contract.getCustomerJobCivilServant());
        parameters.put("CustomerJobRetired", contract.getCustomerJobRetired());
        parameters.put("CustomerJobStudent", contract.getCustomerJobStudent());
        parameters.put("CustomerJobSelfEmployed", contract.getCustomerJobSelfEmployed());
        parameters.put("CustomerJobOther", contract.getCustomerJobOther());
        parameters.put("CustomerJobOtherStr", contract.getCustomerJobOtherStr());
        parameters.put("CustomerJobPosition", contract.getCustomerJobPosition());
        parameters.put("CustomerIncomeUnder10m", contract.getCustomerIncomeUnder10m());
        parameters.put("getCustomerIncomeFrom10to20m", contract.getCustomerIncomeFrom10To20m());
        parameters.put("CustomerIncomeFrom20To30m", contract.getCustomerIncomeFrom20To30m());
        parameters.put("CustomerIncomeOver30m", contract.getCustomerIncomeOver30m());
        parameters.put("CustomerIncomeViaBank", contract.getCustomerIncomeViaBank());
        parameters.put("CustomerWorkPlace", contract.getCustomerWorkPlace());
        parameters.put("UsingOverDraft", contract.getUsingOverDraft());

        // II Dang ky mo tai khoan
        parameters.put("AccountName", contract.getAccountName());
        parameters.put("AccountPlan", contract.getAccountPlan());
        parameters.put("AccountTypePayment", contract.getAccountTypePayment());
        parameters.put("AccountTypeReceiveSalary", contract.getAccountTypeReceiveSalary());
        parameters.put("AccountTypeOther", contract.getAccountTypeOther());
//        parameters.put(())







        // data source for list acount Customer
        parameters.put("accDataSource", accDataSource);

        //
        //JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, accDataSource);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//DeNghiKiemHopDong.pdf");
        return "printed document path: " + path;
    }
}
