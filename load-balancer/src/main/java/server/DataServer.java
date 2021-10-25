package server;

import java.util.Objects;

public class DataServer{
    private int port;
    private String host;
    private DataServerResource serverResource;
    private int weight;

    public DataServer(int port, String host, DataServerResource serverResource) {
        this.port = port;
        this.host = host;
        this.serverResource = serverResource;
        this.weight = 1;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataServer that = (DataServer) o;
        return port == that.port && host.equals(that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, host);
    }

    public DataServerResource getServerResource() {
        return serverResource;
    }

    public int getWeight() {
        return weight;
    }
}