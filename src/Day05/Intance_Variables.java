package Day05;

import java.util.Scanner;

public class Intance_Variables {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */


    public static void main(String[] args) {
        String isim="Ali";
        String soyisim="Genç";
        String telNo="038736363737";


        isimDegistir(isim,soyisim,telNo);
        System.out.println(isim+" "+soyisim+" "+telNo);//Ahmet TUNCER 5436272728
       soyisim= soyisimDegıstır(soyisim);
        System.out.println(soyisim);//genç
        System.out.println("isim : "+isim +" yeni soyisim :"+soyisim);//isim : Ali yeni soyisim :genç



    }

    private static String soyisimDegıstır(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yenı soyisminizi giriniz : ");
        String yenıSoyIsım=scan.nextLine();

        soyisim=yenıSoyIsım;
        return yenıSoyIsım;
    }

    private static void isimDegistir(String isim, String soyisim, String telNo) {
        isim="Ahmet";
        soyisim="TUNCER";
        telNo="5436272728";

        System.out.println(isim+" "+soyisim+" "+telNo);

    }

}
