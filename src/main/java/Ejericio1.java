import java.util.Scanner;

public class Ejericio1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int trm = 3837, cop = 0, conver = 0;

        System.out.println("Ingrese lla cantidad en COP para convertir a USD:");
        cop = scanner.nextInt();
        conver = cop * trm;
        System.out.println("la conversion es de " + conver);


        scanner.close();





    }
}
