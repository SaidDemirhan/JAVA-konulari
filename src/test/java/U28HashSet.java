public class U28HashSet {
    //SET
    //
    //- Bütün SET kümelerinin icinde Ayni elemandan sadece bir tane bulinabilir.(UNIQUE)
    //- Eger ayni eleman eklenirse eskisinin üzerine yenisi yazilir.
    //
    //*******************************************************************************************************
    //34-HASHSET
    //
    //	Set<String> hs1 = new HashSet<>();	seklinde olusturulur.
    //
    //- Dublication yok
    //- eklenen elemanlar sirali sekilde olmasi olmayabilir. [A, B, C, D, E, Z, M] gibi.
    //- bir HasCollection olsturuldugunda java 16 adet(0-15) bucket olusturur.
    //- her eklenen eleman bu bucked lara yerlestirilir.
    //- Bucked larin %75 i doldugunda java 16 bucket daha olusturur. Buna Load Factor denir.
    //- Java, key üzerinden bir HashCode uretir.*
    //* HashCode()	= her karakterin degerine göre HashSet in aldigi sayisal bir degerdir
    //- HashCode larin cakismasina Hash Collision denir. Bunun cözümü icin;
    //	a-LinkedList kullanmak,
    //	b-Formulle belirlenen yeni bir HashCode üretmek.
    //- HashSet, null degere izin verir. Cünkü null un da HasSet te karsiligi(0) vardir.
    //
    //***örnek***
    //-Verilen bir Array i tekrarsiz Array haline getirip yazdiralim.
    //
    //    public static void main(String[] args) {
    //	int arr[]={2,3,4,3,5,3,6,4,7,4,8,5};			//arrayimiz
    //	int tekrarsizArray[]= tekrarSil(arr);	       	//method olusturuyoruz
    //    System.out.println(Arrays.toString(tekrarsizArray));	//[2, 3, 4, 5, 6, 7, 8]
    //    }
    //    public static int[] tekrarSil(int[] arr) {		//methodumuz
    //        Set<Integer> set1=new HashSet<>();			//hashSet olusturduk
    //        for (Integer w:arr) {					//for each ile
    //            set1.add(w);						//hashset imize ekledik
    //        }
    //        System.out.println(set1);  			    //HashSet olarak yadirdik[2, 3, 4, 5, 6, 7, 8]
    //        int tekrarsizArray[]=new int[set1.size()];		//yeni array olusturduk
    //	 int index=0;							//index yardimiyla
    //        for (int w:set1) {						//for each üzerinden yeni array a ekledik.
    //            tekrarsizArray[index]=w;
    //            index++;
    //        }
    //        return tekrarsizArray;					//yukariya yazdirmasi icin döndürdük.
    //    }
    //
    //***-***
    //
    //add()
    //addAll()
    //clear()
    //contains()
    //containsAll()	= bir collectionuun tamamini icerip icermedigini boolean olara getirir.
    //Equals()	= iki collection un ayni degerlere sahip olup olmadigini boolean olarak getirir.
    //IsEmpty()
    //remove()
    //romoveAll()	= HashSet in icindeki diger collectionu siler ve sildiklerini istenirse getirir.
    //		  Bir tane bile kesisen bulup silerse true döner.
    //RetainAll()	= HashSet in icindeki yazilan diger collectionu korur, geriye kalan degerleri siler.
    //
    //
    //
    //*******************************************************************************************************

    //Collections / Sets
    //
    //Set (interface) , matematikteki kume mantigiyla calisir, her element unique’dir.
    //
    //Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
    //
    //Set, direkt kullanilamaz cunku interface’dir ve obje olusturulamaz.
    //
    //3 Child class’indan bizim icin onemli olan ozellige gore istedigimizi kullanabiliriz.
    //
    //Collections’in bir ozelligi de farkli data turunden elementleri ekleyebilmenizdir.
    //
    //Bunun icin esitligin sol tarafindaki <> (data turu) kaldirilabilir veya data turu olarak Object yazilabilir. Ancak bu tavsiye edilmez cunku Java’nin cok fazla Casting yapmasi gerekir.
    //
    //Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı yaratma sürecine verilen isimdir.
    //
    //Bu işlem, hash fonksiyonları olarak bilinen matematiksel formüllerin kullanımıyla yapılır.
    //
    //Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum bilgilere ulasabilirsiniz.
    //
    //Farklı hash fonksiyonları farklı büyüklüklerde çıktı yaratır fakat her bir hashing algoritması için olası çıktı büyüklüğü her zaman sabittir.
    //
    //Bir collection’in hash degerini ogrenmek icin hashCode() method’u kullanilir.
    //
    //	Hashing Nasil Calisir ?
    //
    //➢ Bir HashCollection olusturuldugunda Java 16 bucket olusturur ve elementleri bu bucket’lara yerlestirmeye baslar.
    //
    //➢ Olusturulan bucket’larin %75’i doldugunda Java 16 bucket daha olusturur. Buna Load Factor denir.
    //
    //➢ Java kullandigimiz key’i kullanarak hash kod uretir. Eger uretilen hash kod daha once uretilen bir hash kod ile ayni ise buna Hash Collision denir
    //
    //➢ Hash Collision gerceklestiginde cozum icin 2 yol vardir.
    //	A) LinkedList kullanmak
    //	B) Formulle belirlenen yeni bir hash kod uretmek
    //
    //HashSet, elemanlari icin herhangi bir siralama yapmaz.
    //
    //Elemanlari yazdirdiginizda veya cagirdiginizda herhangi bir siralama ile gelebilirler.
    //
    //HashSet, duplication’a izin vermez.
    //
    //Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
    //
    //HashSet, null degere izin verir.
    //
    //Bununla birlikte birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri olur.
    //
    //
    //	Collection Set Method’lari
    //
    //1) add(); Set’e eleman ekler
    //
    //2) addAll(coll); istenen collection’in tum elemanlarini ekler
    //
    //3) clear(); Tum elemanlari siler
    //
    //4) contains(eleman); istenen eleman sett’te varsa true, yoksa false döndurur
    //
    //5) containsAll(coll); istenen coll’in tumu aranan sette var ise true, yoksa false döndurur
    //
    //6) equals(set2); istenen set’le tum elemanlar ayni ise true, yoksa false döndurur
    //
    //7) isEmpty(); Sette hic eleman yoksa true, varsa false döndurur
    //
    //8) remove(eleman); istenen eleman bulursa siler ve true döndurur, bulamazsa false döndurur
    //
    //9) removeAll(coll); coll’nin tum elemanlarini bulursa siler ve true döndurur, bulamazsa false döndurur
    //
    //10) size(); set’in eleman sayisini verir
}
