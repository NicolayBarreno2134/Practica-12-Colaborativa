import java.util.Scanner;
public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese salario: ");
            double salario = sc.nextDouble();

            Empleados empleado = new Empleados(nombre, edad, salario);
            System.out.println("Empleado creado correctamente.");

            // Probar bono
            System.out.print("Ingrese factor de bono: ");
            double factor = sc.nextDouble();
            System.out.println("Bono calculado: " + empleado.calcularBono(factor));

            // Mostrar casting
            empleado.mostrarCasting();

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage() + " | Edad ingresada: " + e.getEdadIngresada());
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
