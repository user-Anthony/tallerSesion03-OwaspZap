package pages;

import control.Button;
import control.Label;
import control.TextBox;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AddTask {
    public Button addTask = new Button(By.xpath("//button[text()='Add task']"),"[Add] button add task in Main page");
    public TextBox setTask = new TextBox(By.xpath("//p[@class='is-empty is-editor-empty']"), "[Set] set task");
    //public Button saveTask = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"),"[Save] save task");
    public Label getTask = new Label(By.xpath("//div[text()='Test 1']"),"[getTask] get task");
}