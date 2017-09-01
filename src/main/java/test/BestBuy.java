package test;

import com.selenium.webproject.base.SeleniumBase;
import org.testng.annotations.Test;
import test.GuiMap.*;

import static org.testng.AssertJUnit.assertTrue;

public class BestBuy extends SeleniumBase {

    private String siteHost = "http://www.bestbuy.ca";

    /**
     * Test Invalid credit card message at checkout after searching for an item and adding it to cart
     * @throws InterruptedException
     */
    @Test
    public void testInvalidCreditCardAtCheckOut() throws InterruptedException {
        try {
            this.getDriver().get(siteHost);
            fillinText(CommonMap.HOMEPAGE_SEARCH_BAR, "QC35");
            clickElement(CommonMap.SEARCH_SUBMIT_BUTTON);
            clickElement(ProductMap.SEARCHED_ITEM.replace("{product}", "Bose QuietComfort 35 Over-Ear Noise Cancelling Wireless Headphones - Black"));
            //TODO:This sleep is for the wait animation. I didn't have time to capture the element to write a wait for animation method
            Thread.sleep(4000);
            clickElement(ProductMap.ADD_TO_CART_BUTTON);
            clickElement(ProductMap.OPT_OUT_WARRANTY);
            clickElement(ProductMap.CHECKOUT_LINK);
            clickElement(ProductMap.CONTINUE_CHECKOUT);
            fillinText(ShippingMap.SIGN_UP_FIRST_NAME, "lala");
            fillinText(ShippingMap.SIGN_UP_LAST_NAME, "Land");
            fillinText(ShippingMap.SIGN_UP_ADDRESS, "885 W Georgia St");
            fillinText(ShippingMap.SIGN_UP_CITY, "Vancouver");
            clickElement(ShippingMap.SIGN_UP_BC.replace("{province}", "BC"));
            clearElement(ShippingMap.SIGN_UP_POSTAL_CODE);
            fillinText(ShippingMap.SIGN_UP_POSTAL_CODE, "V6C 0B5");
            fillinText(ShippingMap.SIGN_UP_PHONE_AREACODE, "6042222222222");
            //TODO:This sleep is for the wait animation. I didn't have time to capture the element to write a wait for animation method
            Thread.sleep(2000);
            clickElement(ShippingMap.CONTINUE_FROM_SHIPPING);
            //TODO:This sleep is for the wait animation. I didn't have time to capture the element to write a wait for animation method
            Thread.sleep(2000);
            clickElement(PaymentsMap.SHOW_CREDIT_CARDS);
            fillinText(PaymentsMap.CREDIT_CARD_NUMBER, "4521222244441123");
            fillinText(PaymentsMap.CREDIT_CARD_CCV, "805");
            clickElement(PaymentsMap.EXPIRY_DATE.replace("{month}", "2"));
            clickElement(PaymentsMap.EXPIRY_YEAR.replace("{year}", "2018"));
            clickElement(PaymentsMap.SAME_AS_SHIPPING);
            fillinText(PaymentsMap.CONFIRMATION_EMAIL, "lala@lala.com");
            clickElement(PaymentsMap.CONTINUE_FROM_PAYMENT);
            //checking for Error Message
            assertTrue(verifyElementExists(ErrorsMap.INVALID_CARD_VALIDATION));

        } finally {
            getDriver().quit();
        }
    }

}


