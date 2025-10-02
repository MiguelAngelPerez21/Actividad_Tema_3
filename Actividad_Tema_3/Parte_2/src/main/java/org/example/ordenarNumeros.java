package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ordenarNumeros{
    static void main() {
        try {
            //Lectura de la entrada estándar
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String linea;

            //Creamos un ArrayList para guardar los numeros
            ArrayList<Integer> numeros = new ArrayList<>();

            //Leemos todas las líneas y las convertimos a enteros
            while ((linea = br.readLine()) != null && !linea.isEmpty()) {
                numeros.add(Integer.parseInt(linea));
            }

            //Ordenamos la lista de números
            Collections.sort(numeros);

            //Mostramos los números ordenados
            for (int n : numeros) {
                System.out.println(n);
            }

        } catch (IOException ioe) {
            System.err.println("Error de lectura: " + ioe.getMessage());
        }
    }
}