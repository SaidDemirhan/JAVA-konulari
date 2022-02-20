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
}
