package PrimeraParte;

import java.util.Scanner;

/**@author yanet
 * Primera parte: implementa una aplicación que ordena un conjunto indeterminado de números que recibe a través de su entrada estándar; 
 * y muestra el resultado de la ordenación en su salida estándar. La aplicación se llamará 'ordenarNumeros'.
**/

public class Main {
    public static void main(String[] args) {
        //RECOGEMOS LOS NÚMEROS DE aleatorios
        Scanner scannerGuai = new Scanner(System.in);
        String numerosString = scannerGuai.nextLine();
        
        //DIVIDIMOS EL STRING USANDO EL ESPACIO COMO SEPARADOR Y ALMACENANDO LOS STRING 
        //INDEPENDIENTES EN UN ARRAY DE STRING
        String[] numeros = numerosString.split("\\s+"); 
        
        //CREAMOS UN ARRAY DE ENTEROS CON EL LARGO DEL ARRAY DE STRING
        int[] array = new int[numeros.length];
        
        //HACEMOS UN BUCLE FOR QUE CONVIERTE LOS STRING EN ENTEROS Y LOS ALMACENA EN EL NUEVO ARRAY
        for (int i = 0; i < numeros.length; i++) {
            array[i] = Integer.parseInt(numeros[i]);
        }
        //ESTE ES EL METODO DE LA BUSBUJA UWU RECORRE EL ARRAY REVISANDO CADA ELEMENTO DE LA LISTA CON EL SIGUENTE
        //INTERCAMBIÁNDOLOS DE POSICIÓN SI ESTÁN EN EL ORDEN EQUIVOCADO
        boolean uwu;
        for (int i = 0; i < array.length - 1; i++) {
            uwu = false;
            
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    uwu = true;
                }
            }
            if (!uwu) {
                break;
            }
        }
        
        //POR ÚLTIMO IMPRIMIMOS POR PANTALLA LOS NÚMEROS ORDENADOS
        System.out.print("\nNúmeros ordenados: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
}
    /*
    public static void main(String[] args) {
        //DE ESTA MANERA LLAMAREMOS A LA FUNCIÓN pedirNumeros() PARA PEDIR LOS DATOS POR TECLARO 
        //Y LUEGO LOS ORDENAREMOS USANDO LA FUNCIÓN ordenarNumeros()
        ordenarNumeros(pedirNumeros());
        
        //PONEMOS UN SALTO DE LÍNEA PARA QUE QUEDE MAS BONICO
        System.out.println("\n");
    }
    
    public static void ordenarNumeros(int[] array) {
        //ESTE ES EL METODO DE LA BUSBUJA UWU RECORRE EL ARRAY REVISANDO CADA ELEMENTO DE LA LISTA CON EL SIGUENTE
        //INTERCAMBIÁNDOLOS DE POSICIÓN SI ESTÁN EN EL ORDEN EQUIVOCADO
        boolean uwu;
        for (int i = 0; i < array.length - 1; i++) {
            uwu = false;
            
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    uwu = true;
                }
            }
            if (!uwu) {
                break;
            }
        }
        
        //POR ÚLTIMO IMPRIMIMOS POR PANTALLA LOS NÚMEROS ORDENADOS
        System.out.print("\nNúmeros ordenados: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }
    
    
    public static int[] pedirNumeros() {
        //PEDIMOS LOS NÚMEROS Q DESEAMOS ALMACENAR Y LOS GUARDAMOS EN EL STRING numerosString
        System.out.println("Inserte los números que quiera ordenar separados por espacios:");
        Scanner scannerGuai = new Scanner(System.in);
        String numerosString = scannerGuai.nextLine();
        
        //DIVIDIMOS EL STRING USANDO EL ESPACIO COMO SEPARADOR Y ALMACENANDO LOS STRING 
        //INDEPENDIENTES EN UN ARRAY DE STRING
        String[] numeros = numerosString.split("\\s+"); 
        
        //CREAMOS UN ARRAY DE ENTEROS CON EL LARGO DEL ARRAY DE STRING
        int[] numerosArray = new int[numeros.length];
        
        //HACEMOS UN BUCLE FOR QUE CONVIERTE LOS STRING EN ENTEROS Y LOS ALMACENA EN EL NUEVO ARRAY
        for (int i = 0; i < numeros.length; i++) {
            numerosArray[i] = Integer.parseInt(numeros[i]);
        }

        //Y POR ÚLTIMO RETORNAMOS EL ARRAY DE ENTEROS
        return numerosArray;
    }
    
}
*/