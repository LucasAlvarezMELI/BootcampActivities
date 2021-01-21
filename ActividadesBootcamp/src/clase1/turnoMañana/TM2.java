package clase1.turnoMañana;

import java.util.Scanner;

public class TM2 {

    public static void esMultiplo() {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextInt();
        if(a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " NO es múltiplo de " + b);
        }
    }
}
