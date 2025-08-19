package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    private static String SERVER_ADDRESS = "localhost";
    private static int PORT = 9090;


    public static void main(String[] args) throws Exception {
        while (true) {
            try (Socket socket = new Socket(SERVER_ADDRESS, PORT)) {
                OutputStream os = socket.getOutputStream();
                String httpRequest = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
                os.write(httpRequest.getBytes());
                sendToServer(os);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }

    private static void sendToServer(OutputStream os) throws Exception {
        os.flush();
    }
}
