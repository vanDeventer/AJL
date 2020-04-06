package se.ltu.ajl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public class Configurator {
    public void processConfigFile(Prosumer prosumer) {
        try (FileReader reader = new FileReader("sysConfig.json"))  // The file has to be in the same directory as the scr directory
        {
            //Read JSON file
            JSONParser jsonParser = new JSONParser(); //JSON parser object to parse read file
            JSONObject configurationDescription = (JSONObject) jsonParser.parse(reader);
            System.out.println(configurationDescription);

            JSONObject mySystem = (JSONObject) configurationDescription.get("prosumer");
            prosumer.setSystemName((String) mySystem.get("name"));
            prosumer.setIpAddress((String) mySystem.get("IPaddress"));

            // read address
            Map<Object, Object> myServices = (Map<Object, Object>) mySystem.get("services");
            myServices.forEach((key, value) -> System.out.println(key + ": " + value));
            myServices.forEach((key, value) -> {
                System.out.println(key);
                JSONArray metaData = (JSONArray) value;
                metaData.forEach(System.out::println);
            });

            JSONObject serviceRegistry = (JSONObject) configurationDescription.get("ServiceRegistry");
            System.out.println(serviceRegistry);
            System.out.println("The name of the system is " + serviceRegistry.get("name"));
            System.out.println("The IP address of the system is " + serviceRegistry.get("IPaddress"));

        } catch (FileNotFoundException e) {
            System.out.println("sysConfig.json file not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO error when paring configuration file.");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Parsing exception when parsing configuration file.");
            e.printStackTrace();
        }
    }
}
