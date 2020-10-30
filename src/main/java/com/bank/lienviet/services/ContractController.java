package com.bank.lienviet.services;

import com.bank.lienviet.domain.contract.Contract;
import com.bank.lienviet.domain.contract.DigitalBanking;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
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

        parameters.put("ContractNo", contract.getContractId());
        parameters.put("CIF", contract.getCIF());
        parameters.put("BankAgency", contract.getBankAgency());
        parameters.put("CustomerName", contract.getCustomerName());
        parameters.put("CustomerGender", contract.getCustomerGender());
        parameters.put("CustomerResident", contract.getCustomerResident());

        // data source for list acount
        parameters.put("accDataSource", accDataSource);

        //
        //JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, accDataSource);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//DeNghiKiemHopDong.pdf");
        return "printed document path: " + path;
    }
}
