package edu.escuelaing.arep.Retos.Reto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejerciciourl {

    public static void main(String[] args) throws Exception {
        while(true) {
            try {
                URL Urla = AsignarURL();
                // Crea el objeto que URLConnection
                URLConnection urlConnection = Urla.openConnection();
                // Obtiene los campos del encabezado y los almacena en un estructura Map
                Map<String, List<String>> headers = urlConnection.getHeaderFields();
                // Obtiene una vista del mapa como conjunto de pares <K,V> para poder navegarlo
                Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
                // Recorre la lista de campos e imprime los valores
                for (Map.Entry<String, List<String>> entry : entrySet) {
                    String headerName = entry.getKey();
                    //Si el nombre es nulo, significa que es la linea de estado
                    if (headerName != null) {
                        System.out.print(headerName + ":");
                    }
                    List<String> headerValues = entry.getValue();
                    for (String value : headerValues) {
                        System.out.print(value);
                    }
                    System.out.println("");
                }
                System.out.println("-------message-body------");
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(Urla.openStream()))) {
                    String inputLine = null;
                    while ((inputLine = reader.readLine()) != null) {
                        System.out.println(inputLine);
                    }
                } catch (IOException x) {
                    System.err.println(x);
                }
            } catch (MalformedURLException e) {
                System.err.println(e);
            }

        }
    }

    private static URL AsignarURL() throws MalformedURLException {
        Scanner Entrada = new Scanner(System.in);
        String URLaCopiar = Entrada.nextLine();
        URL URLs = new URL(URLaCopiar);
        return URLs;
    }

}