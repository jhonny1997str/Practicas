import java.util.Scanner;

public class VectorDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = 0;

        System.out.println("Ingrese la longitud del vector dinamico : ");
        len = scanner.nextInt();
        int numeros[] = new int[len];

        for (int i = 0; i < numeros.length;i++){
            System.out.println("Ingrese el elemento # " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length;i++){
            System.out.print("[" + numeros[i] + "]");
        }
    }
}
