import java.util.Scanner;

public class Empleados {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleados(String nombre, int edad, double salario) throws EdadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (edad < 18 || edad > 70) {
            throw new EdadInvalidaException("Edad inválida ingresada", edad);
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor que 0.");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double calcularBono(double factor) {
        double resultado = salario * factor;
        if (Double.isInfinite(resultado)) {
            throw new ArithmeticException("Overflow detectado en cálculo de bono.");
        }
        return resultado;
    }

    public void mostrarCasting() {
        int salarioEntero = (int) salario; // Casting explícito
        System.out.println("Salario como entero: " + salarioEntero);

        double edadDouble = (double) edad;
        System.out.println("Edad como double: " + edadDouble);
    }
}
