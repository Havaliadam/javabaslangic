package baslangic1;

public class komutlar {
    public static void main(String[]args){


        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }




    }
}
