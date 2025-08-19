package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP implements TransportLayer{
    private final int port;

    public TCP(int port) {
        this.port = port;
    }

    @Override
    public void useProtocol() throws Exception {
        final ServerSocket server = new ServerSocket(this.port);
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
}
