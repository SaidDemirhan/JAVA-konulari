import java.util.*;

public class U04ArrayList {
    public static void main(String[] args){
        ArrayList <String> isimler=new ArrayList<>(3);
        isimler.add(0,"mehmet");
        isimler.add(1,"ahmet");
        isimler.add(2,"samet");
        System.out.println(isimler);

        ArrayList <String> ekIsimler=new ArrayList<>(2);
        ekIsimler.add("burhan");
        ekIsimler.add("serdar");

        isimler.addAll(ekIsimler);

        System.out.println(isimler);

        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<2; i++){
        System.out.println("listeye 1 isim daha gir:");
        isimler.add(scanner.nextLine());}

        System.out.println(isimler);

//		ArrayList
//
//ArrayList length’i esnek olan bir Array’dir
//
//	*ArrayList’e nicin ihtiyac duyariz?
//
//➢ Biz array olustururken length’in en basta belirlemek zorundayiz ve daha sonra
// length’ini degistiremeyiz. Bu durum bizim esnek calismamiza engel olur.
//
//➢ Bir array’in uzunlugunu degistirmek istedigimizde yeni bir array olusturmamiz gerekir,
// ArrayList’te gerekmez.
//
//➢ Bir array’den bir eleman silmek istedigimizde yeni bir array olusturmamiz gerekir,
// ArrayList’te gerekmez.


//
//	ArrayList olusturma

List<String> list3 = new ArrayList<>(); //En cok bu kullanilir

ArrayList<String> list1 = new ArrayList<String>();

ArrayList<String> list2 = new ArrayList<>();

//ArrayList<String> list4 = new List<>(); Compile Time Error verir,
// sag tarafinda ArrayList kullanmak zorundayiz.




//	ArrayList’i nasil yazdiririz?

System.out.println(list3);



//	ArrayList Method’lari
//
//	1) add()

list1.add("kedi");  	//ArrayList’e eleman eklemek icin kullanilir

list1.add(1,"kedi"); 	//index ini belirtirsek digerlerini saga kaydirir.



//	2) size()

System.out.println(list1.size()); 		//ArrayList’de kac eleman oldugunu gosterir.


//	3) isEmpty()

list1.isEmpty(); 				 //ArrayList bos ise true, bos degilse false dondurur


//	4) remove()

list1.remove(0); 				//ArrayList’den belli bir elemani silmek icin kullanilir.

//*Size’dan buyuk index yazilirsa exception verir.

//System.out.println(hayvan.remove(1));   //yilan	//hangi elemani siliyorsa onu yazdirir.

//remove(“eleman”) index’i degil elemani kullanirsak kullandigimiz elemanin
// ilk kullanildigi yeri bulur ve siler.
//
//*Index’siz remove() method’u true veya false dondurur.
//


//	5) set()

list2.set(1,"ari"); 			 //ArrayList’de var olan bir elemani degistirmeye yarar.

//*set() method’u add() method’u yerine kullanilamaz.
//*Olmayan bir index ile set() kullanilirsa exception verir.
//
//hayvan.set(2, “aslan"); // IndexOutOfBoundsException     //ikinci index yok!!!
//
//	6) get(index)

list1.get(0); 			// ArrayList’deki istenen indexdeki elemani getirir.

//System.out.println(hayvan.get(1)); // yilan
//


//	7) contains()

list1.contains("ari"); 			//ArrayList’de bir elemanin var olup olmadigini kontrol eder.
//				Eleman varsa true, yoksa false return eder.
//
//System.out.println(hayvan.contains(“kedi”));
//


//	8) Collections.sort() :

Collections.sort(list1);

// ArrayList’deki elemanlari kucukten buyuge veya alfabetik siraya gore dizer.
//
//	9) equals()
//
//equals() 					iki listteki ayni indexteki elemanlarin ayni olup olmadigini kontrol eder.
//						Ayni indexteki tum elemanlar ayni ise true return eder, farkli ise false return eder

System.out.println(list1.equals(list2));



//	10) clear()
//
//clear() 					 ArrayList’teki tum elemanlari siler. Return type’i void’dir, hicbir sey donmez

list1.clear();





//	Array’i ArrayList’e Cevirmek

//List<String> list = Arrays.asList(arr);

//Uzunlugu degistirilemeyen bir list’e cevirir. Yeni olusturulan listte add(), remove() ve clear()
// methodlarini kullanamazsiniz. Exception verir.
//
//Eger array’deki bir elemani degistirirseniz list’teki eleman da otomatik olarak degisir.
// Listteki bir elemani degistirirseniz array de otomatik olarak degisir.
//



//	ArrayList’i Array’e Cevirmek

String arr[ ] = list1.toArray(new String[0]); 		// veya

Object arr1[ ] = list1.toArray( );					//seklinde iki yöntem ile array e cevirebiliriz.



    }

    //ARRAYLIST OLUSTURMA
    //
    //List<Integer> list1 = new ArrayList<>();
    //
    //List<String>arrListe= Arrays.asList(arr);	=array i ArrayList e cevirme
    //syso(list1);				= yazdirma
    //list1.add(10);			= eleman ekleme
    //list1.addAll(list2);		= listeye yeni bir liste ekler
    //list1.isEmpty();			= bos mu? Boolean getirir.
    //liste1.size();			= uzunlugu
    //list1.remove("Zeki");		= listeden cikarma/ bulamazsa RTE
    //list1.removeAll(list1);		= Listedekilerin hepsini sil
    //list1.set(1,”Havva”);		= 1. indexi öldurur, yerine yazar
    //list1.get(3);				= indextekini getirir, gösterir.
    //list1.contains(“kedi”);		= var mi yok mu true /false
    //Collections.sort(list1);		= kucukten buyuge sialar.
    //list1.equals(list2);		= Liste1 list2 ye esit mi? TRUE FALSE
    //list1.clear();			= hepsini siler void calisir.
    //----------------------------------------------------------------------------------------------------

}
