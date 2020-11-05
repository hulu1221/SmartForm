package com.bank.lienviet.domain.contract.infor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitalBanking {

    private Boolean issuingNewCard;

    private String defaultAccount;

    private Boolean debitCardDomestic;

    private Boolean debitCardInternational;

    private Boolean debitCardOther;

    private String debitCardOtherStr;

    private Boolean cardClassStandard;

    private Boolean cardClassGold;

    private Boolean cardClassDiamond;

    private Boolean cardClassOther;

    private String cardClassOtherStr;

    private String embossedName;

    private Boolean issuingFormNormally;

    private Boolean issuingFormImmediately;

    private String receivingCardPlace;

    private String securityQuestion;

    private String answerSecurityQuestion;

    private Boolean smsBanking;

    private Boolean mobileBanking;

    private String mobileBankingPhoneReg1;

    private String mobileBankingPhoneReg2;

    private Boolean accountBalanceFluctuation;

    private Boolean mobileBankingSilver;

    private Boolean mobileBankingGold;

    private Boolean mobileBankingDiamond;

    private Boolean bankPlus;

    private String bankPlusPhoneReg;

    private Boolean internetBanking;

    private Boolean internetBankingSilver;

    private Boolean internetBankingGold;

    private Boolean internetBankingDiamond;

    private String emailForPassword;

    private Boolean securityMethodPhoneNumber;

    private String securityMethodPhoneNumberStr;

    private Boolean securityMethodTokenKey;

    private Boolean viViet;

    private String viVietPhoneReg;
}
