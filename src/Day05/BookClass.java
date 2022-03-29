package Day05;

public class BookClass {

    String adı,yazarı;
    int yayınYılı;
    int sayfaSayısı;
    static int satısAdedi;


    public BookClass(String adı, String yazarı, int yayınYılı, int sayfaSayısı) {
        this.adı = adı;
        this.yazarı = yazarı;
        this.yayınYılı = yayınYılı;
        this.sayfaSayısı = sayfaSayısı;
    }

    public BookClass(String adı, String yazarı) {
        this.adı = adı;
        this.yazarı = yazarı;
    }

    public BookClass() {
    }

    public void display(){
        System.out.println("Kıtap :"+adı+" yazarı :"+yazarı+" yayın yılı :"+yayınYılı+
                " Sayfa sayısı :"+sayfaSayısı+"satış adedi"+ satısAdedi);
    }


    }

