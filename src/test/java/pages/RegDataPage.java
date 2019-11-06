package pages;

import org.openqa.selenium.By;

public class RegDataPage {
    private BaseFunc baseFunc;
    private final By BOOK = By.xpath(".//span[@id='book2']");

    public RegDataPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickBookBtn() {
        baseFunc.clickBtn(BOOK);
    }
}
