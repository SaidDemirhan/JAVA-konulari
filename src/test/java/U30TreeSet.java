public class U30TreeSet {

    //36-TREESET
    //
    //	Set <String> ts1=new TreeSet<>();	seklinde olusturulur.
    //
    //- Dublication yok(cünkü set).
    //- Elemanlari Natural Order a göre siralar.(alfabetif veya kucukten buyuge)
    //- Set lerin en yavasi oldugu icin en az kullanilir.
    //
    //add()
    //addAll()
    //clear()
    //contains()
    //containsAll()
    //equals()
    //isEmpty()
    //remove()
    //removeAll()
    //retainAll()
    //size()
    //
    //*******************************************************************************************************
    //
    //SET LER ARASI DÖNÜSTÜRME YAPARKEN;
    //
    //	 Set <String> ts1=new java.util.TreeSet<>();
    //        	// eger bizim icin hem hiz hem de siralama önemliyse
    //        	//önce hashSet ile islemleri yapar en son treeSete dönustururuz.
    //        Set<String>hs1=new HashSet<>(Arrays.asList("G","C","A","F","Z","M","K"));
    //        	System.out.println(hs1);							//[A, C, F, G, Z, K, M]
    //        	//tree set e dönusturmek icin;
    //        ts1=new java.util.TreeSet<>(hs1);
    //        	System.out.println(ts1);							//[A, C, F, G, K, M, Z]
}
