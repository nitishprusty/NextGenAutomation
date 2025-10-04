package testComponents;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Login_Page;

public class Login extends BaseTest {

	Login_Page loginPage;

	@Test
	public void initElement() {
		loginPage = PageFactory.initElements(getDriver(), Login_Page.class);

	}

	@Test(dependsOnMethods = { "initialize", "initElement" })
	public void LoginApplication() throws Exception {
	loginPage.Login(UserID, Password);
	}

}
