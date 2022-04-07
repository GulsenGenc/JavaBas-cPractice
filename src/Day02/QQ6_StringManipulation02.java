package Day02;

import java.util.Scanner;

public class QQ6_StringManipulation02 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("String 1 :");
        String str1 = scan.nextLine();
        System.out.print("String 2 :");
        String str2 = scan.nextLine();

        birlestir(str1,str2);
        birlestir2(str1,str2);
    }

    public static void birlestir2(String str1, String str2) {
        String ılkHarfsız1=str1.substring(1);//1. indeksten ıtıbaren al .
        String ılkHarfsız2=str2.substring(1);//1.ındeksten ıtıbaren al
        System.out.println("Stringlerin ilk harfsiz hallerinin birleşimi :"+ılkHarfsız1+" "+ılkHarfsız2);
    }

    public static void birlestir(String str1, String str2) {
        System.out.println("Strinlerin birleşimi :" +str1+" " +str2);
        //veya concat methodu ile
        System.out.println("Stringlerin concat ile birleşimi :"+ str1.concat(" "+str2));
    }
}
