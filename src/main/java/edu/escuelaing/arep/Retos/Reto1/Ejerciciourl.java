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

/**
 * clase que se encarga a partir de una url genera una cponceccion y retorna en consola todos los elementos html de la apgina deseada, prime rpazo en la implementacion completa del ejercicio.
 * @author eduardo ospina
 */
public class Ejerciciourl {

    /**
     * metodo main que a paritr de una url en especifica, genera una conecion a esta url y obtine los datos de tml de la web. y las imprime e conosla 1 a 1 como se pide para el ejercicio.
     * @param  args Array de String.
     */
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

    /**
     * metodo que maneja la lectura de un url y lo retorna como url para que el prpograma main lo pueda leer.
     * @return url deseada que ingresa el usuario.
     */
    private static URL AsignarURL() throws MalformedURLException {
        Scanner Entrada = new Scanner(System.in);
        String URLaCopiar = Entrada.nextLine();
        URL URLs = new URL(URLaCopiar);
        return URLs;
    }

}