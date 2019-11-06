package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    private final By FROM = By.xpath(".//select[@id='afrom']");
    private final By TO = By.xpath(".//select[@id='bfrom']");
    private final By GO = By.xpath(".//span[@class='gogogo']");


    public HomePage(BaseFunc baseFunc) { //konstruktor
        this.baseFunc = baseFunc;
    }

    public void selectFromAirport(String from) {
        baseFunc.selectFromDropdown(FROM, from);
    }
    public void selectToAirport(String to) {
        baseFunc.selectFromDropdown(TO, to);
    }
    public void clickGoGoBtn() {
        baseFunc.clickBtn(GO);
    }
}
