package questions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WhatSResponseCode implements Question<Integer> {
    private String responseBody;

    public WhatSResponseCode(String responseBody){
        this.responseBody = responseBody;
    }


    public static WhatSResponseCode ForResponseBody(String responseBody){
        return new WhatSResponseCode(responseBody);
    }

    @Override
    public Integer answeredBy(Actor actor) {
        JsonPath jsonPath = new JsonPath(responseBody);
        return jsonPath.getInt("responseCode");
    }
}
