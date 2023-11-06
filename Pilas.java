import java.util.Stack;

public class Pilas {
    public static void main(String[] args) throws Exception {

        Stack<String> camisas = new Stack<String>();
        camisas.push("camisa roja");
        camisas.push("camisa amarilla");
        camisas.push("camisa azul");
        camisas.push("camisa naranja");
        camisas.push("camisa negra");
        camisas.push("camisa cafe");

        while (!camisas.empty()) {
            System.out.println("la  camisa que se está sacando es: " + camisas.pop());
        }
    }
}
