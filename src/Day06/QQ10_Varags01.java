package Day06;

import java.util.Scanner;

public class QQ10_Varags01 {
    public static void main(String[] args) {
        // istedigimiz kadar sayi girdigimizde
        // toplamlari bize veren bir method yazalim...

        // istedigimiz kadar sayi girdigimizde
        // toplamlari bize veren bir method yazalim...

        Scanner scan = new Scanner(System.in);

        int sayi =1;

        while (sayi>0){
            System.out.println("istediğiniz kadar sayı gırınız: "+"\nsayıların toplamı için 0 a basınız");
            sayi=scan.nextInt();
            sayıToplama();
        }

    }

    private static void sayıToplama(int... sayı){
        int toplam =0;
        for (int each:sayı
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
