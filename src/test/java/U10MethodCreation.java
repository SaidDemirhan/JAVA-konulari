import java.util.Scanner;

public class U10MethodCreation {
    public static void main(String[] args) {
        //Ana methoddur.
        //Bir methodu olusturmak calismasi icin yeterli degildir,
        //method call yapmaliyiz ki calisabilsin
        int sonuc=toplama(5,8); //ya direkt yazariz
        System.out.println(sonuc);

        System.out.println("toplama(2,3) = " + toplama(2, 3)); //ya da burda yazdiririz.

        //============================================================================//

        //Kullanicidan 2 sayi iste ve tolam ve carpimi yazdir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz:");
        int sayiA=scanner.nextInt();
        int sayiB=scanner.nextInt();
        toplam(sayiA,sayiB);
        carpma(sayiA,sayiB);
    }

    private static void carpma(int sayiA, int sayiB) {
        System.out.println("carpim :"+sayiA*sayiB);
    }

    private static void toplam(int sayiA, int sayiB) {
        System.out.println("toplam: "+(sayiA+sayiB));   //eger parantez koymazsak hata aliriz.
    }

    //=================================================================//

    public  String kelimeMethodu(String kelime){
        //Herkes ulasabilir
        return kelime;
    }
    private int sayiMethodu(int kesir){
        //sadece bulundugu class kullanabilir.
        return kesir;
    }
    protected static int toplama(int sayi1,int sayi2){
        //Sadece icinde bulundugu package ve child class lar ulasabilir.
        return sayi1+sayi2;
    }
    //Default olursa Method Sadece kendi Package i ulasabilir.



    //Statik olan methodlar statik olmayan methodlara ulasamazlar.

}
