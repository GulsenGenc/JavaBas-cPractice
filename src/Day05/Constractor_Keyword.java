package Day05;

public class Constractor_Keyword {
    /* Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed

     */

    public static void main(String[] args) {

        BookClass kıtap1=new BookClass("küçük ağa","tarık buğra");

       BookClass kıtap2=new BookClass("gülşen","ömer faruk",2022,444);

        System.out.println(kıtap1.yazarı);
        System.out.println(kıtap2.yazarı);

        System.out.println(BookClass.satısAdedi);//statıc varıable a clas ısmı ıle ulasılır .objeye gerek yok.
        BookClass.satısAdedi=400000;
        System.out.println(BookClass.satısAdedi);

        kıtap1.display();//Kıtap :küçük ağa yazarı :tarık buğra yayın yılı :0 Sayfa sayısı :0satış adedi400000
        kıtap2.display();//Kıtap :gülşen yazarı :ömer faruk yayın yılı :2022 Sayfa sayısı :444satış adedi400000





    }


}
