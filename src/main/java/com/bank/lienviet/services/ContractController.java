package com.bank.lienviet.services;

import com.bank.lienviet.domain.contract.ContractConstructor;
import com.bank.lienviet.domain.contract.ContractReportBuilder;
import net.sf.jasperreports.engine.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api/v1")
public class ContractController {

    @GetMapping("/contract")
    public String generateContractReportPdf() throws FileNotFoundException, JRException {
        ContractReportBuilder report = new ContractReportBuilder(new ContractConstructor().getContract());
        return report.exportReport();
    }

}
