package se.ltu.ajl;

public class AdminShellTest {

        public static void main(String[] args) {
            Prosumer temperatureSystem = new Prosumer("ExampleSystem", "localhost", 4000, "publicKeys");
            temperatureSystem.addService(new TemperatureSevice(temperatureSystem, "simpleAnalogSensor", "indoorTemperature", "/indoorTemperature"));
            //    temperatureSystem.
            temperatureSystem.addService(new TemperatureSevice(temperatureSystem, "simpleAnalogSensor", "outdoorTemperature", "/outdoorTemperature"));
            Configurator configurator = new Configurator();
            configurator.processConfigFile(temperatureSystem);
            configurator = null;

            // Service temperatureService = new TemperatureSevice("Temperature Service","/temperature");
            //  System.out.println(temperatureService.getName() + "'s URL is " + temperatureSystem.getIpAddress() + ":" + temperatureSystem.getTcpPort() + temperatureService.getUri());
        }
}
