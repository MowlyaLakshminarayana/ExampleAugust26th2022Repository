package com.sgtesting.tests;
/*3. launchBrowser --> navigate --> Login --> Create User1 --> Create User2--> Create User3 --> Logout from admin -->
 *  Login as User1 --> logout as user1 --> Login as User2 --> logout as User2 --> Login as User3 --> logout as user3 --> 
 *  Login as User1 --> Modify Password --> Logout as user1 -->Login as User2 --> Modify Password --> Logout as user2 -->
 *  Login as User3 --> Modify Password --> Logout as user3 --> Login as User1 using new password --> Logout as User1 -->
 *  Login as User2 using new password --> Logout as User2 --> Login as User3 using new password --> Logout as User3 --> 
 *  Login as Admin --> Modify Password for User1 , User2, User3 --> Logout as Admin --> Login as User1 using new password -->
 *  Logout as User1 -->Login as User2 using new password --> Logout as User2 --> Login as User3 using new password -->
 *  Logout as User3 -->Login as Admin --> Delete User1, User2, User3 --> Logout as Admin
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logoutAsAdmin();
		loginAsUser1();
		clearAdvertisement1();
		logoutAsUser1();
		loginAsUser2();
		clearAdvertisement2();
		logoutAsUser2();
		loginAsUser3();
		clearAdvertisement3();
		logoutAsUser3();
		loginAsUser1AndModifyPassword();
		logOutAsUser1one();
		loginAsUser2AndModifyPassword();
		logOutAsUser2one();
		loginAsUser3AndModifyPassword();
		logOutAsUser3one();
		loginAsUser1UsingNewPassword();
		logoutAsUser1UsingNewPassword();
		loginAsUser2UsingNewPassword();
		logoutAsUser2UsingNewPassword();
		loginAsUser3UsingNewPassword();
		logoutAsUser3UsingNewPassword();
		loginAsAdminAndModifyPasswordForUser1User2User3();
		logoutAsAdminOne();
		loginAsUser1UsingNewPasswordOne();
		logoutAsUser1UsingNewPasswordOne();
		loginAsUser2UsingNewPasswordOne();
		logoutAsUser2UsingNewPasswordOne();
		loginAsUser3UsingNewPasswordOne();
		logoutAsUser3UsingNewPasswordOne();
		loginAsAdmin();
		deleteUser1User2User3();
		logoutAsAdminLast();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			oBrowser.findElement(By.name("middleName")).sendKeys("1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			oBrowser.findElement(By.name("middleName")).sendKeys("2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			oBrowser.findElement(By.name("middleName")).sendKeys("3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("345");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clearAdvertisement1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clearAdvertisement2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clearAdvertisement3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginAsUser1AndModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("111");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAsUser1one()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2AndModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("222");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("222");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAsUser2one()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3AndModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("345");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("333");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("333");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAsUser3one()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("111");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser1UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("222");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser2UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("333");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser3UsingNewPassword()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsAdminAndModifyPasswordForUser1User2User3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			//Modify password for User1
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("000");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("000");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
			//Modify password for User2
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("999");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("999");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			//Modify password for User3
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("888");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("888");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsAdminOne()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("000");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser1UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("999");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser2UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("888");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsUser3UsingNewPasswordOne()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1User2User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			//Delete User1
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			//Delete User2
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert o1Alert=oBrowser.switchTo().alert();
			String content1=o1Alert.getText();
			System.out.println(content1);
			o1Alert.accept();
			Thread.sleep(2000);
			//Delete User3
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert o2Alert=oBrowser.switchTo().alert();
			String content2=o2Alert.getText();
			System.out.println(content2);
			o2Alert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsAdminLast()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
