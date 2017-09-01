package test.GuiMap;

/**
 * GUI Map containing xpaths on elements of validation errors
 * Created by chimi14 on 2017-08-31.
 */
public final class ErrorsMap {

    public final static String ALERT_BOX = "//div[@id='ctl00_CP_ErrorSummaryUC12_ValidationSummary1']";
    public final static String INVALID_CARD_VALIDATION = "//div[@id='ctl00_CP_ErrorSummaryUC12_ValidationSummary1']/ul/li[contains(text(), 'The format of the credit card number entered does not match the card type you specified. Please check for accuracy and try again. (0018)')]";

}
