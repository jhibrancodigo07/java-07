public class Cuentabancaria {
    public static void main(String[] args) throws Exception {
        double saldo = 1000.75;
        double cantidadARetirar = 250;
        double saldoactualizado = saldo - cantidadARetirar;
        // dividir cada cantidad para 3 amigos
        double cantidadParacadaAmigo = saldoactualizado / 3;
        boolean puedecomprarticket = cantidadParacadaAmigo >= 250;
        // con la cantidad dividida ver si cada amigo puede comprar su boleto
        System.out.println("pueden comprar el boleto " + puedecomprarticket);
        System.out.println("le di a cada amigo " + cantidadParacadaAmigo + "...");
    }
}
