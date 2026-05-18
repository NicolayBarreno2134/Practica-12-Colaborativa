public class Empleados {
    protected String nombre;
    protected String edadStr;   // Guardamos la edad como String
    protected int edad;         // También la convertimos a int
    protected double salario;

    public Empleados(String nombre, String edadStr, double salario) throws EdadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (edadStr == null || edadStr.trim().isEmpty()) {
            throw new IllegalArgumentException("La edad no puede estar en blanco.");
        }

        // Intentamos convertir el String a int
        try {
            this.edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La edad debe ser un número entero válido.");
        }

        if (edad < 18 || edad > 70) {
            throw new EdadInvalidaException("Edad inválida ingresada", edad);
        }

        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor que 0.");
        }

        this.nombre = nombre;
        this.edadStr = edadStr;
        this.salario = salario;
    }

    public void mostrarCasting() {
        int salarioEntero = (int) salario;
        System.out.println("Salario como entero: " + salarioEntero);

        double edadDouble = (double) edad;
        System.out.println("Edad como double: " + edadDouble);
    }
}
