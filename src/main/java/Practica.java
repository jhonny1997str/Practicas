import java.util.Scanner;

public class Practica {
    private int filas;
    private int columnas;
    private int[][] numeros;

    // Constructor
    public Practica(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.numeros = new int[filas][columnas]; // Inicializamos el array de números con el tamaño del vector
    }

    // Métodos getter
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    // Métodos setter
    public void setVector(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.numeros = new int[filas][columnas]; // Actualizamos el tamaño del array de números
    }

    // Algoritmo para llenar el vector
    public void algoritmo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas;j++){
                System.out.println("Ingrese el elemento de la posicion " + (i + 1) + "," + (j + 1) + " :");
                numeros[i][j] = scanner.nextInt();

            }

        }
    }

    // Método para mostrar información del vector
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

        // Crear una instancia de Practica con el tamaño del vector
        Practica practica = new Practica(filas, columnas);

        // Llenar el vector con el algoritmo
        practica.algoritmo();

        // Mostrar la información del vector
        practica.mostrarinfo();
    }
}
