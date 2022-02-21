public class U13StringBuilder {
    public static void main(String[] args) {
        //STRINGBUILDER METHODS
        //
        //	StringBuilder X=new StringBuilder();
        //
        //append();			= ekleme yapar
        //length();			= uzunlugunu verir
        //capacity();			= kapasitesini verir
        //charAt();			= index teki karakteri verir
        //delete(4,7);			= indexler arasindaki karakterleri siler(ilki dahil, ikincisi haric)
        //deleteCharAt(7);		= indexteki karakteri siler
        //equals();			= iki sb degerlerini karsilastirir TRUE/False
        //indexOf(); 			= istenen karakterin indexini verir
        //insert(3, "Java ");		= yazilan indexten baslayarak istenileni yazdirir.
        //insert(3, "Java ",1,2);	= yazilan indexten baslayarak isteni ekler
        //replace(3, 8, " Ali ");	= yazilan indexler arasindaki bolume istenilen Stringi ekler
        //reverse();			= tersine cevirir
        //setCharAt(3, ‘k’);		= indexteki karakteri istenilen karakter yapar
        //subSequence(3,7);		= indexler arasindaki karakterleri getirir
        //toString();			= String e cevirir.
        //TrimToSize();			= kapasite ile Lent i birbirine esitler
        //compareTo();			= iki stringdeki tum karakterlerin esitligini kontrol eder. (esitse=0)


        //=============================================================//

        //	String Builder
        //
        //➢ StringBuilder “mutable” yani değiştirilebilir String elde etmemize olanak tanır.
        //
        //➢ Böylece hafızada her seferinde yeni bir alan açılmadan var olan alan üzerinde
        // değişiklik yapılabilir.
        // Bu da StringBuilder sınıfını hafıza kullanımı olarak String sınıfının önüne geçirir.
        //
        //➢ StringBuilder thread-safe değildir. Yani synchronized değildir.
        // Thread’li bir işlem kullanılacaksa StringBuilder kullanılması güvenli değildir.
        //
        //Not:➢  StringBuffer, StringBuilder’a benzer. StringBuilder, StringBuffer’dan hizlidir.
        // Multi-thread icin StringBuffer kullanilir.
        //
        //	StringBuilder olusturmak icin;

        StringBuilder sb1 = new StringBuilder() ; //===> Bos bir StringBuilder olusturur

        StringBuilder sb2 = new StringBuilder("animal"); //===> Belli bir degeri olan StringBuilder olusturur

        StringBuilder sb3 = new StringBuilder(5); //===> Ilk uzunlugu tahmin edilen bir StringBuilder olusturur.




        //	String Builder Method’lari
        //
        //1) append(); StringBuilder’a ekleme yapar. (arka arkaya ekleme yapmaya chain denir.)
        	StringBuilder sb = new StringBuilder();
        	sb.append("Mehmet");// sona ekler.

        	sb.append("mehmet",0,4); //mehmetmehm olur.
        //
        //2) length(); uzunlugunu verir.
        	 System.out.println(sb.length()); // 6
        //
        //3) capacity(); StringBuilder’un kapasitesini verir. (16 ile baslar ve 2kati+2 belirlenmemisse)
        //
        //4) charAt(); StringBuilder’da istenen index’deki karakteri verir
        //
        //5) delete(4,7); StringBuilder’da istenen index’ler arasindaki karakterleri siler.
        //
        //6) deleteCharAt(7); StringBuilder’da istenen index’deki tek karakteri siler.
        //
        //7) equals(); Iki StringBuilder’in degerlerini karsilastirir.
        //
        //	NOT1: equals() method’unda parantez icine String yazarsak hata vermez ama false doner.
        //
        //	NOT2: equals() method’u == gibi calisir
        //	hem icerik hem de ref karsilastirmasi yapar.
        //
        //8) indexOf(); StringBuilder’da istenen karakterin index’ini verir.
        //
        //9) insert(3, "Java "); StringBuilder’da istenen indexden baslayarak istenen karakteri ekler.
        //	Harfi silmiyor 3. index ve sonrasina istenileni ekliyor.
        //	ille char yazmak zorunda degiliz. value de alabilir. (3 gibi) obje de eklenir.(Array gibi)
        //
        //10) insert(3, "Java ",1,2); StringBuilder’da istenen indexden baslayarak verilen String’in istenen parcasini ekler.
        //
        //	3.indexten baslar ve sadece a yi koyar
        //
        //11) replace(3, 8, " Ali "); StringBuilder’da istenen index’ler arasindaki bolumun yerine verilen String’i ekler.
        //	3 4 5 6 7 yi siliyor ve isterseniz döndürüyor ve yerine Ali yazdiriyor.
        //
        //12) reverse(); StringBuilder’i tersine cevirir.
        //
        //13) setCharAt(3, ‘k’); StringBuilder’da istenen index’deki karakteri istedigimiz karakter yapar.
        //
        //14) subSequence(3,7); StringBuilder’da istenen indexler arasindaki karakterleri döndürür.
        //(Substring Stringdeki karsiligi)
        //
        //15) toString(); StringBuilder’i String’e cevirir.
        //	toString()’den sonra nokta koyup String method’lari kullanilabilir.
        //
        //16) trimToSize(); StringBuilder’in capacity ile length’ini esitler.
        //
        //17) compareTo(); iki StringBuilder’in tum karakterlerinin esitligini kontrol eder. (0 ise esit)
    }
}
