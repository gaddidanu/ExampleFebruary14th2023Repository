import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogoutDemo {
	private static WebDriver oBrowser=null;
	private static ObjectMapDemo om=null;
	public static void main(String[] args) {
		openbrowser();
		navigate();
		login();
		minimizewindow();
		logout();
		closeApplication();
	}
public static void openbrowser()
{
	try {
		oBrowser= new ChromeDriver();
		om=new ObjectMapDemo(".\\ObjectMap\\objectmap.properties");
	} catch (Exception e) {
	e.printStackTrace();
	}
}
public static void navigate()
{
	try {
		oBrowser.get("http://localhost:81/user/submit_tt.do");
		Thread.sleep(5000);

	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void login()
{
	try {
		
		oBrowser.findElement(om.getLocator("logicusername")).sendKeys("admin");
		oBrowser.findElement(om.getLocator("logicpassword")).sendKeys("manager");
		oBrowser.findElement(om.getLocator("logicloginBtn")).click();
		Thread.sleep(5000);

	} catch (Exception e) {
	e.printStackTrace();
	}
}

public static void minimizewindow()
{
	try {
		oBrowser.findElement(om.getLocator("logicflywindow")).click();
		Thread.sleep(5000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void logout()
{
	try {
		oBrowser.findElement(om.getLocator("logiclogout")).click();
		Thread.sleep(5000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	private static void closeApplication()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	

}
