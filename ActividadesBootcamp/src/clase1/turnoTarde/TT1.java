package clase1.turnoTarde;

import java.util.Arrays;

public class TT1 {

    public static void TT1() {
        System.out.println("Hello world!");


        int arr[] = {123123,1231,2,122,12334,1223};
        radixSort(arr);
        String arrString[] = convertArrIntToString(arr);
        System.out.println("arreglo string: " + Arrays.toString(arrString));

        for(int i:arr) {
            System.out.println(i);
        }

    }

    private static void radixSort(int[] arr) {
    }

    private static String[] convertArrIntToString(int[] arrInt) {
        String arrString[] = new String[arrInt.length];
        int index = 0;
        for(int number : arrInt) {
            arrString[index] = ""+number;
            index++;
        }
        return arrString;
    }
}
