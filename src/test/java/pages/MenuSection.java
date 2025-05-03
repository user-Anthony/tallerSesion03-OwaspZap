package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MenuSection {

    //public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"),"[Logout] button in Menu section");
    public Label labelToday = new Label((By.xpath("//h1[text()='Today']")),"[Logout] button in Menu section");

}