/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.arep.Ejercicios.Ejercicio3;

/**
 *
 * @author Eduardo ospina
 */
import java.io.*;
import java.net.*;
/**
 * clase que es remposamble de crear el cliente de lo snumero snecaragdo de mandar al servidor el numero que desea elevado.
 * @author eduardo.ospina
 */
public class Clientnumeros {
    /**
     * metodo main que se encarga de crear los sockets del cliente y los elementos para su lectura y escrita de manera que se pueda conectar al al servidor de numero para que este le responda. termina si el usuario digita el numeor -1
     * @param args Array de string
     */
    public static void main(String[] args) throws IOException {
        Socket echoSocket = null; //Socket
        PrintWriter out = null; //Para la salida
        BufferedReader in = null; //Para la entrada
        try {
            echoSocket = new Socket("127.0.0.1", 35000);//En que servidor está y puerto quiere conectarse
            out = new PrintWriter(echoSocket.getOutputStream(), true); // Flujo de salida
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream())); //Flujo de entrada
        } catch (UnknownHostException e) {
            System.err.println("Don’t know about host!.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn’t get I/O for "
                    + "the connection to: localhost.");
            System.exit(1);
        }
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in)); //Leer mensajes desde la entrada estandar
        String userInput; //Variable para leer
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("echo: " + in.readLine());
            if(userInput.equals("-1")){
                break;
            }
        } //Se lee línea por línea lo del socket
        //Servidor que todo lo que lleve lo retorna exactamente igual
        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}
