import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fechas02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar fecha al usuario
        System.out.print("Ingrese una fecha (dd/mm/aaaa): ");
        String fechaStr = scanner.nextLine();

        // Parsear la fecha
        LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Solicitar al usuario la cantidad de días y la operación a realizar
        System.out.print("Ingrese el número de días: ");
        int numDias = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("¿Quiere sumar (+) o restar (-) días? ");
        char operacion = scanner.nextLine().charAt(0);

        // Calcular y mostrar la fecha resultante
        LocalDate fechaResultante;
        if (operacion == '+') {
            fechaResultante = fecha.plusDays(numDias);
        } else if (operacion == '-') {
            fechaResultante = fecha.minusDays(numDias);
        } else {
            System.out.println("Operación no válida.");
            scanner.close();
            return;
        }

        System.out.println("La fecha resultante es: " + fechaResultante.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        scanner.close();
    }
}