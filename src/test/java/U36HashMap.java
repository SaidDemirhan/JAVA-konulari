public class U36HashMap {

    //HASHMAP
    //
    //	Map<Integer, String> hm1 = new HashMap<>();	seklinde olusturulur.
    //
    //- En hizli oldugu icin -Multi thread veya SYNCHRONIZING a ihtiyac yoksa- HASHMAP i tercih ereriz.
    //
    //
    //Put()			=her halukarda map in icine eleman ekler
    //putAll()		=bir mapi icene ekler,aynilari üzerine yazar.
    //putIfAbsent()		=eger belirtilen key yoksa veya value su null ise elemani ekler.
    //clear()
    //containsKey()		=key olarak istenileni icerip icermedigini boolean getirir.
    //ContainsValue()	=sorgulanan degerin map te tam bir Value olarak olup olmadigini boolean getirir*.
    //			*unutulmamalidir ki, Java value’nun tamamini bir value olarak kabul eder.
    //entrySet()		=key ve value lari bir Set olarak verir. Map i bu method ile sete cevirebiliriz.
    //			 Set<Map.Entry<Integer, String>> hm1Set=hm1.entrySet();	//[101=Ali,Can,Java]
    //values()		=tum value lari collection olarak yazdirir.
    //keySet()		=tum key leri Set olarak yazdirir.
    //get()			=yazilan key in value sunu getirir. Yoksa null getirir.
    //size()			=entry sayisini verir.
    //remove()		=girilen keyi siler ve istenirse getirir.
    //isEmpty()		=bos olup olmadigini boolean olarak getirir.
    //replace()		=istenen entry i günceller, key yoksa null verir.
    //equals()		=bir map i baska bir map ile ayni mi diye karsilastirir ve boolean getirir.
    //getOrDefault()	=map te key varsa istenilen degeri getirir, yoksa null yerine istedigimizi yazar.*
    //			*System.out.println(hm1.getOrDefault(100,"Aradiginiz deger yoktur."));
    //compute()		=verilen map deki istenen key degerindeki value yu günceller, yoksa ekler*
    //			*hm3.compute("H",(key,value)→10); 	//H keyini bul ve value sunu 10 yap.
    //computeIfPresent()	=yazilan key  varsa günceller yoksa bir sey yapmaz,null getirir.*
    //			*hm3.computeIfPresent("H",(key,value)->12);
    //computeIfAbsent()	=yazilan key yoksa o key ve value yu ekler, yoksa olanin value sunu getirir*
    //			*hm3.computeIfAbsent("A",v→15);		//key A value 15 A=15 //  v→15 yerine baska
    //			bir harf veya kelime de olabilir. Anasilsin diye value nun v si yazili.
    //-------------------------------------------------------------------------------------------------------
}
