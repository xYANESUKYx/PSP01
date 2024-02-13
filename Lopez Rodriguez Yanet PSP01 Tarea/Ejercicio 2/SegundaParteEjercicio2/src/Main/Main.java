package Main;

import java.io.IOException;

/**
 * @author yanet
 * Segunda parte: implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". 
 * Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. Cada instancia generará un número creciente de 
 * palabras de 10, 20, 30, … Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. 
 * Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.
**/

public class Main {
    public static void main(String[] args) {
        //CREAMOS UN ENTERO Y LO INICIALIZAMOS DANDOLE EL VALOR CERO
        int cantidad = 0;
        
        //USAMOS UN TRY CATCH PARA EL CONTROL DE ERRORES PARA QUE NO NOS EXPLOTE EL PC
        try {
            //HACEMOS UN BUCLE FOR EL CUAL SE EJECUTARÁ 10 VECES
            for (int i = 0; i < 10; i++) {
                //CADA VEZ QUE SE EJECUTE EL BUCLE FOR LA CAMTIDAD DE CONJUNTOS DE LETRAS INCREMENTARA EN 10 UNIDADES
                cantidad = cantidad + 10;
                //CREAMOS UN OBJETO ProcessBuilder PARA EJECUTAR EL COMANDO EN EL Q LLAMAMOS A lenguaje INDICANDOLE LA CANTIDAD
                String xd = "java -jar lenguaje.jar " + cantidad + " miFicheroDeLenguaje.txt";
                ProcessBuilder processBuilder = new ProcessBuilder(xd.split(" "));
                //REDIRIGIMOS LAS ENTRADAS Y SALIDAS AL PROCESO PADRE
                processBuilder.inheritIO(); 
                //INICIAMOS EL PROCESO 
                Process proceso = processBuilder.start();
            }
        //CAPTURAMOS Y MANEJAMOS EL ERROR IOException SI LO HAY 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}