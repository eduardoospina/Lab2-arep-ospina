package edu.escuelaing.arep.Retos.Reto2;

import java.io.IOException;
import java.net.URISyntaxException;

class MiniSparkweb {
    private static edu.escuelaing.arep.Retos.Reto2.HttpServer Instancia;
    private static HttpServer httpServer;

    public static void main(String[] args) {
        edu.escuelaing.arep.Retos.Reto2.HttpServer https= getInstance();
        MiniSparkweb.Run();
    }

    public static void Run() {
        try {
            httpServer = new HttpServer();
            httpServer.main();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }



    public static edu.escuelaing.arep.Retos.Reto2.HttpServer getInstance() {
        if (Instancia == null) Instancia = new edu.escuelaing.arep.Retos.Reto2.HttpServer();
        return Instancia;
    }

}