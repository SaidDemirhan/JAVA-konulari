public class U22AbstractClasses {
    public static void main(String[] args) {

    }

    //ABSTRACT CLASSES
    //
    //	public abstract class Personel{			//conrete bir class i abstact yapma
    //	}
    //
    //=>ortak özellikleri olan nesneleri tek bir cati altinda toplamak icin kullanilir.
    //
    //=>kendisinde bir obje olusturulamaz(instantinate-örneklendirme,obje olusturma).
    //=>kendisinden obje üretemesek de bir Class oldugu icin constuructor a sahiptir.
    //
    //=>tüm child class larda olmasini istedigimiz dinamik* özellikleri burada olustururuz.
    //	*Dinamik özellikler=method, static özellikler =variable(abstract olamaz)
    //
    //=>Abstract method larin BODY si yoktur.({})
    //	Public abstract void maasHesapla();		//body istiyorsak abstract olmamali.
    //
    //=>Abstarct Method lar sadece Abstract Class larda olusturulabilir!
    //=>Methodlarin public olma zorunlulugu yoktur.
    //
    //=>CONCRETE methodlar da olusturulabilir ama onlar Override edilmek zorunda degildir.(istege bagli)
    //=>Soyut olmayan methodlar static olarak tanimlanabilir.
    //
    //=>Abstract olmayan(concrete) tum child classlar abstract methodlari OVERRIDE etmek zorundadir.
    //	*Body olmadigi icin concrete class ta implement edilmeli(uyarlanmali).
    //
    //=>Abstract olan child class Abstract methodlari Override etmek zorunda degil. Zaten Paret-Child 	iliskisiyle rahatca ulasabilir. Köprü gibi altindaki Abstract ve Concrete Claslara aktarir.
    //
    //=>Abstact Class in altinda mutlaka en az bir Concrete Class olmalidir.
    //
    //=>Abstract class lar private ve final olarak tanimlanamaz.
    //
    //=>Concrete Class tan sonra yine bir Abstract Class olabilir.
    //
    //=>Abstract Class, nesnenin ne yapmasi gerektigini belirlerken NASIL yapmasi gerektigini belirleyebilir.
    //
    //public abstract class Personel {
    //    String isim="yusuf";
    //    public abstract void maasHesapla();
    //    public abstract void mesaiBilgisi();
    //    public void ozelSigorta(){
    //        System.out.println("özel Sigortali");
    //    }
    //}
    //	*********
    //public class Isci extends Personel { //parent olarak abstract bir clas i edinmissek ondaki medthodlari imlement etmeliyiz.
    //    public static void main(String[] args) {
    //        Isci isci1 = new Isci();					//obje ürettik
    //        isci1.maasHesapla();					//bu class tan method
    //        isci1.ozelSigorta();//parent classtan methodu abstract olmadigi icin override etmeden kullandik
    //        isci1.isim = "salih";					//parent tan yeniden atama yapabiliyoruz.
    //    }
    //    @Override                       //implement etmek zorundayiz,cunku abstract ta body yoktu. cte
    //    public void maasHesapla() {
    //        System.out.println("isciler icin maas 5000 tl");
    //    }
    //    @Override
    //    public void mesaiBilgisi() {
    //        System.out.println("isciler günlük 8 saat calisir.");
    //    }
    //}
    //-------------------------------------------------------------------------------------------------------
}
