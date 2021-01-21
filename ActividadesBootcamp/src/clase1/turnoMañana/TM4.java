package clase1.turnoMañana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TM4 {

    public static void nPrimerosPrimos() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n = scanner.nextInt();
        int index = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while(count < n) {

            if(TM3.esPrimoB(index)) {
                count++;
                list.add(index);
            }
            index++;
        }
        System.out.println("Los primer " + n + "números primos son: " + list.toString());
    }
}
