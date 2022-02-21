public class U35Maps {

    //MAPS
    //
    //
    //Map(Interface)
    //
    //   *Hashtable
    //
    //   *HashMap
    //
    //      *LinkedHashMap
    //
    //   SortedMap(Interface)
    //
    //      NavigableMap(Interface)
    //
    //         *TreeMap
    //
    //- Map interface dir.
    //
    //- key ve value pairs kullanir(anahtar ve degerler). -bir adet key, digerleri value.
    //
    //- keyler UNIQUE olmalidir.
    //
    //- key-value ikilisinden olusan elemana ENTRY denir.
    //
    //- Bir dataBase den java ya gecis her zaman(%99) MAP ile olur. Database ile iletisimimizi saglar.
    //
    //- = isareti olan yapilarda map kullanilmistir. {101=Ali,Can,Java, 102=Veli,Yan,Java, 103=Ali,Yan,C#}
    //
    //- Bir map e yeni ekledigimiz ENTRY nin key i eger map teki key ile ayni ise Value sunu  update eder.
    //
    //
    //
    //
    //
    //
    //
    //
    //-------------------------------------------------------------------------------------------------------

    //Maps
    //
    //Maps key – value pairs kullanir. ( anahtar –deger(ler) ). Key’ler unique olmalidir.
    //
    //	Synchronizing & Maps
    //
    //1) HashMap synchronized degildir. Thread-safe degildir
    //
    //2) HashTable synchronized’dir. Thread-safe’dir ve thread’ler tarafindan ortak kullanilabilir
    //
    //3) TreeMap synchronized degildir. Thread-safe degildir
    //
    //*keyset() method’u Set olarak key degerlerini verir.
    //
    //*values() method’u Collection olarak “value”lari verir.
    //Collections’dan istedigimiz bir variable’a degerleri ekleyebilir ve kullanabiliriz.
    //
    //	Maps Method’lari
    //
    //1) containsKey(key); istenen key degeri Map’de varsa true, yoksa false doner .
    //
    //?2) containsValue(value); istenen key degeri Map’de varsa true, yoksa false doner .
    //
    //3) entrySet(); Map’deki entry’leri bir Set olarak verir.
    //	Entry : Map’de her bir elemani olusturan key-value ikilisidir
    //
    //4) equals(map); Map’deki tum elemanlari karsilastirir. Hepsi ayni ise true farkli olan varsa false döndurur
    //
    //5) get(key); istenen key degeri Map’de varsa o key’e ait value’yu, map’de yoksa null doner.
    //
    //6) getOrDefault(key,defaultDeger); istenen key degeri Map’de varsa o key’e ait value’yu, key map’te yoksa default degeri doner.
    //
    //7) putAll(map); verilen map’deki tum elemanlari bizim map’imize ekler, tekrarlanan eleman varsa uzerine yazar
    //
    //8) compute(key, (key,value)->yeniDeger); verilen map’deki istenen key degerine sahip elemanin value’sunu gunceller key map’te yoksa ekler
    //
    //9) ComputeIfPresent(key, (key,value)->yeniDeger); istenen key degeri Map’de varsa o key’e ait value’yu gunceller, map’de yoksa birsey yapmaz
    //
    //10) ComputeIfAbsent(key, k ->yeniDeger); istenen key degeri map’de yoksa o key’i ve value’yu ekler, map’de varsa birsey yapmaz
    //
    //11) putIfAbsent(key, value); verilen key map’de yoksa ekler.
    //
    //12) size(); map’teki entry sayisini verir

    //HashMaps VS HashTable
    //
    //➢ HashMap, key olarak sadece 1 tane null, value olarak ise istedigimiz kadar null’a izin verir, HashTable ise null’in kullanilmasina izin vermez
    //
    //➢ HashMap thread-safe ve synchronized degildir (dolayisiyla hizlidir).
    //HashTable ise thread-safe ve synchronized’dir(dolayisiyla yavastir).
    //
    //	Maps / TreeMap
    //
    //➢ TreeMap, elemanlari natural order’a gore siralar. Siralama icin key’i dikkate alir
    //
    //
    //
    //1) ceilingEntry(key); key map’te varsa entry’yi döndurur, key map’de yoksa olmasi gereken yerden sonraki ilk entry’yi dondurur En buyuk keyden daha buyuk deger girilirse null döner
    //
    //2) descendingKeySet(); key’leri descending order’la döndurur
    //
    //3) firstEntry(); ilk Entry’i döndurur
    //
    //4) floorEntry(key); girdigimiz key map’te yoksa, key’i girdigimiz sayidan kucuk olan en yakin Entry’yi döndurur
    //
    //5) headMap(key); girdigimiz key exclusive olmak uzere onceki Entry’leri bir map olarak verir
    //
    //6) headMap(key,true); girdigimiz key inclusive olmak uzere onceki Entry’leri bir map olarak verir
    //
    //7) tailMap(key); girdigimiz key inclusive olmak uzere sonraki Entry’leri bir map olarak verir
    //
    //8) tailMap(key,false); girdigimiz key exclusive olmak uzere sonraki Entry’leri bir map olarak verir


}
