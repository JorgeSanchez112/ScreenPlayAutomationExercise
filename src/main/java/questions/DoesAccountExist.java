package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DoesAccountExist implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoesAccountExist.class);

    private final String emailAccount;

    public DoesAccountExist(String emailAccount){
        this.emailAccount = emailAccount;
    }

    public static DoesAccountExist forEmail(String emailAccount){
        return new DoesAccountExist(emailAccount);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Get.resource("/getUserDetailByEmail")
                        .with(request -> request.queryParam("email", emailAccount))
        );

        int statusCode = SerenityRest.lastResponse().getStatusCode();
        LOGGER.info("Response Status Code: {}", statusCode);

        String responseBody = SerenityRest.lastResponse().body().asString();
        int responseCode = WhatSResponseCode.ForResponseBody(responseBody).answeredBy(actor);

        return responseCode == 200;
    }
}
