package baslangic1;
import java.util.Arrays;
public class arrayof {


    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));



        int[] liste2 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste2);
        System.out.println(Arrays.toString(liste2));

        int index = Arrays.binarySearch(liste2, 33);
        System.out.println("33'ün indeksi :" + index);
    }
}
