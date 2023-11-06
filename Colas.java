import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) throws Exception {
        Queue<String> usuarios = new LinkedList<String>();
        usuarios.add("Erick");
        usuarios.add("Juan carlos");
        usuarios.add("Evelyn");
        usuarios.add("Mauricio");
        usuarios.add("Alfonso");

        System.out.println("el nombre eliminado es: " + usuarios.poll());
        System.out.println("el nombre eliminado es: " + usuarios.poll());
        System.out.println("el nombre eliminado es: " + usuarios.poll());
        System.out.println("el nombre proximo a eliminar es: " + usuarios.peek());

        System.out.println(usuarios);
    }
}
