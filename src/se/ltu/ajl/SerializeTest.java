package se.ltu.ajl;

public class SerializeTest {

    public static void main(String[] args) {
        AdminShell temperatureSystem = new AdminShell("temperatureSys","127.0.0.1",4000,"publicKeys");
        Service temperatureService = new Service();
        temperatureService.setName("Temperature Service");
        temperatureService.setUri("Temperature");
        Serialize payload = new Serialize();
        System.out.println(payload.loadJson(temperatureService));
    }
}
