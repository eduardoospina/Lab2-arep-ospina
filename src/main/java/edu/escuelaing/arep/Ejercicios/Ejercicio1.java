package edu.escuelaing.arep.Ejercicios;
import java.net.*;

/**
 * Clase de Primer ejercicio que busca tomar un url y retornar la informaicon relacionada a este
 * @author Eduardo Ospina
 */
public class Ejercicio1 {

    /**
     * metodo main que recibe una URL e imprime la informacion deseada.
     * @param args Array de String.
     */
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.escuelaing.edu.co:80/es?resource=carreras/?id=892#iniciar");
        System.out.println("URL: " + url.getProtocol());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path" + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("File: " + url.getFile());
        System.out.println("Ref: " + url.getRef());
    }
}
