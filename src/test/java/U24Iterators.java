public class U24Iterators {
    //ITERATORS =pointer, kürsör(imlec), isaretci manalarina gelir.
    //-Collection(List,Set..) larda her yapi index i desteklemez ve o yuzden iterator a ihtiyac duyulmus.
    //-for each loop ile görebiliriz ama kalici degisiklik yapilmiyor. Loop ta olan loop ta kaliyor.(Scop)
    //-yalnizca ileri yönlü hareket edebilir.
    //
    //	=>Üc tane methodunu kullaniriz..
    //-next()	= bir sonraki elemana gitmesidir.
    //-hasNext()	= sonrasinda bir eleman olup olmadigini boolean olarak getirir.
    //-remove()	= elemani siler.
    //
    //-Hangi Collection üzerinde kullanacaksak onun üzerinden bir obje olustururuz.
    //	List<String> l = new ArrayList<>(Arrays.asList("A","B","C","D"));
    //	Iterator it1=l.iterator();
    //
    //-her zaman While Loop ile birlikte kullanilir.
    //	while (it1.hasNext()){			//==true da yazilabilir.
    //             it1.next(); //elemani getirip bir sonraki elemana gecer.
    //             it1.remove(); //getirilen elemani siler.
    //        }								//System.out.println(l); //[]
    //-------------------------------------------------------------------------------------------------------

    //Iterators
    //
    //➢ Java iterator, collection elemanlarımızın arasında gezinmemize ve elemanlari degistirmemize yarar.
    //
    //➢ Collections’da her element index yapisini desteklemez, index olmadan tum elementlere ulasmak icin for-each loop kullanabiliriz ancak for-each loop ile elementleri kalici olarak degistirme veya silme imkani olmadigi icin Iterator kullanimini tercih ederiz.
    //
    //Iterator interface oldugu icin direkt obje olusturmamiz mumkun degildir. Bunun yerine kullanacagimiz collection ismini yazip “.” kullanarak iterator method’unu cagirabiliriz.
    //
    //Iterator ile calisirken imlec’in nerede oldugu cok onemlidir. Dolayisiyla kodumuz calismadan once ve sonra imlec’in konumunu dikkate almamiz gereklidir.
}
