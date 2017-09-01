package test.GuiMap;

/**
 * GUI Map containing the xpaths to elements of the payments page
 * Created by chimi14 on 2017-08-31.
 */
public final class PaymentsMap {

    public final static String SHOW_CREDIT_CARDS = "//a[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_lnkCreditCard']";
    public final static String CREDIT_CARD_NUMBER = "//input[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_UCEditCreditCard_AddCreditCardUC_CreditCardNumberContainer_TxtCardNumber']";
    public final static String EXPIRY_DATE = "//select[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_UCEditCreditCard_AddCreditCardUC_MonthContainer_DdlMonth']/option[@value='{month}']";
    public final static String EXPIRY_YEAR = "//select[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_UCEditCreditCard_AddCreditCardUC_YearContainer_DdlYear']/option[@value='{year}']";
    public final static String CREDIT_CARD_CCV = "//input[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_UCEditCreditCard_AddCreditCardUC_CIDNumberContainer_TxtCID']";
    public final static String SAME_AS_SHIPPING = "//input[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_UCEditCreditCard_ChkSameAsShipping']";
    public final static String CONFIRMATION_EMAIL = "//input[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_TxtEmailAddress']";
    public final static String CONTINUE_FROM_PAYMENT = "//a[@id='ctl00_CP_checkoutSections_ctl03_ucPaymentEdit_BtnContinueFromPayment']";
}
