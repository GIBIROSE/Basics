
package com.payroll.pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.actiondriver.Action;
import com.payroll.baseclass.BaseClass;
import com.payroll.utilities.ExcelLibrary;

public class Clients extends BaseClass {

	public Action action;

	public Clients() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement clientBtn;

	@FindBy(xpath = "//a[@href='/payrollapp/client/create']")
	WebElement createClient;

	@FindBy(id = "clientsearch-client_name")
	WebElement clientNameSearchBox;

	@FindBy(id = "clientsearch-id")
	WebElement clientIDSearchBox;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchBox;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement resetBtn;

	@FindBy(xpath = "/a[@data-sort='id']")
	WebElement clientIDSort;

	@FindBy(xpath = "//a[@data-sort='client_name']")
	WebElement clientNameSort;

	@FindBy(xpath = "//a[@data-sort='your_ref']")
	WebElement clientReference;

	@FindBy(xpath = "//a[@data-sort='client_address']")
	WebElement clientAddress;

	@FindBy(xpath = "//a[@data-sort='postcode']")
	WebElement postcode;

	@FindBy(id = "client-branch_id")
	WebElement txtBranch;

	@FindBy(id = "client-division_id")
	WebElement txtDivision;

	@FindBy(xpath = "//input[@id='client-client_name']")
	WebElement txtCreateClient;

	@FindBy(xpath = "//textarea[@id='client-client_address']")
	WebElement txtAddress;

	@FindBy(xpath = "//input[@id='client-postcode']")
	WebElement txtPostcode;

	@FindBy(xpath = "//input[@id='client-your_ref']")
	WebElement textYourReference;

	@FindBy(xpath = "//input[@id='client-invoice_contact']")
	WebElement txtInvoiceContact;

	@FindBy(xpath = "//input[@id='client-phone']")
	WebElement txtPhone;

	@FindBy(id = "client-fax")
	WebElement txtFax;

	@FindBy(id = "client-email")
	WebElement txtEmail;

	@FindBy(id = "client-company_reg")
	WebElement txtCompanyReg;

	@FindBy(xpath = "//select[@id='client-invoice_order']")
	WebElement txtInvoiceOrder;

	@FindBy(xpath = "//select[@id='client-invoice_delivery_method']")
	WebElement txtInvoiceDeliveryMethod;

	@FindBy(xpath = "//select[@id='client-master_document']")
	WebElement txtMasterDocument;

	@FindBy(id = "client-settilement_days")
	WebElement txtSettlementDays;

	@FindBy(id = "client-vat_rate")
	WebElement txtVatRate;

