package com.bank.lienviet.services;

import com.bank.lienviet.domain.contract.Contract;
import com.bank.lienviet.domain.contract.ContractConstructor;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ContractController {

    @GetMapping("/contract")
    public String generateContractReportPdf() throws FileNotFoundException, JRException {
        ContractConstructor contract = new ContractConstructor();
        System.out.println(contract.getContract());
        return exportReport(contract.getContract());
    }

    public String exportReport(Contract contract) throws FileNotFoundException, JRException {
        File file = ResourceUtils.getFile("classpath:HopDongPro.jrxml");
        String path = "D:\\DEV\\printed reports\\";

        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        Map<String, Object> parameters = new HashMap<String, Object>();

        parameters.put("formId", "CN/2019-01/MBGD");
        parameters.put("formName", "ĐỀ NGHỊ KIÊM HỢP ĐỒNG\n" +"MỞ TÀI KHOẢN VÀ SỬ DỤNG DỊCH VỤ TÀI KHOẢN");
        parameters.put("formInfor", "(DÀNH CHO KHÁCH HÀNG CÁ NHÂN)");

        List<Contract> contractList = new ArrayList<>();
        contractList.add(contract);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(contractList));
        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//DeNghiKiemHopDong.pdf");
//        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//HopDongPro.pdf");
        return "printed document path: " + path;
    }
}
