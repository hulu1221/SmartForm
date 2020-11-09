package com.bank.lienviet.report;

import lombok.Data;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRSaver;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Data
public class ReportFiller {

    private String reportFileName;
    
    private JasperReport jasperReport;

    private JasperPrint jasperPrint;

    private Map<String, Object> parameters;

    private JRBeanCollectionDataSource dataSource;

    public ReportFiller() {
        parameters = new HashMap<>();
    }

    public void prepareReport() {
        compileReport();
        fillReport();
    }

    public void compileReport() {
        try {
            InputStream reportStream = getClass().getResourceAsStream("/".concat(reportFileName));
            jasperReport = JasperCompileManager.compileReport(reportStream);
            JRSaver.saveObject(jasperReport, reportFileName.replace(".jrxml", ".jasper"));
        } catch (JRException ex) {
            System.out.println(ex);
        }
    }

    public void fillReport() {
        try {
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
}
