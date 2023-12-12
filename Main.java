import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
            int numero1 = teclado.nextInt();
        System.out.println("Introduce otro número");
            int numero2 =  teclado.nextInt();
            int suma =  numero1+numero2;
            int resta = numero1-numero2;
            int multi = numero1 * numero2;
            double division =  (double) numero1 / numero2;
            int potencia = (int) Math.pow(numero1, numero2);
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multi);
        System.out.println("División: "+division);
        System.out.println("Potencia: "+potencia);

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

        // Ejercicio 3
        System.out.println("Introduce el precio del producto:");
            float precio = teclado.nextFloat();
        System.out.println("Introduce el % de IVA (4%, 10%, 21%):");
            int iva = teclado.nextInt();
        double total;
            switch(iva){
                case 4:
                    total = precio * 1.04;
                    System.out.println("Total: "+total);
                    break;
                case 10:
                    total = precio * 1.1;
                    System.out.println("Total: "+total);
                    break;
                case 21:
                    total = precio * 1.21;
                    System.out.println("Total: "+total);
                    break;
                default:
                    System.out.println("Valor de iva incorrecto");
            }
        }

    }
