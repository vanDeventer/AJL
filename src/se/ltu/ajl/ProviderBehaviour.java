package se.ltu.ajl;

public interface ProviderBehaviour {
    void registerService(Service serviceProvider);

    void deRegisterService();

    void respond2ConsumerRequest();

    void scheduleUpdate();
}
