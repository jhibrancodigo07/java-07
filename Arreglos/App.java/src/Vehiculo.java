
public abstract class Vehiculo {

    private String Tipo;
    private int pasajeros;
    private double velocidad;
    private int numeroLlantas;
    private boolean carga;

    public Vehiculo() {

    }

    public Vehiculo(String Tipo, int pasajeros, double velocidad) {
        this.Tipo = Tipo;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;

    }

    abstract double acelerar();

    abstract double desacelerar();

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

}
