/*Escriba un programa Java para crear un método que tome un número
entero como parámetro y produzca una excepción si el número es impar.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = sc.nextInt();
        sc.close();
        try {
            verificarPar(numero);
            System.out.println("El número es par.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
//metodo
    public static void verificarPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número es impar.");
        }
    }
}
