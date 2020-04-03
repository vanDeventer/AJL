package se.ltu.ajl;

public class AdminShellTest {

        public static void main(String[] args) {
            Prosumer temperatureSystem = new Prosumer("temperatureSys", "127.0.0.1", 4000, "publicKeys");
            System.out.println(temperatureSystem.getSystemName() + " is at " + temperatureSystem.getIpAddress() + ":" + temperatureSystem.getTcpPort());
            System.out.println((char) 27 + "[31m" + "ERROR MESSAGE IN RED");


            temperatureSystem.addService(new TemperatureSevice(temperatureSystem, "simpleAnalogSensor", "indoorTemperature", "/indoorTemperature"));
            temperatureSystem.addService(new TemperatureSevice(temperatureSystem, "simpleAnalogSensor", "outdoorTemperature", "/outdoorTemperature"));


            // Service temperatureService = new TemperatureSevice("Temperature Service","/temperature");
            //  System.out.println(temperatureService.getName() + "'s URL is " + temperatureSystem.getIpAddress() + ":" + temperatureSystem.getTcpPort() + temperatureService.getUri());
        }
}
