package clase1.turnoMañana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TM5 {

    public static void nPrimerosPrimos() {
        int n;
        int m;
        int d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dígito a encontrar: ");
        d = scanner.nextInt();
        System.out.print("Ingrese la cantidad de números a encontrar: ");
        n = scanner.nextInt();
        System.out.print("Ingrese cuantas veces debe repetirse el dígito en dichos números: ");
        m = scanner.nextInt();
        int index = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while(count < n) {

            if(contieneElDigitoMVeces(index, d, m)) {
                count++;
                list.add(index);
            }
            index++;
        }
        System.out.println("Los primeros " + n + "números que contienen el dígito: " + d + ", " + m + "cantidad de veces son: " + list.toString());
    }

    private static boolean contieneElDigitoMVeces(int numero, int digito, int veces) {
        String aux = "" + numero;
        String regex = "[^" + digito +"]";
        String cant = aux.replaceAll(regex, "");

        if(veces <= cant.length()) {
            return true;
        }
        else {
            return false;
        }

    }
}
