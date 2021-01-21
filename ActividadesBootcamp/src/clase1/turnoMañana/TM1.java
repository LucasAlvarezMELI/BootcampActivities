package clase1.turnoMañana;

import java.util.Scanner;

public class TM1 {

    public static void esPar() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n = scanner.nextInt();
        if(n % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número NO es par.");
        }
    }
}
