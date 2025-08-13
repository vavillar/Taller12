public abstract class Empleado {
    protected static final int HORAS_NORMALES = 40;
    protected static final double TARIFA_HORA_EXTRA = 50;

    protected String nombre;
    protected double salarioBase;
    protected int horasTrabajadas;
    protected String departamento;
    protected double tarifaHora;
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

    
}