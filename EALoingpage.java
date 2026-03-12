package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EALoingpage {
	WebDriver driver;

	public EALoingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"userId\"]")
	static WebElement userName;
	@FindBy(xpath = "//*[@id=\"-password-login\"]")
	static WebElement pwd;
	@FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/form/div/div[4]/div/div[3]/button")
	static WebElement LoginButton;

	@FindBy(xpath = "//div//h6")
	static List<WebElement> links;

	public static void verifyLogin() {
		userName.sendKeys("HVPNEE");
		pwd.sendKeys("HVPNEE");
		LoginButton.click();

	}

	public void verifyLinks() {
		int count = 0;
		for (WebElement link : links) {
			count++;
		}
		System.out.println(count);

	}

}
