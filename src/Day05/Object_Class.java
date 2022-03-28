package Day05;

public class Object_Class {


    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */

    public static void main(String[] args) {
        OgretmenBılgılerı obj1=new OgretmenBılgılerı();

        obj1.isim="Ahmet";
        obj1.soyisim="Tuncer";
        obj1.yas=32;
        obj1.brans="Matematik";
        obj1.tel="0542363728";



        OgretmenBılgılerı obj2=new OgretmenBılgılerı();

        obj2.isim="Gülşen";
        obj2.soyisim="Genç";
        obj2.brans="Fizik";
        obj2.yas=28;
        obj2.tel="05423293708";


    }



}
