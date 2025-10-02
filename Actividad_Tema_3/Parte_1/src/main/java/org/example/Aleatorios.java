package org.example;
import java.util.*;

public class Aleatorios
{
    static void main()
    {
        //Creamos un random para generar los números
        Random aleatorio = new Random();

        //Creamos un array para guardar los números generados
        int[] array = new int[40];

        //Creamos una secuencia for para llenar el array
        for(int i = 0; i < array.length; i++)
        {
            //Marcamos con bound el límite del valor de los números (0-100)
            array[i] = aleatorio.nextInt(0,100);
        }

        //Creamos otra secuencia for pra mostrar el array por consola
        for(int i :  array)
        {
            System.out.println(i);
        }
    }
}
