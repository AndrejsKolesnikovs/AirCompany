package pages;

import org.openqa.selenium.By;

public class PlanePlacePage {
    private BaseFunc baseFunc;
    private final By BOOK = By.xpath(".//span[@id='book3']");

    public PlanePlacePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickBookBtn() {
        baseFunc.clickBtn(BOOK);
    }

}
