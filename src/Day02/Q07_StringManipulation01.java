package Day02;

import java.util.Scanner;

public class Q07_StringManipulation01 {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim ve soy isiminizi giriniz");
        String ısım= scan.next().toUpperCase(),soyisim= scan.next().toUpperCase(); //multiple declarations, bu sekilde kullanim uygulanabilir

        System.out.println(ısım +" "+soyisim);

    }

}
