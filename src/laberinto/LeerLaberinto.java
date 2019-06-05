package laberinto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerLaberinto {
    String texto = "";
    ArrayList<String> lineas=new ArrayList<>();
    public void leerlab() {
        try {
            FileReader lector = new FileReader("laberinto.txt"); //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            BufferedReader contenido = new BufferedReader(lector); //El contenido de lector se guarda en un BufferedReader
            while ((texto = contenido.readLine()) != null) { //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                lineas.add(texto);
            }
        } 
        catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
    public ArrayList<String> getText() {
            return lineas;
    }
}

