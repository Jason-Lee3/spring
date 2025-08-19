package org.example;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/// while (true) {
///             try (Socket socket = server.accept()) {
///                 Date today = new Date();
///                 String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
///                 socket.getOutputStream()
///                       .write(httpResponse.getBytes("UTF-8"));
///             }
///         }


public class simpleHttpServer {

    private static boolean useTCP = true;
    private static int port = 9090;

    public static void main(String[] args) throws Exception {
        if (useTCP) {
            useTCP(port);
        }
        else {
            useUDP(port);
        }
    }

    static private void useTCP(int port) throws Exception {
        final ServerSocket server = new ServerSocket(port);
        System.out.println("TCP Server started");
        while (true) {
            try (final Socket client = server.accept()) {
                InputStreamReader isr = new InputStreamReader(client.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();
                while (!line.isEmpty()) {
                    System.out.println(line);
                    line = br.readLine();
                }
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                client.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }

    static private void useUDP(int port) throws Exception {
        try (DatagramSocket datagramSocket = new DatagramSocket(port)) {
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
