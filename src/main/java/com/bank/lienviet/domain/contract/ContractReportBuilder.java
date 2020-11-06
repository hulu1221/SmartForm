package com.bank.lienviet.domain.contract;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractReportBuilder {
    private Contract contract;

    public ContractReportBuilder(Contract contract) {
        this.contract = contract;
    }

    public JRBeanCollectionDataSource getReportDataSource() {
        List<Contract> contractList = new ArrayList<>();
        contractList.add(this.contract);
        return new JRBeanCollectionDataSource(contractList);
    }
    public String exportReport() throws FileNotFoundException, JRException {
        File file = ResourceUtils.getFile("classpath:HopDongPro.jrxml");

//        File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(reportType.getFileResourcePath())).getFile());

        String path = "D:\\DEV\\printed reports\\";
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("formId", "CN/2019-01/MBGD");
        parameters.put("formName", "ĐỀ NGHỊ KIÊM HỢP ĐỒNG\n" +"MỞ TÀI KHOẢN VÀ SỬ DỤNG DỊCH VỤ TÀI KHOẢN");
        parameters.put("formInfor", "(DÀNH CHO KHÁCH HÀNG CÁ NHÂN)");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, getReportDataSource());
        JasperExportManager.exportReportToPdfFile(jasperPrint, path +  "//DeNghiKiemHopDong.pdf");
        return "printed document path: " + path;
    }
}
