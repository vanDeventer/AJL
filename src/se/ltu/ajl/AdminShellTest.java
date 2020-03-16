package se.ltu.ajl;

public class AdminShellTest {

        public static void main(String[] args) {
            AdminShell temperatureSystem = new AdminShell("temperatureSys","127.0.0.1",4000,"publicKeys");
            System.out.println(temperatureSystem.getSystemName() + " is at "+ temperatureSystem.getIpAddress() + ":" + temperatureSystem.getTcpPort());
        }
}
