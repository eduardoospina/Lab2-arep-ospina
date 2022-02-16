package URLH;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class punto2 {

    public static void main(String[] args) {
        try {
            FileWriter guardar = new FileWriter("resultado.html");
            BufferedWriter htmllineas = new BufferedWriter(guardar);
            URL Urla = AsignarURL();
            BufferedReader lector = new BufferedReader(new InputStreamReader(Urla.openStream()));
            String Fila = lector.readLine();
            while (Fila != null){
                htmllineas.write(Fila);
                Fila = lector.readLine();
            }
            htmllineas.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static URL AsignarURL() throws MalformedURLException {
        Scanner Entrada = new Scanner(System.in);
        String URLaCopiar = Entrada.nextLine();
        URL URLs = new URL(URLaCopiar);
        return URLs;
    }
}