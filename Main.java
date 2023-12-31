import java.util.Scanner;
import java.util.Random;

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
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("17. Ejercicio 17");
            System.out.println("19. Ejercicio 19");
            System.out.println("20. Ejercicio 20");
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
                    if(nota < 5) {
                        System.out.println("Insuficiente");
                    }
                    else if( nota <= 6){
                        System.out.println("Suficiente");
                    }
                    else if(nota <= 7){
                            System.out.println("Bien");
                    }
                    else if(nota <= 9){
                            System.out.println("Notable");
                    }
                    else if(nota < 10) {
                        System.out.println("Excelente");
                    }
                    else{
                            System.out.println("Matrícula de honor");
                    }
                    break;

                case 5:
                    for (int i=1; i<=20; i++){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                    break;

                case 6:
                    for (int i=1;i<=200;i++){
                        if (i%2 == 0){
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                    break;

                case 7:
                    for(int i =1;i<=200;i++){
                        if(i%2 !=0){
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Introduce el número de términos que desees: ");
                    int term = teclado.nextInt();
                    int sumatorio = 0;
                    int prod = 1;
                    for (int i=1;i<=term;i++){
                        System.out.print(i+" ");
                        sumatorio += i;
                        prod *= i;
                    }
                    System.out.println();
                    System.out.println(sumatorio);
                    System.out.println(prod);
                    break;

                case 17:
                    System.out.println("Piensa un número entre 1 y 100, y dime si es mayor, menor o igual al que yo te propongo.");
                    Random num = new Random();
                    int max = 101;
                    int min = 1;
                    int valor = num.nextInt(max-min)+min;
                    String comparacion;
                    System.out.println("El número es mayor, igual o menor que 100?");
                    comparacion = teclado.next();
                    while (!comparacion.equals("igual")) {
                        System.out.println("El número es mayor, igual o menor que " + valor + "?");
                        comparacion = teclado.next();
                        if (comparacion.equals("mayor")) {
                            min = valor+1;
                        } else if (comparacion.equals("menor")) {
                            max = valor-1;
                        }else {
                            System.out.println("Tu número es "+valor);
                        }
                        valor = num.nextInt(max - min) + min;
                    }
                    break;
                case 19:
                    int operacion;
                    int a;
                    int b;
                    double res = 0;
                    System.out.println("Introduce el primer número:");
                    a = teclado.nextInt();
                    System.out.println("Introduce el segundo número:");
                    b = teclado.nextInt();
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("0. Salir");
                    System.out.println("Introduce la opcion deseada:");
                    operacion = teclado.nextInt();
                    switch(operacion){
                        case 1:
                            res= a+b;
                            break;
                        case 2:
                            res = a-b;
                            break;
                        case 3:
                            res = a*b;
                            break;
                        case 4:
                            res = (double)a/b;
                        case 0:
                            break;
                    }
                    System.out.println("Resultado: "+res);
                    break;
                case 20:
                    int numero;
                    System.out.println("Introduce un número:");
                    numero = teclado.nextInt();
                    for (int i = 0; i < numero; i++){
                        for(int espacios = numero-i; espacios > 0; espacios--){
                            System.out.print(" ");
                        }
                        for (int asteriscos = 0; asteriscos <= i; asteriscos++){
                            System.out.print("* ");
                        }

                        System.out.println();
                    }
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
}
