/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package URLH.Punto3;

import java.net.*;
import java.io.*;

public class Servernumeros {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        Double inputLine, outputLine; //Input lo que llega
        while ((inputLine = Double.valueOf(Integer.valueOf(in.readLine()))) != null) {
            System.out.println( "Mensaje:   " + inputLine);
            outputLine = inputLine * inputLine; //Lo que debe mandar
            out.println("Cuadrado = " + outputLine); //Salida
            if (inputLine == -1) {
                break;
            }

        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

}