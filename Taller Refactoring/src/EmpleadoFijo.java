public class EmpleadoFijo extends Empleado {
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