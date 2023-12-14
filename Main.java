import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 5;
        while (opcion != 0){
            System.out.println("MENU");
            System.out.println("-----------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("0. Salir");
            System.out.println("------------");
            System.out.println("Introduce una opción: ");
            opcion = teclado.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Introduce un número: ");
                    int numero1 = teclado.nextInt();
                    System.out.println("Introduce otro número");
                    int numero2 = teclado.nextInt();
                    int suma = numero1 + numero2;
                    int resta = numero1 - numero2;
                    int multi = numero1 * numero2;
                    double division = (double) numero1 / numero2;
                    int potencia = (int) Math.pow(numero1, numero2);
                    System.out.println("Suma: " + suma);
                    System.out.println("Resta: " + resta);
                    System.out.println("Multiplicación: " + multi);
                    System.out.println("División: " + division);
                    System.out.println("Potencia: " + potencia);
                    break;
                case 2:
                    System.out.println("Escribe otro valor: ");
                    int numero3 = teclado.nextInt();
                    System.out.println("Uno más");
                    int numero4 = teclado.nextInt();
                    if (numero3 > numero4) {
                        System.out.println("El mayor es " + numero3);
                    } else if (numero4 > numero3) {
                        System.out.println("El mayor es " + numero4);
                    } else {
                        System.out.println("Son iguales");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el precio del producto:");
                    float precio = teclado.nextFloat();
                    System.out.println("Introduce el % de IVA (4%, 10%, 21%):");
                    int iva = teclado.nextInt();
                    double total;
                    switch (iva) {
                        case 4:
                            total = precio * 1.04;
                            System.out.println("Total: " + total);
                            break;
                        case 10:
                            total = precio * 1.1;
                            System.out.println("Total: " + total);
                            break;
                        case 21:
                            total = precio * 1.21;
                            System.out.println("Total: " + total);
                            break;
                        default:
                            System.out.println("Valor de iva incorrecto");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Introduce una nota:");
                    float nota = teclado.nextFloat();
                    switch(nota){
                        case nota < 5:
                            System.out.println("Insuficiente");
                        case nota <= 6:
                            System.out.println("Suficiente");
                        case nota <= 7:
                            System.out.println("Bien");
                        case nota <= 9:
                            System.out.println("Notable");
                        case nota < 10:
                            System.out.println("Excelente");
                        default:
                            System.out.println("Matrícula de honor");
                    }
            }
        }
    }
}
