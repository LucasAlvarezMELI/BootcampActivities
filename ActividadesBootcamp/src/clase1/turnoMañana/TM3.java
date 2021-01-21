package clase1.turnoMañana;

import java.util.Scanner;

public class TM3 {

    public static void esPrimo() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n = scanner.nextInt();
        int index = 1;
        int count = 0;

        while(index<10 || index<n) {

            if(n % index == 0) {
                count++;
            }
            index++;
        }

        if(count<=2) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número NO es primo.");
        }
    }

    public static boolean esPrimoB(int n) {
        int index = 1;
        int count = 0;

        while(index<10 || index<n) {

            if(n % index == 0) {
                count++;
            }
            index++;
        }

        if(count<=2) {
            return true;
        } else {
            return false;
        }
    }
}
