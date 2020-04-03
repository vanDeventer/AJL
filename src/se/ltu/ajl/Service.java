package se.ltu.ajl;

/**
 * Abstract class representing a service.
 *
 * @author Jan van Deventer
 */
abstract class Service {
    private Prosumer mySystem;
    private String serviceType;
    private String name;
    private String uri;

    /**
     * Service constructor (of an abstract class) which needs to know to which system it belongs to
     * as well as its name and uniform resource identifier (URI).
     * @param system
     * @param uri
     */
    public Service(Prosumer system, String serviceType, String name, String uri) {
        this.mySystem = system;
        this.serviceType = serviceType;
        this.name = name;
        this.uri = uri;
    }

    /**
     * Getting a reference to the prosummer a service belongs to.
     * @return reference to own system.
     */
    public Prosumer getMySystem() {
        return mySystem;
    }

    /**
     * Getting the service's name
     * @return A string representing the service's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setting the service's name.
     * @param name of service
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getting the URI path of the service.
     * @return the path part of the URL
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setting the URL path to the service.
     * @param uri as a string
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}
