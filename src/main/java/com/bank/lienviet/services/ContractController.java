package com.bank.lienviet.services;

import com.bank.lienviet.domain.contract.ContractConstructor;
import com.bank.lienviet.domain.contract.ContractReportBuilder;
import net.sf.jasperreports.engine.*;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ContractController {

    @GetMapping("/contract")
    public String generateContractReportPdf() throws FileNotFoundException, JRException {
        ContractReportBuilder report = new ContractReportBuilder(new ContractConstructor().getContract());
        return exportReport(report);
    }

    public String exportReport(ContractReportBuilder report) throws FileNotFoundException, JRException {
        File file = ResourceUtils.getFile("classpath:HopDongPro.jrxml");
        String path = "D:\\DEV\\printed reports\\";
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("formId", "CN/2019-01/MBGD");
        parameters.put("formName", "ĐỀ NGHỊ KIÊM HỢP ĐỒNG\n" +"MỞ TÀI KHOẢN VÀ SỬ DỤNG DỊCH VỤ TÀI KHOẢN");
        parameters.put("formInfor", "(DÀNH CHO KHÁCH HÀNG CÁ NHÂN)");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, report.getReportDataSource());
        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//DeNghiKiemHopDong.pdf");
        return "printed document path: " + path;
    }
}
