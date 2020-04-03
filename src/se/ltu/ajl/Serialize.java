package se.ltu.ajl;

import org.json.simple.JSONObject;

public class Serialize {


    public String loadJson(Service provider) {
        JSONObject jService = new JSONObject();
        jService.put("System", provider.getMySystem().getSystemName());
        jService.put("Service", provider.getName());
        return jService.toString();
    }



}
