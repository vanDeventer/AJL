package se.ltu.ajl;

public class SerializeTest {

    public static void main(String[] args) {
        Prosumer temperatureSystem = new Prosumer("temperatureSys", "127.0.0.1", 4000, "publicKeys");
        TemperatureSevice temperatureService = new TemperatureSevice(temperatureSystem, "simpleAnalogSensor", "Temperature Service", "/temperature");
        temperatureService.setName("Temperature Service");
        temperatureService.setUri("Temperature");
        Serialize payload = new Serialize();
        System.out.println(payload.loadJson(temperatureService));
    }
}
