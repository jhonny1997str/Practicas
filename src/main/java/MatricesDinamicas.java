import java.util.Scanner;

public class MatricesDinamicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1, filas = 0, columnas = 0;
        System.out.println("Ingrese la cantidad de filas : ");
        filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas : ");
        columnas = scanner.nextInt();
        int numeros[][] = new int[filas][columnas];
        for (int i = 0; i < filas;i++){
            for (int j = 0; j < columnas;j++){
                numeros[i][j] = contador;
                contador++;

            }

        }
        for ( int i = 0; i < filas;i++){
            for (int j = 0; j < columnas;j++){
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println("");

        }

    }
}
