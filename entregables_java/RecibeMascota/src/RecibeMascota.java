public class RecibeMascota {

    private String Nombreperro;
    private int edad;
    private String raza;
    private double tamanio;
    private String Nombreduenio;

    public RecibeMascota() {

    }

    public RecibeMascota(String Nombreperro, int edad, String raza, double tamanio, String Nombreduenio) {
        this.Nombreperro = Nombreperro;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.Nombreduenio = Nombreduenio;

    }

    public String getNombreperro() {
        return Nombreperro;
    }

    public void setNombreperro(String nombreperro) {
        Nombreperro = nombreperro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombreduenio() {
        return Nombreduenio;
    }

    public void setNombreduenio(String nombreduenio) {
        Nombreduenio = nombreduenio;
    }
}
