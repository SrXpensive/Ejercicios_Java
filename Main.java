import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = teclado.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multi = numero1 * numero2;
        float division = (float) numero1 / numero2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multi);
        System.out.println("División: "+division);

        // Ejercicio 2
        System.out.println("Escribe otro valor: ");
        int numero3 = teclado.nextInt();
        System.out.println("Uno más");
        int numero4 = teclado.nextInt();
        if(numero3 > numero4){
            System.out.println("El mayor es "+numero3);
        }
        else if(numero4>numero3){
            System.out.println("El mayor es "+numero4);
        }
        else {
            System.out.println("Son iguales");}
        }
    }
