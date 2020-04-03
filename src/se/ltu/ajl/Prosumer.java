package se.ltu.ajl;

import java.util.ArrayList;

/**
 * The "Prosumer" is an Arrowhead Framework compliant administrative shell over an asset.
 * It is both a service provider and consumer.
 * Together with the asset it forms an Arrowhead Framework system.
 *
 * @author Jan van Deventer
 */

public class Prosumer extends AdminShell {
    private String privateKey;
    private ArrayList<Service> services;

    /**
     * This is the top abstract class of an Industry 4.0 administrative shell, which the Arrowhead Framework compliant
     * version (the prosumer) inherits and interfaces with the asset.
     * It is also be the parent of the systems that the prosumer will interact with.
     *
     * @param systemName
     * @param ipAddress
     * @param tcpPort
     * @param publicKey
     */
    public Prosumer(String systemName, String ipAddress, int tcpPort, String publicKey) {
        super(systemName, ipAddress, tcpPort, publicKey);
        services = new ArrayList<Service>();
    }

    /**
     * Upon start up of an Arrowhead Framework systems, its needs to add all its services to the list of services.
     *
     * @param newService
     */
    public void addService(Service newService) {
        services.add(newService);
    }

}
