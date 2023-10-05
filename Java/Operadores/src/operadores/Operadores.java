package operadores;

/**
 *
 * @author davidenicolasc
 */
public class Operadores {
    public static void main(String[] args) {
        int a = 3, b = 2;
        
        var resultado = a + b;
        System.out.println("Suma: " + resultado);
        
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        
        resultado = a * b;
        System.out.println("Multiplicacion: " + resultado);
        
        //Division entera
        resultado = a / b;
        System.out.println("Division: " + resultado);
        
        //Division decimal
        var resultado2 = 3.0 / b;
        var resultado3 = 3F / b; //Puede colocarse D al final
        System.out.println("Division decimal: " + resultado2);
        
        //Modulo
        resultado = a % b;
        System.out.println("Modulo: " + resultado);
        
        //booleano
        boolean c = true;
        boolean d = !c;
        
        //Operadores de incremento y decremento
        
        //1. Incremento
        //1.1 Preincremento
        int lop = 5;
        int preinc = ++lop;
        System.out.println(preinc);
        //1.2 Postincremento
        int postinc = lop++;
        System.out.println(postinc);
        
        //2. Decremento
        //2.1 Predecremento
        int predec = ++lop;
        System.out.println(predec);
        //2.2 Postdecremento
        int postdec = lop++;
        System.out.println(postdec);
    }
    
}
