package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    //public Button loginButton = new Button(By.xpath("//img[contains(@src,\"pagelogin.png\")]"),"[Login] button in Main page");
    public Button loginButtonTodoIst = new Button(By.xpath("//a[contains(@href,'https://app.todoist.com/auth/login')]"),"[Login] button in Main page");

}
