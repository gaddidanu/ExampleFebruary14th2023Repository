package com.sgtesting.Windowhandler1;

public class ExcuteAutoItScript {

	public static void main(String[] args) {
		executeScript();

	}
	private static void executeScript()
	{
		try {
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("E:\\ExampleAutomation\\AutiIt\\my1st.exe");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
