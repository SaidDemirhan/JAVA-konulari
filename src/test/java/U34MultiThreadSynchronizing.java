public class U34MultiThreadSynchronizing {

    //MULTI THREAD-SYNCHRONIZING
    //
    //MULTITREAD, cpu nun max kullanimi icin bircok bölümün ayni anda yürütüldügü java özelligidir.
    //Her bir isparcacigi THREAD olarak adlandirilir.
    //
    //MULTITREAD, ayni anda birden fazla Tread in(islev parcasinin) calismasini amaclarken,
    //SYNCHRONIZING, calisan bu birden fazla tread in problemsiz, bir biriyle uyumlu ve Java acisindan öngörülebilir islemler yapmasini saglar
    //
    //-Java da senkronize bloklar synchronized keyword ile isaretlenir.(extends gibi)
    //-Bir blokta bir thread islem yapmaya baslayinda diger tüm thread lar o islem bitene kadar bekletilir.
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //-------------------------------------------------------------------------------------------------------

    //Multi Thread
    //
    //Multithreading, CPU'nun maksimum kullanımı için bir programın iki veya daha fazla bölümünün aynı anda yürütülmesine izin veren bir Java özelliğidir.
    //
    //Böyle bir programın her bir parçası bir iş parçacığı (thread) olarak adlandırılır.
    //
    //Threads iki mekanizma kullanılarak oluşturulabilir:
    //
    //1. Thread class’ina extend edilerek
    //
    //2. Çalıştırılabilir Interface’in implement edilmesi ile
    //
    //	Synchronizing
    //
    //Multi-thread programlar genellikle birden çok thread’in aynı kaynaklara erişmeye çalıştığı ve sonunda hatalı ve öngörülemeyen sonuçlar ürettiği bir duruma gelebilir.
    //
    //Bu nedenle, belirli bir zaman araliginda kaynağa yalnızca bir thread’in erişebileceğinden emin olunması gerekir. Java, senkronize bloklar kullanarak thread oluşturmayi ve threads’in görevlerini senkronize bir sekilde yapmasini sağlar.
    //
    //Java'da senkronize bloklar, synchronized keyword ile işaretlenir. Java'da senkronize edilmiş blok mekanizmasi aynı obje üzerinde tek zaman diliminde tek thread calismasini saglar.. Blokda bir thread calismaya baslayinca, diger tum thread’ler ilk thread’in islemi bitene kadar bekletilir.
}
