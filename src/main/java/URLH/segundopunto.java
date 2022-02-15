package URLH;

import java.net.*;
import java.util.Scanner;

public class segundopunto {

    // URL de prueba
    // https://www.escuelaing.edu.co:80/es?resource=ofertas/"
    public static void main(String[] args) {
        System.out.println("Ingrese una URL:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            URL urlInput = new URL(input);
        } catch (MalformedURLException e) {
            System.out.println("La URL ingresada está malformada");
        }
    }
}