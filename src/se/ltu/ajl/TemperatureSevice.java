package se.ltu.ajl;

/**
 * This is a Temperature service
 */
public class TemperatureSevice extends Service {
    private String unit; // should it be a constant?
    private float value;
    private int timeStamp;
    ProviderBehaviour providerBehaviour;


    public TemperatureSevice(Prosumer system, String serviceType, String name, String uri) {
        super(system, serviceType, name, uri);
        providerBehaviour = new SimpleAnalogSensor();
        providerBehaviour.registerService(this);
    }

    public void updateServiceRegistry() {
        providerBehaviour.registerService(this);
    }
}
