public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, "Sistemas", "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas",200,20,"Medico",6, "Masculino");

        empresa.contratarEmpleado(emp1);

        emp1.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}