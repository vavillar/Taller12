import java.util.List;
import java.util.Optional;

public abstract class Empleado {
    protected static final int HORAS_NORMALES = 40;
    protected static final double TARIFA_HORA_EXTRA = 50;

    protected String nombre;
    protected double salarioBase;
    protected int horasTrabajadas;
    protected String departamento;
    protected double tarifaHora;
    protected List<Empleado> empleados;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this. tarifaHora = tarifaHora;
    }

    public Empleado(String nombre2, double salarioBase2, int horasTrabajadas2, String departamento2,
            double tarifaHora2) {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    

    protected abstract void imprimirDetallesEspecificos();

    public abstract double calcularSalario();

    protected double calcularHorasExtra() {
        if (horasTrabajadas > HORAS_NORMALES) {
            return (horasTrabajadas - HORAS_NORMALES) * TARIFA_HORA_EXTRA;
        }
        return 0;
    }

    protected abstract double calcularBonoDepartamento();

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        imprimirDetallesEspecificos(); // Método abstracto para detalles únicos
    }
    public Optional<Empleado> buscarEmpleadoPorNombre(String nombre) {
        return empleados.stream()
            .filter(e -> e.getNombre().equals(nombre))
            .findFirst();
    }
}


    

