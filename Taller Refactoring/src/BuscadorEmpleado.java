
public class BuscadorEmpleado {
    public Optional<Empleado> buscarEmpleadoPorNombre(String nombre) {
        return empleados.stream()
            .filter(e -> e.getNombre().equals(nombre))
            .findFirst();
    }
}

