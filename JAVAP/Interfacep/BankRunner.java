package com.xworkz.interfacepro;

public class BankRunner {

	public static void main(String[] args) {
		BankRule bank1 = new CityBank();
		System.out.println("Bank Rules for bank1:");
		bank1.maintainMinimumBalance();
		bank1.avoidOverdraft();
		bank1.useATMCardResponsibly();
		bank1.checkAccountStatementsRegularly();
		bank1.reportLostCardImmediately();
		bank1.securePersonalIdentificationNumber();
		bank1.followBranchTimings();
		bank1.adhereToLoanRepaymentSchedule();
		bank1.updateAddressAndContactDetails();
		bank1.useBankingAppsSecurely();
		bank1.avoidSharingAccountDetails();
		bank1.ensureProperSignatureVerification();
		bank1.followDepositAndWithdrawalRules();
		bank1.complyWithKYCRequirements();
		bank1.understandFeeStructure();
		bank1.useOnlineBankingSafely();

	}

}
