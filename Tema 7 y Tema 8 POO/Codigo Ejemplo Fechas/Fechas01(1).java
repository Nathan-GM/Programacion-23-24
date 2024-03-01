import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fechas01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar fecha de nacimiento al usuario
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();

        // Parsear la fecha de nacimiento
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[2]);

        // Crear objeto LocalDate con la fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        // Calcular la edad
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        // Mostrar la edad
        System.out.println("Su edad es:");
        System.out.println("Años: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Días: " + periodo.getDays());

        scanner.close();
    }
}
