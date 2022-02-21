public class U21JavaVirtualMachine {
    //Java Virtual Machine (JVM)
    //
    //	Garbage Collector= 	- önce isaretler finalize() method u ile
    //				- sonra isaretlediklerini siler.
    //
    //- Silmediklerini de SIKISTIRIR.
    //
    //Runtime rt=Runtime.getRuntime();		//isteklerimiz icin bir obje olusturduk
    //rt.totalMemory();				//toplam hafiza
    //rt.freeMemory();				//bos hafiza
    //rt.gc();					//garbege Collector calistirma emri. (Dikkate almayabilir ama)
    //
    //
    //
    //
    //-------------------------------------------------------------------------------------------------------

    //Java Platform Bagimsiz Calisir
    //
    //“write once run everywhere” sloganini gerceklestiren yapidir.
    //
    //Jvm, Java programlama dilinde yazdığımız kodların üzerinde çalıştığı programdır.
    //
    //Hangi platformda yazmis olursak olalim Java Compiler kodlarimizi byte kodlara cevirir, burada JVM devreye girerek kodu daha alt seviyede makine diline dönüştürmektedir.
    //
    //Her işletim sisteminde jvm kendine özgüdür. (mac linux windows)
    //
    //Her işletim sistemi için o işletim sistemine özgü Jvm’i yüklemelisiniz.
    //
    //	Garbage Collector
    //
    //Garbage Collector heap alanında çalışan ve heap alanında new operatörü vb. metotlarla oluşturulan ve referansı olmayan nesneleri heap alanından temizleyen mekanizmanın adıdır.
    //
    //Garbage Collector işlemini 3 adımda tamamlar. Bunlar:
    //
    //İşaretle: Kullanılan ve kullanılmayan nesneler işaretlenir.
    //
    //Silme: Referansı olmayan nesneleri heap alanından temizler.
    //
    //Sıkıştırma ve Silme: Silme işlemine ek olarak daha büyük nesnelere boş alan oluşturmak için kalan nesneleri bir araya getirir.
    //
    //➢ finalize() method Garbage Collector tarafindan imha edilmesi gereken datalar imha edilmeden once calistirilir.
    //
    //➢ Garbage collector sadece finalized yapilmis objeleri toplar ve yokeder.
    //
    //➢ Biz kod yazarken finalize() method’unu cagirsak da finalize() method’unun ne zaman calisacagina ve ne yapacagina JVM karar verir.
    //
    //	final – finally – finalize()
    //
    //➢ final keyword, finally kod blogu, finalize() ise method’dur.
    //
    //	Final Variable = Degeri degistirilmeyecek (constant) variable’lar Icin kullanilir, mutlaka 				   deger atanmalidir, isimleri buyuk harfle yazilir(optional)
    //
    //	Final Methods = Override edilemeyecek method
    //
    //	Final Classes   = Inherit edilemeyecek class
    //
    //➢ finally kod blogu try veya try-catch bloklari ile kullanilir. Try-catch’in sonucu ne olursa olsun calisir. Genellikle database veya cloud ile connection’in sonlandirilmasi, calisilan file’in kapanmasi gibi islemler yapar.
    //
    //➢ finalize garbage collector kullanilmayan objeleri destroy etmeden once kullanilir
}
