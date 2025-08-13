public class EmpleadoTemporario extends Empleado {
private int mesesContrato;
private String genero; // Ahora es específico de esta clase

public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas,
String departamento, int mesesContrato, String genero) {
super(nombre, salarioBase, horasTrabajadas, 0, departamento); // Usa constructor de Empleado
this.mesesContrato = mesesContrato;
this.genero = genero;
}

@Override
protected void imprimirDetallesEspecificos() {
System.out.println("Meses de contrato: " + mesesContrato);
System.out.println("Género: " + genero);
}

@Override
public double calcularSalario() {
    return salarioBase*mesesContrato;

}

@Override
protected double calcularBonoDepartamento() {
    throw new UnsupportedOperationException("Unimplemented method 'calcularBonoDepartamento'");
}
}

