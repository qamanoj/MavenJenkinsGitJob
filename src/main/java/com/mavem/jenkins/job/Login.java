package com.mavem.jenkins.job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.id("txtuId"));
	}

	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("txtPword"));
	}

	public static WebElement loginbutton(WebDriver driver)
	{
		return driver.findElement(By.id("login"));
	}
}
