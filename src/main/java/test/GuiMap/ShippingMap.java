package test.GuiMap;

/**
 * GUI Map containing xpaths elements for shipping
 * Created by chimi14 on 2017-08-31.
 */
public final class ShippingMap {

    public final static String SIGN_UP_FIRST_NAME = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_FirstNameContainer_TxtFirstName']";
    public final static String SIGN_UP_LAST_NAME = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_LastNameContainer_txtLastName']";
    public final static String SIGN_UP_ADDRESS = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_AddressLine1Container_TxtAddressLine1']";
    public final static String SIGN_UP_CITY = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_CityContainer_TxtCity']";
    public final static String SIGN_UP_BC = "//select[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_StateContainer_DdlState']/Option[@value='{province}']";
    public final static String SIGN_UP_POSTAL_CODE = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_PostalCodeContainer_TxtZipCode']";
    public final static String SIGN_UP_PHONE_AREACODE = "//input[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_manageShippingAddress_oeaUseNew_addressUC_PhoneContainer_TxtPhone']";
    public final static String CONTINUE_FROM_SHIPPING ="//a[@id='ctl00_CP_checkoutSections_ctl01_DeliveryOptionTabs1_btnContinueFromShipping']";

}
