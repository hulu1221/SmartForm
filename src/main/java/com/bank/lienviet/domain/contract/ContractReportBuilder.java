package com.bank.lienviet.domain.contract;

import com.bank.lienviet.report.ReportExporter;
import com.bank.lienviet.report.ReportFiller;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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
    public String exportReport() {

        ReportFiller reportFiller = new ReportFiller();
        reportFiller.setReportFileName("HopDongPro.jrxml");
        reportFiller.compileReport();
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("formId", "CN/2019-01/MBGD");
        parameters.put("formName", "ĐỀ NGHỊ KIÊM HỢP ĐỒNG\n" +"MỞ TÀI KHOẢN VÀ SỬ DỤNG DỊCH VỤ TÀI KHOẢN");
        parameters.put("formInfor", "(DÀNH CHO KHÁCH HÀNG CÁ NHÂN)");

        reportFiller.setParameters(parameters);
        reportFiller.setDataSource(getReportDataSource());
        reportFiller.fillReport();

        ReportExporter reportExporter = new ReportExporter();
        reportExporter.setJasperPrint(reportFiller.getJasperPrint());

        reportExporter.exportToPdf("DeNghiKiemHopDong.pdf", "Alpha");
        return "printed document on source folder";
    }
}