	// @FindBy(xpath = "//button[@type='submit']")
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "//th[normalize-space()='Client Name']")
	WebElement savedClientDetails;

	@FindBy(xpath = "//a[@href='/payrollapp/client/invoice?id=755']")
	WebElement viewInvoiceHistory;

	@FindBy(xpath = "//td[normalize-space()='Sam']")
	WebElement searchResultByName;

	@FindBy(xpath = "//td[normalize-space()='3']")
	WebElement searchResultByID;

	@FindBy(xpath = "//a[@href='/payrollapp/client/view?id=1']//span[@class='glyphicon glyphicon-eye-open']")
	WebElement viewOneExistingClient;
	
	@FindBy(xpath = "//td[normalize-space()='Amalaxaviour']")
	WebElement viewOneUserEnlargedView;
	
	@FindBy(xpath="//a[@href='/payrollapp/client/update?id=1']//span[@class='glyphicon glyphicon-pencil']")
	WebElement editOneExistingClient;	
	
	
	@FindBy(xpath="//li[normalize-space()='Update']")
	WebElement existingUserEditWindowEnlargedView;
	
	
	public boolean editExistingClient() {
		Action action = new Action();
		action.click(driver, editOneExistingClient);
		return existingUserEditWindowEnlargedView.isDisplayed();
	}

	public boolean viewExistngClient() {
		Action action = new Action();
		action.click(driver, viewOneExistingClient);
		 return viewOneUserEnlargedView.isDisplayed();
	}

	public boolean searchDisplay() {
		// clientNameSearchBox.isDisplayed();
		action = new Action();
		return action.isDisplayed(driver, clientNameSearchBox);
	}

	public boolean searchClients() {
		// clientBtn.click();
		// action.click(driver,clientBtn);
		clientNameSearchBox.sendKeys("sam");
		clientIDSearchBox.sendKeys("3");
		// action.type(clientNameSearchBox, "sam");
		searchBox.click();
		// action.click(driver,searchBox );
		boolean result = searchResultByName.isDisplayed();
		return result;
	}

	public boolean searchClientByID() {
		action.type(clientIDSearchBox, "3");
		boolean result = searchResultByID.isDisplayed();
		return result;
	}

	public void resetEnbledVerify() {
		action.type(clientIDSearchBox, "3");
		action.click(driver, resetBtn);
		action.type(clientIDSearchBox, "4");
	}

	public void createClientStep() throws Exception {
		// ExcelLibrary lib = new ExcelLibrary();

		Action action = new Action();
		action.click(driver, createClient);
		action.click(driver, txtBranch);
		// ArrayList excelData=lib.getData("clients");

		// what to do next
		action.selectBySendkeys("Alpha_new", txtBranch);
		action.selectByIndex(txtDivision, 1);
		// action.click(driver, txtDivision);
		action.selectByVisibleText("NewAlpha", txtBranch);
		action.type(txtCreateClient, "Danil Medvedev");

		action.type(txtAddress, "WhiteMountStreet, Chelsea");
		action.type(txtPostcode, "98765");
		action.type(txtInvoiceContact, "Andrey");

		action.type(txtPhone, "7867568");
		action.type(txtEmail, "danil@gmail.com");

		action.type(txtCompanyReg, "Jeromian");
		action.selectByIndex(txtMasterDocument, 2);
		action.selectByIndex(txtInvoiceOrder, 2);
		action.selectByIndex(txtInvoiceDeliveryMethod, 2);

		action.type(txtSettlementDays, "12");

		action.selectByIndex(txtVatRate, 3);
		action.explicitWait(driver, saveButton, 10);
		// saveButton.click();

		action.click(driver, saveButton);
		// Thread.sleep(2000);
		// String actual = savedClientDetails.getText();
		// return actual;

	}

	public void createClientBranchSelect() {
		action.click(driver, txtBranch);

		action.selectBySendkeys("Alpha_new", txtBranch);
	}

	public void createClientDivisionSelect() {
		action.click(driver, txtDivision);
		action.selectByVisibleText("NewAlpha", txtBranch);
	}

	public void createClientClientName() {
		action.type(txtCreateClient, "Danil Medvedev");

	}

	public void createClientClientAddress() {
		action.type(txtAddress, "WhiteMountStreet, Chelsea");
	}

	public void createClientPostCode() {
		action.type(txtPostcode, "98765");
	}

	public void createClientInvoiceContact() {
		action.type(txtInvoiceContact, "Andrey");
	}

	public void createClientPhone() {
		action.type(txtPhone, "7867568");

	}

	public void createClientEmail() {
		action.type(txtEmail, "danil@gmail.com");
	}

	public void createClientCompanyReg() {
		action.type(txtCompanyReg, "Jeromian");
	}

	public void createClientInvoiceOrder() {
		action.selectByIndex(txtInvoiceOrder, 1);
	}

	public void createClientMasterDocument() {

		action.selectByIndex(txtMasterDocument, 2);
	}

	public void createClientSettlementDays() {
		action.type(txtSettlementDays, "12");
	}

	public void createClientVatType() {
		action.selectByIndex(txtVatRate, 3);
	}

	public void createClientSaveBtn() {
		action.click(driver, saveButton);
	}

}
