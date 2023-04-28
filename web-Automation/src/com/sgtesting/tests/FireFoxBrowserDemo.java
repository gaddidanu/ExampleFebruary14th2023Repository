package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	private static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigator();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			oBrowser = new FirefoxDriver();

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
