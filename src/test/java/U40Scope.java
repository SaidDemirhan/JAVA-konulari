public class U40Scope {

    //Scope(Kapsam)
    //
    //Instance,Class ve Local Variables
    //
    //➢ Bir Class icerisinde olusturulan variable’lar icin Scope, o variable’a nereden,
    // nasil ulasilabilecegini ve nerede gecerli oldugunu ifade eder.
    //
    //➢ Scope’a uymayan bir kullanimda Java Compile Time Error verir.
    //
    //➢ Java’da olusturulan variable’lar icin 4 Scope mevcuttur
    //
    //

    //	1) Instance (Object) Variables // ogretmenin adi gibi, ogrencinin notu gibi
    //
    //- Class’in icinde ancak main method’undisinda olmalidir
    //
    //- Static olMAmalidir
    //
    //- Olusturulmasi yeterlidir, deger atanmasi sart degildir.
    //
    //- Eger instance bir variable olusturur ama deger atamazsaniz, Java otomatik olarak
    // default degerleri assign eder.
    //(String icin null, sayisal data turleri 0, boolean false)
    //
    //- class icerisinde veya baska class’larda direkt kullanilamaz, kullanmak istedigimizde
    // MUTLAKA object olusturmali ve object uzerinden ulasilmalidir.
    // Objeye baglidir (matematikNotu, ogrenciIsmi gibi)
    //
    //- Instance variable yetkisi olan herkes tarafindan degistirilebilir
    // ancak yapilan degisiklik sadece o obje ile ilgilidir, geneli kapsamaz.
    //


    //	2) Static (Class) Variables // okul adi, adresi gibi
    //
    //- Class’in icinde ancak main method’un disinda olmalidir. (local’de static variable olusturulamaz)
    //
    //- Static olmalidir. Static variable’lar herkes icin ortaktir (okul ismi gibi)
    //
    //- Olusturulmasi yeterlidir, deger atanmasi sart degildir.
    //
    //- class icerisinde direkt kullanilabilir, baska class’larda kullanmak istedigimizde
    // object olusturmaya ihtiyac duymadan classIsmi.variableIsmi ile variable’a ulasabilir ve
    // kalici olarak degistirebiliriz.
    //
    //- Static variable yetkisi olan herkes tarafindan degistirilebilir ve
    // bu degisim her obje icingecerlidir.
    //



    //	3) Local (Method) Variables
    //
    //➢ Herhangi bir method icerisinde olusturulan variable’lardir (main method dahil).
    //
    //➢ Sadece o method icerisinde gecerlidir
    //
    //➢ Baska methodlarda da kullanilacak variable’lari, local olusturmak yerine
    // class level’da olusturmak gereklidir.
    //
    //➢ Class level’da olusturulacak variable, main method’da kullanilacaksa
    // static olarak olusturulmalidir.
    // Bu durumda bu variable kullanacak diger method’lar da static olmalidir.
    //
    //➢ Java local variable’lara default deger atamaz.
    //
    //➢ Deger atamadan olusturdugunuzda Java sikayet etmez.
    // ( variable olusturuldu method icerisinde deger atanacak diye bekler.)
    //
    //➢Olusturmak icin declaration yeterlidir, ancak kullanmak icin declaration yetmez,
    // mutlaka oncelikle deger atamasi (assignment) yapmak gerekir.
    //
    //➢ Olusturulan local variable’lara deger atamadan kullanmaya calisirsaniz
    // Java sikayet eder (CTE)
    //



    //	4) Loop Variables
    //
    //➢ Bir loop icinde olusturulan variable’lar sadece o loop icerisinde gecerlidir.
    //
    //➢ Loop icerisinde olusturulan variable’lara loop disindan ulasilamaz ve
    // loop disinda kullanilamaz.
    //
    //➢ Loop icerisinde olusturulan local variable’lari disarida kullanmaya calisirsaniz
    // Java sikayet eder(CTE)
}
