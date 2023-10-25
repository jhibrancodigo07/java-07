package Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("ingresa tu edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y eres mayor de edad.");
        } else {
            System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y eres menor de edad.");
        }

        System.out.println("Tu nombre tiene " + nombre.length() + " caracteres.");
    }
}
