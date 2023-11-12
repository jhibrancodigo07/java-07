package db.models;

public class Genero {

    private long id;
    private String nombre;

    public Genero(Long id, String nombre) {
        if (id == null) {
            throw new IllegalArgumentException("id no puede ser null");
        }
        this.id = id.longValue();
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
