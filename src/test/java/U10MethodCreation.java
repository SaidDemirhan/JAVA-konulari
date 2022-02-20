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

    //======================================================================================//

    //Method Creation- Method Olusturma
    //
    //Method Olusutururken Kullanilan Keyword’ler:
    //
    //	public int myFirstMethod () { }
    //	   1 	 2 	 3 	         4   5
    //1- Access Modifier (Erisim duzenleyici):methoda’a kimlerin erisebilecegini belirler
    //public : Herkes erisebilir
    //private: Sadece bulundugu class’da kullanilabilir
    //protected : Sadece icinde bulundugu package ve child class’lardan kullanilir
    //
    //
    //static:Main method’umuz static oldugu icin main method’dan cagiracagimiz tum
    //method’lari static yapmamiz gereklidir.
    //
    //2- Return Type: methodun ne urettigini ve bize dondurdugunu belirtir
    //int : primitive veya non-primitive tum data turlerinden olabilir
    //void: Eger method bir sey dondurmeyeceksevoid secilir.
    //
    //void disinda bir sey yazdiysak, methodun sonunda mutlaka return
    //keyword kullanilmalidir.
    //
    //Return keyword’den sonra return type’a uygun bir deger veya variable yazilmalidir.
    //
    //Return type’a sahip methodlar cagrildiklari satira, return keyword’den sonra yazilan deger veya
    // variable’i dondururler.

//    	public static void main(String[] args) {
//    		int sonuc= topla (15,25);
//    		System.out.println(sonuc);			//40
//    	}

    	public static int topla(int num1, int num2) {
    		return num1+num2;			// Return Keyword
    	}

    //3- isim: myFirstMethod :Olusturdugumuz method’un ismidir. Isim mutlaka kucuk harfle baslar,
    //birden fazla kelimeden olusursa sonraki kelimelerin ilk harfleri buyuk harf yazilir (Camel Case)
    //
    //4- () parantez: Methodlarda isimden sonra parantez kullanilir ve gerektiginde parantez icinde
    // parametre yazilir.
    //
    //*** Eger bir Class’da ayni isme sahip birden fazla method olusturmamiz gerekirse parametreleri
    // farkli yapmamiz gereklidir (Overloading)
    //
    //5- { }Body (Method Body) : { } arasinda kalan kodlarimizi yazdigimiz bolumdur.
    //
    //==========================================================//

    //	Method un yeri
    //
    //Method Class body’si icinde Main method disinda olusturulmalidir.
    //
    //public class HelloWorld {
    //
    //	public static void main(String[] args) {
    //		int sonuc= topla (15,25);				//main method
    //	}
    //
    //	public static int topla(int num1, int num2) {
    //		return num1+num2;					//method
    //	}
    //
    //}
    //==========================================================================//
    //	Method Call-Method Cagirma
    //
    //Method olusturmak method’u calistirmak icin yeterli degildir.
    //
    //Ihtiyac duyuldugunda daha onceden olusturulmus methodu calistirmak icin Method ismi
    // (parametreler ile birlikte) yazilmalidir. Bu isleme method cagirma denir.
    //
    //*** Method cagirirken parantez icine yazilan degerlere Arguments (arguman) denir.
    //
    //*** Method cagirirken kullandigimiz argumanlar ile method parametrelerinin uyumlu olmasi gereklidir.
    //
    //*** Sayi parametreleri icin char degerler de arguman olarak kullanilabilir
    //
    //	Method Overloading
    //
    //Eger bir Class’da ismi ayni fakat parametreleri farkli olan methodlar olusturursak buna Overloading denir.
    //
    //Java ayni isim ve ayni parametrelerle birden fazla method olusturulmasina izin vermez.
    //Ayni isimle birden fazla method olusturmak isterseniz method signature (metot imzasi)’nin
    // degistirilmesi gerekir.
    //Method signature’i degistirmek icin 3 yontem kullanilabilir:
    //- parametrelerin data tipleri degistirilebilir
    //- parametrelerin sayisi degistirilebilir
    //- parametre sayisi ayni olmak zorunda ise farkli data tipindeki parametrelerin sirasi degistirilir.
    //
    //*** method’un return type’ini degistirmek, access modifier’ini degistirmek veya static kelimesi
    // eklemek method signature’i degistirmez!
}
