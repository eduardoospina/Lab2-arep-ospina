package URLH;
import java.net.*;
import java.util.Scanner;

public class primerpunto {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.escuelaing.edu.co:80/es?resource=ofertas/");
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
