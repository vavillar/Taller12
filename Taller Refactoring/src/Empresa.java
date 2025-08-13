import java.util.List;

public class Empresa {
    public List<Empleado> filtrarEmpleados(CriterioBusqueda criterio) {
        return empleados.stream()
            .filter(criterio::cumple)
            .toList();
    }
}

