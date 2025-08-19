package org.example;

public class simpleHttpServer {

    private static String protocol = "tcp";
    private static int port = 9090;

    public static void main(String[] args) throws Exception {
        TransportLayer transportLayer;
        switch (protocol) {
            case "tcp":
                transportLayer = new TCP(port);
                break;
            case "udp":
                transportLayer = new UDP(port);
                break;
            default:
                throw new IllegalArgumentException("Unsupported protocol: " + protocol);
        }
        transportLayer.useProtocol();
    }
}
