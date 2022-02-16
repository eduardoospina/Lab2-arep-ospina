package edu.escuelaing.arep.Ejercicios;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


/**
 * metodo que maneja el get de los celsius para uso en el front end, manejandolo del formato JSON estandart.
 * @author Eduardo ospina
 */
public class Ejercicio2 {

    /**
     * metodo main que maneja la escritura y el guardado del resultado.html que se genera de una url determinada. leyendo toda el html de la pagina web deseada.
     * @param args Array de String.
     */
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

    /**
     * metodo que maneja la lectura de un url y lo retorna como url para que el prpograma main lo pueda leer.
     * @return Url retorna la url que el usuario desea.
     */
    private static URL AsignarURL() throws MalformedURLException {
        Scanner Entrada = new Scanner(System.in);
        String URLaCopiar = Entrada.nextLine();
        URL URLs = new URL(URLaCopiar);
        return URLs;
    }
}