public class U39DataCasting {

    //Data Casting (Veri Sinifi Degistirme)
    //
    //➢ Java’da kod yazarken bir veri tipinden diğer bir veri tipine aktarım yapmamız gerekebilir.
    //
    //➢ Veri tiplerinde bir variable’a , olusturuldugu data tipinden farkli bir data turunden deger atanmasina Data Casting denir.
    //
    //➢ Data casting yaparken aklimizdan cikarmamamiz gereken konu data tiplerinin sinirlaridir.
    //Data tipinin sinirlarini asan data casting islemlerinde hata almamamiz icin dikkat etmemiz gereken bazi durumlar olacaktir.
    //
    //➢ Hatirlayacagimiz sekilde Java’da sayilarla ilgili data tiplerinin siralamasi
    //byte < short < int < long < float(ondalıklı) < double(ondalıklı)


    //a) Auto Widening (Otomatik Genisletme)
    //
    //Dar veri tipinden daha genis bir very tipine gecmek iztedigimizde Java donusumu otomatik olarak yapacaktir.
    //
    //byte num1 = 12;
    //short num2 = num1; // yazdirirsak 12 olarak yazdirir
    //int num3 = num2; // yazdirirsak 12 olarak yazdirir
    //float num4=num3; // yazdirirsak 12.0 olarak yazdirir
    //double num5=num4; // yazdirirsak 12.0 olarak yazdirir
    //
    //	b)Explicit Narrowing (Manuel Daraltma)
    //
    //➢ Genis veri tipinden daha dar bir veri tipine gecmek istedigimizde Java donusumu otomatik olarak YAPMAYACAKTIR.
    //
    //➢ Bu durumda Java Casting’in bir problem olusturabilecegini varsayarak sizden MANUEL ONAY isteyecektir.
    //
    //➢ Narrowing Casting bazi datalari kaybetmemize yol acabilir, bazen de sayiyi kendi sinirlari icinde kalan baska bir sayiya donusturebilir
    //
    //double myDouble=9.56;
    //int myInt=(int) myDouble		// outputs: 9
}
