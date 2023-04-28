package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowserDemo {
	private static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigator();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			// System.setProperty("webdriver.chrome.driver",
			// "E:\\ExampleAutomation\\Automation\\web-Automation\\Lirary\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static void navigator() {
		try {
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
