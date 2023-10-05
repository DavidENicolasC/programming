/**
 *
 * @author davidenicolasc
 */

//Clase para entrada de datos
import java.util.Scanner;

//Mi clase
public class FundamentosJava {

    public static void main(String args[]) {
        //Entero
        int miVariableEntera = 10;
        double var1;
        float var2;
        char var3;
        System.out.println(miVariableEntera);

        //Inferencia de tipos
        var $miVariableEntera = 5;
        var _miVariableEntera2 = 13;
        System.out.println(_miVariableEntera2);

        String miVariableCadena = "Saludos";
        System.out.append(miVariableCadena);

        //Concatenar Strings
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        var i = 3;
        var j = 4;
        //Contexto cadena: Java asume si debe concatenar o sumar de acuerdo con el tipo de la primera
        //La primera es de tipo entero: 7Nueva Cadena
        System.out.println(i + j + miVariableCadena2);
        //La primera es de tipo cadena: Nueva Cadena34
        System.out.println(miVariableCadena2 + i + j);
        //Alteramos la prioridad: NuevaCadena7
        System.out.println(miVariableCadena2 + (i + j));
        
        var cad = "David";
        //Caracteres especiales
        System.out.println("Nueva linea: \n" + cad);
        System.out.println("Tabulador: \n" + cad);
        System.out.println("Retroceso: \n" + cad);
        System.out.println("Comilla simple: \n" + cad);
        System.out.println("Comilla doble: \n" + cad);
        
        //Ingresar datos al programa
        System.out.println("Ingresa una cadena: ");
        //Se crea un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        var cadentrada = entrada.nextLine();   
        System.out.println("La cadena ingresada es: " + cadentrada);
    }
}

import java.util.Scanner;

public class DetallesLibro {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo = entrada.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = entrada.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}