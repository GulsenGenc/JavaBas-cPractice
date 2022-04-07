package Day02;

public class QQ3_SwitchCase01 {
    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String gun="pazartesi";

        switch (gun){
            case "pazartesi":
            case "salı":
                System.out.println("Java dersi günleri");
                break;
            case "perşembe":
            case "cuma" :
                System.out.println("selenyum dersi günleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQL dersi günleri");
                break;
            default:
                System.out.println("izin günü");
        }
    }
}
