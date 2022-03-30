package Day01;

public class QQ3 {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers
	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals
	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;

        System.out.println("byte max değeri :"+byteMax+"\n"+"byte min değeri :"+byteMin);
        System.out.println(" ");

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("short max değeri :"+shortMax+"\n"+"short min değeri :"+shortMin);
        System.out.println(" ");

        int intMax=Integer.MAX_VALUE;
        int inMin=Integer.MIN_VALUE;
        System.out.println("int max değeri :"+intMax+ "\n"+ "int Min değeri : " + inMin);
        System.out.println(" ");

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("long max değeri :"+longMax+ "\n"+ "long Min değeri : " + longMin);
        System.out.println(" ");

     double doubleMin = Double.MIN_VALUE;
       double doubleMax = Double.MAX_VALUE;
        System.out.println("double max değeri :"+doubleMax+ "\n"+ "double Min değeri : " + doubleMin);


//Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float  laptopFiyat = 9999.99F;
        double kilometre =579.6;
        char cinsiyet = 'E';
        boolean dogruMu =true;

        //   System.out.println(laptopFiyat);
        //   System.out.println("laptopFiyat = " + laptopFiyat); //soutv yazinca bu sekilde cikiyor
        //   System.out.println(kilometre);
        //   System.out.println(cinsiyet);
        //   System.out.println(dogruMu);
        /*
        coklu yorum satiri
         */

        System.out.println(laptopFiyat +"," + kilometre + "," + cinsiyet + "," + dogruMu);

    }
}
