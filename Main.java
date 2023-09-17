import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();

        System.out.print("Ingrese la dirección de la empresa: ");
        String direccionEmpresa = scanner.nextLine();

        System.out.print("Ingrese el teléfono de la empresa: ");
        String telefonoEmpresa = scanner.nextLine();

        System.out.print("Ingrese el NIT de la empresa: ");
        String nitEmpresa = scanner.nextLine();

        Empresa miEmpresa = new Empresa(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese el correo del empleado: ");
        String correoEmpleado = scanner.nextLine();

        System.out.print("Ingrese el rol del empleado: ");
        String rolEmpleado = scanner.nextLine();

        Empleado empleado = new Empleado(nombreEmpleado, correoEmpleado, miEmpresa, rolEmpleado);

        System.out.print("Ingrese el monto del movimiento: ");
        double montoMovimiento = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Ingrese el concepto del movimiento: ");
        String conceptoMovimiento = scanner.nextLine();

        System.out.print("Ingrese el usuario encargado del movimiento: ");
        String usuarioEncargadoMovimiento = scanner.nextLine();

        MovimientoDinero movimiento = new MovimientoDinero(montoMovimiento, conceptoMovimiento, usuarioEncargadoMovimiento);

        // Imprimir información
        System.out.println("Empresa: " + miEmpresa.getNombre());
        System.out.println("Dirección: " + miEmpresa.getDireccion());
        System.out.println("Teléfono: " + miEmpresa.getTelefono());
        System.out.println("NIT: " + miEmpresa.getNit());

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Correo: " + empleado.getCorreo());
        System.out.println("Empresa: " + empleado.getEmpresa().getNombre());
        System.out.println("Rol: " + empleado.getRol());

        System.out.println("Movimiento: Monto $" + movimiento.getMonto());
        System.out.println("Concepto: " + movimiento.getConcepto());
        System.out.println("Usuario Encargado: " + movimiento.getUsuarioEncargado());

        // Cierra el escáner
        scanner.close();
    }
}
