package Day02;

public class QQ2_NestedTenary {
    public static void main(String[] args) {
        /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char fınalNotu = 'M';
        String result;

        result=(fınalNotu=='A' ? "Gayet başarılı" : (fınalNotu=='B' )? "Başarılı":(fınalNotu=='C' )? "Ha gayret" : "Diğerleri");

        System.out.println(result);
    }
}
