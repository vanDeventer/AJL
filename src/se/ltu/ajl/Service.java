package se.ltu.ajl;

/** Abstract class representing a service.
 * @author Jan van Deventer
 */
public class Service {
private String name;
private String uri;

    /** Getting the service's name
     *
     * @return A string representing the service's name.
     */
    public String getName() {
        return name;
    }

    /** Setting the service's name.
     * @param name of service
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Getting the URI path of the service.
     *
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
