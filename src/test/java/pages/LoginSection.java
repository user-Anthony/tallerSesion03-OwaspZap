package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    //public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"),"[Email] textBox in login section");
    //public TextBox pwdTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"),"[Password] textbox in login section");
    //public Button btnLogin = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"),"[Login] button in Login section");

    public TextBox emailTextBoxTodoIst = new TextBox((By.id("element-0")),"[Email] textBox in login section");
    public TextBox pwdTextBoxTodoIst = new TextBox((By.id("element-2")),"[Password] textbox in login section");
    public Button btnLoginTodoIst = new Button((By.xpath("//button[@type='submit' and @aria-describedby='agreement-footnote']")),"[Login] button in Login section");
    ////span[text()='Iniciar sesión']

}
