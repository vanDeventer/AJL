package se.ltu.ajl;


public class SimpleAnalogSensor implements ProviderBehaviour {

    @Override
    public void registerService(Service sProvider) {
        Serialize payload = new Serialize();
        System.out.println(payload.loadJson(sProvider));
    }

    @Override
    public void deRegisterService() {

    }

    @Override
    public void respond2ConsumerRequest() {

    }

    @Override
    public void scheduleUpdate() {

    }
}
