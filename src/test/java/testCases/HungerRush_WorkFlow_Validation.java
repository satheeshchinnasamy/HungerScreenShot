package testCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import common_Functions.BaseFunction;
import pageObjects.Communicate_Objects;
import pageObjects.Display_Objects;
import pageObjects.Home_Objects;
import pageObjects.HungerRushOnly_Objects;
import pageObjects.Inventory_Objects;
import pageObjects.Menu_Objects;
import pageObjects.People_Objects;
import pageObjects.Reports_Objects;

public class HungerRush_WorkFlow_Validation extends BaseFunction{
	
	
	@Test(priority=1)
	public void Report_Test() throws InterruptedException, IOException {
		logger= extentReport.createTest("Report Validation");
		PageFactory.initElements(driver, Reports_Objects.class);
		PageFactory.initElements(driver, Home_Objects.class);
		
		Home_Objects.reports.click();
		Reports_Objects.sales.click();
		Thread.sleep(5000);
		Reports_Objects.singleStore.click();
		Reports_Objects.from_Date.clear();
		Reports_Objects.from_Date.sendKeys("Jan 01 2021");
		Reports_Objects.to_Date.clear();
		Reports_Objects.to_Date.sendKeys("Mar 31 2021");
		Reports_Objects.viewbutton.click();
		String reports=Reports_Objects.reportsOption.getText();
		String Actuallreports="Report Optio";
		Assert.assertEquals(Actuallreports, reports);
		}
	
	@Test(priority=2)
	public void Manage_Menu() throws IOException {
		logger= extentReport.createTest("Menu Validation");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, Menu_Objects.class);
		Home_Objects.manage.click();
		Menu_Objects.menu.click();
		String text=Menu_Objects.menueditor.getText();
		String originalText= "Menu Edit";
		Assert.assertEquals(originalText, text);
		}
	
	
	  @Test(priority=3)
	  public void Menu_blocks() throws InterruptedException {
	  logger= extentReport.createTest("Menu_Blocks Validation");
	  PageFactory.initElements(driver, Menu_Objects.class);
	  Menu_Objects.storesdropdown.click(); 
	  Thread.sleep(7000);
	  Menu_Objects.LyInstall.click(); 
	   }
	  
	  @Test(priority=4) 
	  public void Add_Group() throws InterruptedException {
	  logger= extentReport.createTest("Add_Group Validation");
	  PageFactory.initElements(driver, Menu_Objects.class);
	
	  Menu_Objects.group.click(); 
	  Menu_Objects.addgroup.click();
	  Thread.sleep(7000); 
	  Menu_Objects.groupname.sendKeys("aaaaaaa");
	  Menu_Objects.buttonname.sendKeys("bbbbbbb");
	  Menu_Objects.add.click(); 
	  Menu_Objects.viewchanges.click();
	  Menu_Objects.checkbox.click();
	  Menu_Objects.publish_Changes.click();
	  }
	 
	
	@Test(priority=5)
	public void People_Option() {
		logger= extentReport.createTest("People Validation");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, People_Objects.class);
	
		logger.log(Status.INFO, "People menu validation started");
		logger.log(Status.INFO, "Clicking the people in the menu option in the home");
		Home_Objects.people.click();
		People_Objects.summary.click();
		String review=People_Objects.timrclock.getText();
		String actualreview="Weekly Time Clock Review";
		Assert.assertEquals(actualreview, review);
	}
	
	@Test(priority=6)
	public void Communicate() {
		
		logger= extentReport.createTest("Communicate Validation");
		logger.log(Status.INFO, "Communicate test started");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, Communicate_Objects.class);
		Home_Objects.communicate.click();
		Communicate_Objects.documents.click();
		String doc_page=Communicate_Objects.doc_content.getText();
		String actual_doc_page="Documents";
		Assert.assertEquals(actual_doc_page, doc_page);
		}
	
	@Test(priority=7)
	public void Inventory() throws IOException {
		logger= extentReport.createTest("Inventory Validation");
		logger.log(Status.INFO, "Inventory Test is started");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, Inventory_Objects.class);
		Home_Objects.inventory.click();
		String invent_page=Inventory_Objects.inventory_page.getText();
		String actual_invent_page="Inventory Management";
		Assert.assertEquals(actual_invent_page, invent_page);
		}
	
	@Test(priority=8)
	public void Display() {
		logger= extentReport.createTest("Display Validation");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, Display_Objects.class);
		Home_Objects.display.click();
		Display_Objects.Drive.click();
		String tripdetails=Display_Objects.trip.getText();
		String actual_tripdetails="Current Trip";
		Assert.assertEquals(actual_tripdetails, tripdetails);
		
	}
	
	@Test(priority=10)
	public void SiteDesigner() {
		logger= extentReport.createTest("SiteDesigner Validation");
		PageFactory.initElements(driver, Home_Objects.class);
		Home_Objects.sitedesigner.click();
		
	}
	
	@Test(priority=9)
	public void HungerRushOnly() throws IOException {
		logger= extentReport.createTest("HungerRush Validation");
		PageFactory.initElements(driver, Home_Objects.class);
		PageFactory.initElements(driver, HungerRushOnly_Objects.class);
		Home_Objects.hungerRush.click();
		HungerRushOnly_Objects.allCustomers.click();
		String cus_name=HungerRushOnly_Objects.customertitle.getText();
		String actual_cus_name="Reds Pizza";
		Assert.assertEquals(actual_cus_name, cus_name);
		}
}
