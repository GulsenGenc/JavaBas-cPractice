package Day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class QQ1_NestedIfStatement {
     /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Lütfen yaşınızı giriniz");
         int yas=scan.nextInt();
         if (yas>=18) {
             if (yas >= 70) {
                 System.out.println("oy kullanmaya uygundur");
                 System.out.println("üç kez oy kullanabılır");
             } else if (yas >= 50) {
                 System.out.println("oy kullanmaya uygundur");
                 System.out.println("iki kez oy kullanabılır");
             } else {
                 System.out.println("oy kullanmaya uygundur");
                 System.out.println("bir kez oy kullanabılır");
             }
         } else if (yas>0 && yas<18){
             System.out.println("oy kullanmaya uygun değildir");
         } else{
             System.out.println("lütfen geçerli bir yaş değeri giriniz");
         }







     }



}
