package com.bank.lienviet.report;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.*;

@Data
@NoArgsConstructor
public class ReportExporter {

    private JasperPrint jasperPrint;

    public void exportToPdf(String fileName, String author) {
        // print report to file
        JRPdfExporter exporter = new JRPdfExporter();
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(fileName));

        SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
        reportConfig.setSizePageToContent(false);
        reportConfig.setForceLineBreakPolicy(false);

        SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
        exportConfig.setMetadataAuthor(author);
        exportConfig.setEncrypted(true);
        exportConfig.setAllowedPermissionsHint("PRINTING");

        exporter.setConfiguration(reportConfig);
        exporter.setConfiguration(exportConfig);
        try {
            exporter.exportReport();
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }

//    public void exportToHtml(String fileName) {
//        HtmlExporter exporter = new HtmlExporter();
//
//        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//        exporter.setExporterOutput(new SimpleHtmlExporterOutput(fileName));
//
//        try {
//            exporter.exportReport();
//        } catch (JRException ex) {
//            ex.printStackTrace();
//        }
//    }
}
