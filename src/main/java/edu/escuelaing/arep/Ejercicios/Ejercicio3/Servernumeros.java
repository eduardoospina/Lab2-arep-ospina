/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.arep.Ejercicios.Ejercicio3;

import java.net.*;
import java.io.*;

/**
 * clase responsable de crear el servidor encragado de recibir el numero y retornarle al cliente el numero elevado al cuadrado.
 * @author eduardo.ospina
 */
public class Servernumeros {

    /**
     * metodo que maneja la creacion del servido que este ne constant espera de qu el cliente mande el numero para calcula el elevdao al cuadrado y le regresa este valor al cliente. temrina cuando el cliente le ingresa un -1
     * @param args Array de String.
     */
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