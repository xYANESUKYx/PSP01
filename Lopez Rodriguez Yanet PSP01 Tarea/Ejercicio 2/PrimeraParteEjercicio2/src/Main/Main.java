package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yanet
 * Primera parte: implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria 
 * (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, 
 * también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:
 * java -jar lenguaje 40 miFicheroDeLenguaje.txt
**/


public class Main {
    public static void main(String[] args) {
        //RECOGEMOS EL NÚMERO DE CONJUNTOS DE LETRAS QUE DESEAMOS GENERAR
        int cantidad = Integer.parseInt(args[0]);
        
        //RECOGEMOS EL NOMBRE QUE LE DAREMOS AL ARCHIVO
        String archivo = args[1];

        //DECLARAMOS UNA NUEVA VARIABLE BufferedWriter Y LA INICIAMOS
        BufferedWriter bufercito = null;
        
        //USAMOS UN TRY CATCH PARA EL CONTROL DE ERRORES PARA QUE NO NOS EXPLOTE EL PC
        try {
            //PONEMOS WAPO A bufercito PARA ESCRIBIR EN EL ARCHIVO USANDO FileWriter
            //PONEMOS true PARA QUE AÑADA LAS LINEAS AL DOCUMENTO Y NO LO ELIMINE
            bufercito = new BufferedWriter(new FileWriter(archivo, true));
                    
            //HACEMOS UN BUCLE FOR QUE SE EJECUTE LA CANTIDAD DE VECES QUE LE INDICAMOS
            for (int i = 0; i < cantidad; i++) {
                //ESCRIBIMOS EN EL DOCUMENTO EL CONJUNTO DE LETRAS PASANDOLE AL bufercito LA FUNCION generarStringAleatorio()
                //LE PASAMOS generarStringAleatorio() COMO PARAMETRO YA QUE ESTA RETORNARÁ EL STRING DE ALEATORIOS 
                bufercito.write(generarStringAleatorio());
                //AGREGAMOS UNA NUEVA LINEA DE TEXTO
                bufercito.newLine();
            }
            
        //SI OCURRE UN ERROR DURANTE LA CREACIÓN DEL ONJETO BufferedWriter EL CATCH LO CAPTURA Y LO MUESTRA
        } catch (IOException e) {
            System.out.println("ERROR >:v " + e.getMessage());
        } finally {
            //VERIFICAMOS QUE EL bufercito NO SEA NULO, ESTO SIGNIFICA QUE SE CREO CORRECTAMENTE 
            if (bufercito != null) {
                try {
                    //CERRAMOS EL BufferedWriter USANDO EL METODO close()
                    bufercito.close();
                    //SI OCURRE UN ERROR DURANTE EL CIERRE EL CATCH LO CAPTURA Y LO MUESTRA
                } catch (IOException e) {
                    System.out.println("ERROR AL CERRAR >:v " + e.getMessage());
                }
            }
        }
        
    }
    
    public static String generarStringAleatorio() {
        //HACEMOS UN STRING CON TODAS LAS LETRAS DEL ABECEDARIO EN MAYUSCULAS Y MINUSCULAS
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        //CREANMOS UNA VARIABLE STRING LLAMADA sandwich Y LA INSTANCIAMOS
        String sandwich = "";
        
        //INSTANCIAMOS LA CLASE RANDOM
        Random random = new Random();
        
        //HACEMOS UN BUCLE FOR QUE IRÁ INSERTANDOLE UNA NUEVA LETRA RANDOM AL STRING LAS 
        //VECES QUE LE INDIQUEMOS ENH ESTE CASO 10
        for (int i = 0; i < 10; i++) {
            //COJEMOS LA LETRA QUE ESTA EN LA POSICION DEL NUMERO ALEATORIO Y SE LA AÑADIMOS A sandwich
            sandwich = sandwich + caracteres.charAt(random.nextInt(caracteres.length()));
        }
        
        //DEVOLOVEMOS EL CONJUNTO DE 10 LETRAS ALEATÓRIAS
        return sandwich;
    }
}