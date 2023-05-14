/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.ArrayList;
import vista.InterfazPersona;

/**
 *
 * @author ASUS
 */
public class stream_main {

    public static ArrayList<persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args) {

        Archivo_Base.registros(listaPersonas);

        new InterfazPersona().setVisible(true);
    }
}
