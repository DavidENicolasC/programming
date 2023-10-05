
import java.util.Scanner;

//Comentario de varias lineas y una linea
/*
 *
 * @author davidenicolasc
 */
public class TiposPrimitivos {
    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        byte variableByte = 10;
        //Rangos de  las variables
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        //Conversion explicita
        var miVariable = (byte)129;
        System.out.println(miVariable);
        
        /*
            tipos primitivos de tipo flotante: float y double
        */
        
        //Exponencial. Si fuera una literal, la D al final indicaría su tipo
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        
        //Inferencia de tipos con variables de punto flotante
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble2 = 10.0;
        System.out.println("numeroDouble = " + numeroDouble2);
        
        var numeroFloat2 = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat2);
        
        /*
            Caracteres: char
        */
        //Lista de caracteres Unicode
        char letra = 'a';
        System.out.println(letra);
        
        //Asignar un valor segun la lista de caracteres Unicode
        char uni = '\u0021';
        System.out.println(uni);
        
        //Segun el valor decimal
        char letra2 = 33;
        System.out.println(letra2);
        
        //Java soporta la asignacion de literales de tipo caracter a enteros
        //Realiza la conversion interna del valor
        int num = 'b';
        System.out.println(num);
        
        //Booleanos
        boolean variableBooleana = true;
        System.out.println(variableBooleana);
        
        //Convertir String a int
        var edad = Integer.parseInt("20");
        System.out.println(edad + 1);
        
        //Convertir String a double
        var pi = Double.parseDouble("3.1416");
        System.out.println(pi);
        
        //Ingresar un valor entero
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        edad = Integer.parseInt( entrada.nextLine() );
        
        //Convertir un int a un string
        var edadTexto = String.valueOf(10);
        System.out.println(edadTexto);
       
        //Solicitar un solo caracter de una string
        var caracter = "hola".charAt(0);
        //Por consola
        var caracter2 = entrada.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
    }
}
