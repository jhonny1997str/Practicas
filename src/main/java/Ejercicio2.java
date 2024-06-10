import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un numero entero positivo :");
        num = scanner.nextInt();


        for(int i = 1; i < num; i++){
            if (i % 2 == 0){
                System.out.println(i + " : es par");
            } else {
                System.out.println(i + " : es impar");
            }





        }
        scanner.close();

    }


}




