import java.util.Scanner;

public class Practica {
    private int filas;
    private int columnas;
    private int[][] numeros;

    // Constructor
    public Practica(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.numeros = new int[filas][columnas];
    }

    //  getter
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    // setter
    public void setVector(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.numeros = new int[filas][columnas];
    }

    // Algoritmo
    public void algoritmo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas;j++){
                System.out.println("Ingrese el elemento de la posicion " + (i + 1) + "," + (j + 1) + " :");
                numeros[i][j] = scanner.nextInt();

            }

        }
    }

    //  mostrar información
    public void mostrarinfo() {
        System.out.println("La Matriz creada  es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas;j++){
                System.out.print("[" + numeros[i][j] + "]");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas : ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas : ");
        int columnas = scanner.nextInt();

        // instancia
        Practica practica = new Practica(filas, columnas);

        //  algoritmo
        practica.algoritmo();

        // Mostrar la información
        practica.mostrarinfo();
    }
}
