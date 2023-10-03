package ejerciciosjava;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);  // todo metodo debe estar en el main
        String nombre;
        System.out.println("Escribe tu nombre");
        nombre=sc.nextLine();
        System.out.println("hola "+ nombre);

        int a; // ingresar las otras varibales 
        int b; 
        int suma;
        System.out.println("ingresa el primer numero");// utilizar una clase para imprimir 
        a=Integer.parseInt(sc.nextLine());//utilizar un integrador con la varibale a definir 
        System.out.println("a = " + a);
        System.out.println("ingresa el segundo numero");
        b=Integer.parseInt(sc.nextLine());
        System.out.println("b =" + b);
        suma = a + b;// se realiza la suma de manera directa y despues se imprime
        System.out.println(suma);

        sc.close();

    }

    
}
