package se.ltu.ajl;

/** This class is to test the Service class until I learn more about JUnit
 * @author Jan van Deventer
 */
public class ServiceTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Service temperatureService = new Service();
        temperatureService.setName("Temperature Service");
        temperatureService.setUri("Temperature");
        System.out.println(temperatureService.getName() + temperatureService.getUri());
    }
}
