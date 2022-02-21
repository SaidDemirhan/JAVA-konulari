public class U26Collections {
    //COLLECTIONS
    //	Iterable(Interface)
    //	Collection(Interface)
    //		List(Interface)
    //			ArrayList(Class)
    //			LinkedList(Class)*
    //		Queue(Interface)
    //			LinkedList(Class)*
    //			PriorityQueue(Class)
    //			Deque(Interface)
    //		Set(Interface)
    //			HashSet(Class)
    //				LinkedHashSet(Class)
    //			SortedSet(Interface)
    //			TreeSet(Class)
    //-------------------------------------------------------------------------------------------------------

    //SET
    //-Elemanlarinda Dublication yoktur. Her elemandan sadece bir adet olabilir.
    //
    //QUEUE
    //-Kuyruk demektir
    //-siralama cok önemlidir.
    //-fifo vardir. Tünel gibidir. Ilk giren ilk cikar.
    //	*Deque= iki taraftan da cikis olabilir.(geri vites gibi)
    //-eczane deki ilaclar sütler vs bu yapiyi kullanir
    //
    //LINKED
    //-Birbirine bagli demektir.
    //-tüm elemanlari birbirine art arda baglidir
    //-tren vagonu gibi. Araya vagon eklenmek veya cikarmak istediginde yeni baglar olusturulur.
    //
    //TREE
    //-Dogal sirali bir dizme yapar.(natural order)
    //-a dan z ye veya kucukten büyüge dogru siralama yapar.
    //-her eklenen elemanda nereye koyulacagi kontrol edildigi icin yavastir.
    //-her zaman ucuz olan gelsin denirse kullanilabilir.
    //
    //HASH
    //-Kategorize ederek kendine göre düzenler.
    //-Kendine göre düzenledigi icin istenileni bulmasi da HIZLIdir.
    //
    //-------------------------------------------------------------------------------------------------------

    //Collections
    //
    //5 kelime’ye dikkat etmek lazim:
    //	1) Set (Kume)
    //	2) Queue (Sira)
    //	3) Linked (Bagli)
    //	4) Tree (DogalSirali)
    //	5) Hash
    //
    //	Collections / Linked List (Class)
    //
    //1) Ilk eleman her zaman head’dir ve head’de data yoktur, sadece address vardir.
    //
    //2) Son eleman(tail) null’i point eder.
    //
    //3) Her elemanin icinde data ve address kismi olmak uzere iki kisim vardir.
    //
    //4) Tum elemanlar pointer’lar ve address’ler kullanilarak birbirine baglanir.
    //
    //5) Her eleman node olarak adlandirilir.
    //
    //6) Array’lerden daha dynamic’dirler, insert(ekleme) ve delete(silme) islemlerinde basarilidirlar.
    //
    //7) Bir elemana ulasmada yavastirlar cunku index kullanmazlar
    //
    //Linked List, 2 interface’in child class’idir.
    //
    //Obje olustururken data turu olarak istedigimiz parent interface’i secebilir ve o interface’deki ozellikleri kullanabiliriz.
    //
    //Data turu olarak LinkedList sectigimizde de ayni method’lari kullanabiliriz, cunku LinkedList concrete bir class’dir ve parent’i olan interface’lerdeki tum method’lari override etmek zorundadir.
    //
    //*** LinkedList 2 interface’i implement ettigi icin her ikisinin ustun ozelliklerini kullanabilir
}
