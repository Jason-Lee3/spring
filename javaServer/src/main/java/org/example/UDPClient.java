package org.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    private static String SERVER_HOST = "localhost";
    private static int PORT = 9090;

    public static void main(String[] args) throws Exception {
        while (true) {
            try (DatagramSocket socket = new DatagramSocket()) {
                String message = "Hi Server!";
                byte[] messageInBytes = message.getBytes();

                InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);

                DatagramPacket packetToServer = new DatagramPacket(messageInBytes,
                        messageInBytes.length, serverAddress, PORT);

                socket.send(packetToServer);
                System.out.println("SENT: " + message);

                byte[] responseBuffer = new byte[1024];
                DatagramPacket responsePacketFromServer = new DatagramPacket(responseBuffer, responseBuffer.length);
                socket.receive(responsePacketFromServer);

                String response = new String(responsePacketFromServer.getData(), 0, responsePacketFromServer.getLength());
                System.out.println("Received from server: " + response);
            }
        }
    }
}
