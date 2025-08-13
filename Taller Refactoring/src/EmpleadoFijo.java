public class EmpleadoFijo extends Empleado {
    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento,
            double tarifaHora) {
        super(nombre, salarioBase, horasTrabajadas, departamento, tarifaHora);
        //TODO Auto-generated constructor stub
    }

    private double bonoAnual;

    @Override
    public double calcularSalario() {
        return salarioBase + calcularHorasExtra() + calcularBonoDepartamento() + bonoAnual;
    }

    @Override
    protected double calcularBonoDepartamento() {
        return departamento.equals("Contabilidad") ? 10 : 0;
    }

    @Override
    protected void imprimirDetallesEspecificos() {
        System.out.println("Bono anual: " + bonoAnual);
    }
}