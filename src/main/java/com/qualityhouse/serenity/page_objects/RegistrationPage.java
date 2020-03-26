package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @author yakimfb
 * @since 18.03.20
 **/
public class RegistrationPage
        extends PageObject
{
    @FindBy( css = "[for='id_gender1']" )
    public WebElementFacade mrRadioButton;

    @FindBy( css = "[for='id_gender2']" )
    public WebElementFacade mrsRadioButton;

    @FindBy( name = "customer_firstname" )
    public WebElementFacade firstNameField;

    @FindBy( name = "customer_lastname" )
    public WebElementFacade lastNameField;

    @FindBy( name = "email" )
    public WebElementFacade emailField;

    @FindBy( name = "passwd" )
    public WebElementFacade passwordField;

    @FindBy( name = "address1" )
    public WebElementFacade address1Field;

    @FindBy( name = "city" )
    public WebElementFacade addressCityField;

    @FindBy( name = "postcode" )
    public WebElementFacade addressZipCodeField;

    @FindBy( name = "phone_mobile" )
    public WebElementFacade addressMobilePhoneField;

    @FindBy( name = "alias" )
    public WebElementFacade addressAliasField;
}
