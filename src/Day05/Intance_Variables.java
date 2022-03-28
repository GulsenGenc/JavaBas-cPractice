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


        isimDegistir(isim);
        System.out.println(isim);
       soyisim= soyisimDegıstır(soyisim);
        System.out.println("isim :"+ "yeni soyisim :"+soyisim);


    }

    private static String soyisimDegıstır(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yenı soyisminizi giriniz");
        String yenıSoyısım=scan.nextLine();

        return yenıSoyısım;
    }

    public static void isimDegistir(String isim) {

        isim="gülşen";

      System.out.println("isim :"+isim);
    }
}
