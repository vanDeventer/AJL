package se.ltu.ajl;

/**
 *  This class represents the abstact version of the piece of software that wraps the asset.
 * @author Jan van Deventer
 */
public class AdminShell {
    private String systemName;
    private String ipAddress;
    private int tcpPort;
    private String publicKey;

    public AdminShell(String systemName, String ipAddress, int tcpPort, String publicKey) {
        this.systemName = systemName;
        this.ipAddress = ipAddress;
        this.tcpPort = tcpPort;
        this.publicKey = publicKey;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(int tcpPort) {
        this.tcpPort = tcpPort;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
