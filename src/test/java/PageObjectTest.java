import org.junit.jupiter.api.Test;
import pages.*;

public class PageObjectTest {

    private BaseFunc baseFunc = new BaseFunc();

    public PageObjectTest() throws InterruptedException {
    }

    @Test
    public void poTest() {
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFromAirport("RIX");
        homePage.selectToAirport("MEL");
        homePage.clickGoGoBtn();

        RegDataPage regDataPage = new RegDataPage(baseFunc);
        regDataPage.clickBookBtn();

        PlanePlacePage planePlacePage = new PlanePlacePage(baseFunc);
        planePlacePage.clickBookBtn();

        /*RegSuccessPage regSuccessPage = new RegSuccessPage(baseFunc);
        regSuccessPage.equals();*/
        }

    }
