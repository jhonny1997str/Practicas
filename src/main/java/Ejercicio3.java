import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Escribe la cadena para verificar si es palindromo : ");
        texto = scanner.nextLine();
        boolean esPalindromo = esPalindromo(texto);
        System.out.println("¿La cadena es un palíndromo? " + esPalindromo);
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }
}
