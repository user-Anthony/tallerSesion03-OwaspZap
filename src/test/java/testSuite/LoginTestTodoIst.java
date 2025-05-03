package testSuite;//package testSuite;

import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import session.Session;

public class LoginTestTodoIst {

    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    MenuSection menuSection = new MenuSection();


    @BeforeEach
    public void openBrowser(){
        Session.getSession().getBrowser().get("https://todo.ist/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSession();
    }

    @Test
    @Order(1)
    //ALLURE
    @Owner("Anthony Muñante")
    @Epic("Login")
    @Feature("Authentication")
    @Story("Login")
    @DisplayName("Verify login is successful")
    @Description("This test case is to verify that the user can login successfully")
    @Link(name="test case manual")
    // con jira
    //@Link(name="test case manual", url="jira/123123")
    @Issue("DEFECTO 1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTestSuccessfully(){
        mainPage.loginButtonTodoIst.click();
        loginSection.emailTextBoxTodoIst.setText("danilo.aya@gmail.com");
        loginSection.pwdTextBoxTodoIst.setText("123456aA@");
        loginSection.btnLoginTodoIst.click();
        Assertions.assertTrue(menuSection.labelToday.isControlDisplayed(),
                "Logout button is not displayed");
    }
}
