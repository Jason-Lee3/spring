package org.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class UDP implements TransportLayer{
    private final int port;

    public UDP(int port) {
        this.port = port;
    }

    @Override
    public void useProtocol() throws Exception {
        try (DatagramSocket datagramSocket = new DatagramSocket(this.port)) {
            System.out.println("UDP Server started");
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(request);

                String received = new String(request.getData(), 0, request.getLength());
                System.out.println("Received: " + received);

                String responseText = "The date/time is: " + new Date();
                byte[] responseInBytes = responseText.getBytes();

                DatagramPacket response = new DatagramPacket(responseInBytes,
                        responseInBytes.length, request.getAddress(), request.getPort());
                datagramSocket.send(response);
            }
        }
    }
}
