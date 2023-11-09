package interfaces;

import java.util.List;

public interface Repositoryinterface<T> {
    public T recuperarid(long id);

    public List<T> recuperarTodos();

    public void agregar(T entidad);

    public void modificar(T entidad);

    public void eliminar(T entidad);

}
