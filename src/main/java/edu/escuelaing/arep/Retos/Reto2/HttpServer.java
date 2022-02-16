package edu.escuelaing.arep.Retos.Reto2;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 * clase para generar un servidor http.
 * @author eduardo ospina
 */
public class HttpServer {

    /**
     * metodo main de la clase que hace manejo de los sockets y la informacion necesaria para montar un servidor web de manera local
     * @param args Array de string
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        boolean running = true;

        try {
            serverSocket = new ServerSocket(35001); //sOCKET DE SERVIDOR, PUERTO 35000
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }

        Socket clientSocket = null; //Cliente socket
        while (running) {
            try {
                System.out.println("Listo para recibir ...");
                clientSocket = serverSocket.accept(); //Se pone a aceptar conexiones
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); //Flujo de salida
            BufferedReader in = new BufferedReader( //Flujo de entrada
                    new InputStreamReader(clientSocket.getInputStream()));
            String inputLine, outputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received: " + inputLine); //Mensaje de lo que recibió
                if (!in.ready()) {
                    break;
                }
            }
            //Siempre responde la misma página

            outputLine = "HTTP/1.1 200 OK\r\n"
                    + "Content-Type: text /html\r\n"
                    + "\r\n"
                    + "<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<meta charset=\"UTF-8\">"
                    + "<title>Title of the document</title>\n"
                    + "</head>"
                    + "<body>"
                    + "My Web Site"
                    + "</body>"
                    + "</html>" + inputLine;
            out.println(outputLine);
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        }
    }
}
