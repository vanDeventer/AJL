package se.ltu.ajl;

import org.json.JSONObject;

public class Serialize {
    JSONObject jService = new JSONObject();

    public String loadJson(Service provider) {
        jService.put("Service",provider.getName());
        return jService.toString();
    }



}
