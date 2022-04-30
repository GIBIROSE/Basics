package com.payroll.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.baseclass.BaseClass;

public class Clients  extends BaseClass{
	
	public Clients() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clientBtn;
		
	@FindBy(xpath="//a[@href='/payrollapp/client/create']")
	WebElement createClient;
	
	@FindBy(id="clientsearch-client_name")
	WebElement  clientNameSearchBox;
	
	@FindBy(id="clientsearch-id")
	WebElement clientIDSearchBox;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement searchBox;

	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement resetBtn;
	
	
	@FindBy(xpath="/a[@data-sort='id']")
	WebElement clientIDSort;
	
	@FindBy(xpath="//a[@data-sort='client_name']")
	WebElement clientNameSort;
	
	@FindBy(xpath="//a[@data-sort='your_ref']")
	WebElement clientReference;
	
	@FindBy(xpath="//a[@data-sort='client_address']")
	WebElement clientAddress;
	
	@FindBy(xpath="//a[@data-sort='postcode']")
	WebElement postcode;
	
	@FindBy(id="client-branch_id")
	WebElement txtBranch;
	
	@FindBy(id="client-division_id")
	WebElement txtDivision;
	
	@FindBy(xpath="//input[@id='client-client_name']")
	WebElement txtCreateClient;
	
	@FindBy(xpath="//textarea[@id='client-client_address']")
	WebElement txtAddress;
	
	@FindBy(xpath="//input[@id='client-postcode']")
	WebElement txtPostcode;
	
	@FindBy(xpath="//input[@id='client-your_ref']")
	WebElement textYourReference;
	
	@FindBy(xpath="//input[@id='client-invoice_contact']")
	WebElement txtInvoiceContact;
	
	@FindBy(xpath="//input[@id='client-phone']")
	WebElement txtPhone;
	
	@FindBy(id="client-fax")
	WebElement txtFax;
	
	@FindBy(id="client-email")
	WebElement txtEmail;
	
	@FindBy(id="client-company_reg")
	WebElement txtCompanyReg;
	
	@FindBy(xpath="//select[@id='client-invoice_order']")
	WebElement txtInvoiceOrder;
	
	@FindBy(xpath="//select[@id='client-invoice_delivery_method']")
	WebElement txtInvoiceDeliveryMethod;
	
	
	@FindBy(xpath="//select[@id='client-master_document']")
	WebElement txtMasterDocument;
	
	@FindBy(id="client-settilement_days")
	WebElement txtSettlementDays;
	
	@FindBy(id="client-vat_rate")
	WebElement txtVatRate;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	
	
	@FindBy(xpath="//a[@href='/payrollapp/client/invoice?id=755']")
	WebElement viewInvoiceHistory;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
