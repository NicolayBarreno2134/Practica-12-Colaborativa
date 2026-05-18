import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese edad (como texto): ");
            String edadStr = sc.nextLine();

            System.out.print("Ingrese salario: ");
            double salario = sc.nextDouble();

            Empleados empleado = new Empleados(nombre, edadStr, salario);
            System.out.println("Empleado creado correctamente.");

            empleado.mostrarCasting();

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage() + " | Edad ingresada: " + e.getEdadIngresada());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
