package Day01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y/N ikilisinden birini seciniz");
        char secım=scan.next().charAt(0);

        if (secım=='Y'|| secım=='y'){
            System.out.println("YES");
        } else if(secım=='N'|| secım=='n'){
            System.out.println("NO");
        } else {
            System.out.println("hatalı seçim yaptınız");
        }
    }
}
