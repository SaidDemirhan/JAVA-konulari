public class U27LinkedList {

    //LINKED LIST
    //
    //	 //hem List hem de Queue Interface inin alt Class idir, tüm özelliklerini alir.
    //	 //linked bagli demekti, linked list ise seri olarak birbirine baglidir.
    //
    //        //her linkedList in basinda head diye bir yapi vardir.
    //        //head tek parcadir  ve sadece adress icerir, data olmaz.
    //        //head, olusturulan LinkList imizin adresidir.
    //
    //        //sonraki her eleman 2 parcadan olusur.
    //        //ilk parca adress ya da pointer olarak bilinir.
    //        //diger parca degerimizi (value) ihtiva eder.
    //        //bu 2 parcadan olusan elemanlarin her birine NODE denir.
    //
    //        //tum adresler sonrasindaki elemani gösterir
    //        //son elemanin adresi null dir.(ben son elemanim, gösterecegim bir adress yok)
    //
    //        //eger belirli bir yere eleman eklemek istersek orada olusan eski bag iptal olur,
    //        //o node u iceren yeni bir bag kurulmus olur.
    //
    //        //biz LinkedList i yazdirdigimizda sadece Value lari yazar.
    //        //ama arka planda java adress ler uzerinden islem yapar.
    //
    //        //insert(ekleme) ve delete(silme) islemlerini kolaylikla yaparlar
    //        //ama index kullanmadiklari icin yavastirlar.
    //
    //        //biz stack de bir LinkedList olusturdugumuzda
    //        // java heap memory de sadece head i, yani adresi olusturur.
    //
    //        //eger biz 5 eleman koyacagimiz bir array olustursaydik
    //        //heap ta 5 elemanli bir yer isgal edecekti eleman koymasak da.
    //
    //        //ama LinkeList sadece head i olusturur ve eleman ekledikce
    //        //elemana göre yer kaplar. hafizadan tasarruf edilmis olur.
    //
    //        	=>LinkedList<String>l=new LinkedList<>();
    //
    //                =>Collection larda obje olustururken;
    //        //olusturmak istedigimiz collection in class mi yoksa interface mi olduguna bakmaliyiz.
    //        //eger interface ise  data turu olarak (esitligin sol tarafina) interface i*,
    //        //costructor olarak (esitligin sag tarafi) uygun class i secmeliyiz.
    //	  *LinkedList in iki interface i oldugu icin LinkedList yazmazsak bazi methodlara ulasamayiz.
    //	  		List<String>l=new LinkedList<>();  /Queue<String>l=new LinkedList<>();
    //
    //* Eger bir Collection olustururken data türü yerine <Object> yazarsak her tür data yi kabul eder.
    //  Hic yazmazsak da kaubl eder ama sari cizer, zaman ve hafiza israfina yol acar.
    //	LinkedList<Object>l=new LinkedList<>(); => l.add("A"); / l.add(20); / l.add('a');
    //
    //*add()		= list e eleman ekler. Yer belirtilmemisse sona ekler.	   -l.add("B"); -l.add(1,"C");
    //*addAll()	= listeye baska bir listeyi ekler.		-l.addAll(arrListe); -l.addAll(2,arrListe);
    //addFirst()	= LinkedList in basina ekler.						     -l.addFirst("ilk");
    //addLast()	= LinkedList in sonuna ekler.							-l.addLast("son");
    //romove()	=eger bos sekilde yazilirsa ilk elemani siler ve istenirse sildigini getirir.
    //		 yazilan indexi siler ve sildigi elemani istenirse getirir.*
    //		 *icine yazilan sayi index olarak kabul edilir(integer degerler de olsa)
    //		 Yazilan elemani varsa siler ve boolean olarak döndürür.
    //removeFirstOccurrence() = ilk buldugu yazilan elemani vaarsa siler, istenirse boolean getirir.
    //removeAll()	=bir listedeki elemanlari liste olarak siler. AB nin icinden B yi cikartir.
    //contains()	=yazilan degerin olup olmadigini boolean olarak getirir.
    //containsAll()	=yazilan collection i icerip icermedigini boolean olarak istenirse getirir.
    //get()		=yazilan index deki degeri istenirse getirir.
    //getFirst()	=ilk elemani silmeden getirir.
    //getLast()	=son elemani silmeden getirir.
    //isEmpty()	=List in bos olup olmadigini boolean olarak getirir.
    //indexOf()	=yazilan elemanin ilk boldugu index ini verir. Eleman yoksa -1 verir.
    //lastIndexOf()	=yazilan elemanin en son buldugu indexini verir. Yoksa -1 getirir.
    //set()		=indexiyle yazilan elemani istenilen deger ile degistirir.
    //size()		=list in lengt ini verir
    //toArray()	=list i array a cevirir.
    //cleaer()	=list i tamamen siler.
    //
    //offer()	=yazilan eleman ekler. add() den farki, uygunsuz degerde hata firlatmaz deger getirir .
    //peek()		=Kuyruktaki ilk veriyi silmeden getirir. Bos ise null döner.
    //PeekFirst()
    //peekLast()
    //poll()		=Kuyrukta ilk eklenen veriyi alip kuyruktan cikartilabilir. Bos ise null döner
    //pollFirst()
    //pollLast()
    //pop()		=en yasli üyeyi kuyruktan cikardi ve elemani getirdi.
    //
    //-------------------------------------------------------------------------------------------------------

    //Collection LinkedList Method’lari
    //
    //1) add(); LinkedList’in sonuna istenen elemani ekler
    //
    //2) add(1,”A”); istenen index’e istenen elemani ekler
    //
    //3) addAll(coll); istenen collection’in tum elemanlarini ekler
    //
    //4) addAll(2, coll); istenen collection’in tum elemanlarini istenen index’e ekler
    //
    //5) addFirst(); istenen elemani, ilk eleman olarak ekler
    //6) addLast(); istenen elemani, son eleman olarak ekler
    //
    //7) remove(); ilk elemani siler
    //
    //8) removeFirst(); ilk elemani siler (daha hizlidir)
    //
    //9) remove(index); istenen indexdeki elemani siler ve silinen elemani döndürür
    //
    //10) remove(eleman); istenen elemani siler. sildi ise true, bulamadi ise false döndurur
    //
    //11) removeFirstOccurrence("XXX"); istenen elemanin, ilkini siler.
    //
    //12) removeLast(); son elemani siler
    //
    //13) removeAll(list); istenen listedeki tum elemanlari siler
    //
    //14) contains(eleman); istenen eleman listede var ise true, yoksa false döndurur
    //
    //15) containsAll(liste); istenen listenin tumu aranan listede var ise true, yoksa false döndurur
    //
    //16) get(index); istenen indexdeki elemani getirir
}
