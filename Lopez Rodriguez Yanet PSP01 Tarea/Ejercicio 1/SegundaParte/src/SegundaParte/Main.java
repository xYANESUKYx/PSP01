package SegundaParte;

import java.util.Random;
import java.util.Scanner;

/**@author yanet
 * Segunda parte: implementa una aplicación, llamada 'aleatorios', que genere al menos 40 números aleatorios (entre 0 y 100), y que los 
 * escriba en su salida estándar.
**/

public class Main {
    public static void main(String[] args) {
        //LE DAMOS LA CAMTIDAD DE NUMEROS QUE DESEAMOS GENERAR
        int cantidad = 50;
        
        // CREAMOS UNA INSTANCIA EN LA CLASE RANDOM 
        Random random = new Random();
        
        //CREAMOS UN ARRAY CON EL TAMAÑO INDICADO POR EL USUARIO
        int[] array = new int[cantidad]; 

        //CREAMOS UN BUBLE FOR QUE INSERTE NÚMEROS ALEATÓRIOS EN LA ARRAY
        for (int i = 0; i < cantidad; i++) {
        //GENERA UN NÚMERO ALEATÓRIO ENTRE 0 Y 100 Y LO INSERTA EN LA POSICIÓN i DE LA ARRAY
            array[i] = random.nextInt(101);
        }

        //IMPRIMIMOS EL CONTENIDO DE LA ARRAY POR PANTALLA
        for (int i = 0; i < cantidad; i++) {
            System.out.print (array[i] +  " ");
        } 
    }
}    
    
    
    /*
    public static void main(String[] args) {
        //LLAMAMOS A LA FUNCIÓN aleatorios() PARA QUE NOS GENERE LA LISTA DE NÚMEROS
        aleatorios();
        
        //PONEMOS UN SALTO DE LÍNEA PARA QUE QUEDE MAS BONICO
        System.out.println("\n");
    }
    
    public static void aleatorios() {
        //PEDIMOS LA CANTIDAD DE NÚMEROS QUE DESEAMOS GENERAR
        System.out.println("¿Cuántos números aleatórios desea generar?");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        
        // CREAMOS UNA INSTANCIA EN LA CLASE RANDOM 
        Random random = new Random();
        
        //CREAMOS UN ARRAY CON EL TAMAÑO INDICADO POR EL USUARIO
        int[] array = new int[cantidad]; 

        //CREAMOS UN BUBLE FOR QUE INSERTE NÚMEROS ALEATÓRIOS EN LA ARRAY
        for (int i = 0; i < cantidad; i++) {
        //GENERA UN NÚMERO ALEATÓRIO ENTRE 0 Y 100 Y LO INSERTA EN LA POSICIÓN i DE LA ARRAY
            array[i] = random.nextInt(101);
        }

        //IMPRIMIMOS EL CONTENIDO DE LA ARRAY POR PANTALLA
        System.out.print("\nNúmeros: \n");
        for (int i = 0; i < cantidad; i++) {
            System.out.print (array[i] +  " ");
        }
    }
}

*/

