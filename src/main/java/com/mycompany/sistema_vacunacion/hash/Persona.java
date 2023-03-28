package com.mycompany.sistema_vacunacion.hash;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Persona {
    public String cui;
    public String vacuna;
    public String fecha;
    
    public Persona(String cui, String vacuna, String fecha) {
        this.cui = cui;
        this.vacuna = vacuna;
        this.fecha = fecha;
    }
    
    public static String GuardarInfo(String temp) {
        try {
            File archivo = new File("C:\\Users\\Augusto\\Desktop\\Registro de Vacunas.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(temp);
            escribir.write("\n");
            escribir.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido guardar la información");
            System.out.println("No se ha podido guardar la información");
        }
        return null;
    }
}
