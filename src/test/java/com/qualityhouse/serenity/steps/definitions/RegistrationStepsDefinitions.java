package com.qualityhouse.serenity.steps.definitions;

import com.qualityhouse.serenity.entities.AddressDetails;
import com.qualityhouse.serenity.entities.User;
import com.qualityhouse.serenity.page_objects.LoginPage;
import com.qualityhouse.serenity.steps.libraries.RegistrationActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

/**
 * @author yakimfb
 * @since 18.03.20
 **/
public class RegistrationStepsDefinitions
{
    LoginPage loginPage;

    @Steps
    private RegistrationActions mitko;

    @Given( "^(?:.*) has started an account registration with \"(.*)\" email$" )
    public void registrationProcessIsStarted( String email )
    {
        mitko.startsRegistrationWithEmail( email );
    }

    @When( "^(?:.*) enters his personal details:$" )
    public void userEntersPersonalDetailsInRegistrationForm( List<User> rawUserData )
    {
        User user = rawUserData.get( 0 );
        mitko.entersHisPersonalDetails( user );
    }

    @When( "^s?he enters his|her address details:$" )
    public void he_enters_his_address_details( List<AddressDetails> rawAddressDetails )
    {
        AddressDetails addressDetails = rawAddressDetails.get( 0 );
        mitko.entersHisAddressDetails( addressDetails );
    }
}
