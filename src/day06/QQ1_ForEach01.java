package day06;

public class QQ1_ForEach01 {

    public static void main(String[] args) {

        //verılen arraydde önce çift olan sayıları ,sonrada tek olan sayıları for each lop kullanarak yazdırınız

        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};

        for (int each:arr
             ) {
            if (each%2==0){
                System.out.print(each+" ");
            }
        }
        System.out.println();//iki for eachın elemanlarının bırlesmemesı için sout attık

        for (int each:arr
        ) {
            if (each%2!=0){
                System.out.print(each+" ");
            }
        }
    }
}
