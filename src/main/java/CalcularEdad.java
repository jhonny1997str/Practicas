import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento dd/MM/yyyy");
        String dob = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(dob,formatter);
        LocalDate fechaActual = LocalDate.now();
        Period period= Period.between(fechaNacimiento,fechaActual);
        System.out.println("En años es " + period.getYears());
    }
}
