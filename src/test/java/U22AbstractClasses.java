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


    //Abstract Classes (SOYUT)
    //
    //Abstract class, genellikle ortak özellikleri olan nesneleri tek bir çatı altında toplamak için kullanılır.
    //
    //Tum child class’larda olmasini istedigimiz dinamik ozellikleri (methods) abstract class’da abstract method olarak olustururuz.
    //
    //Abstract olmayan (concrete) tum child class’lar abstract method’lari override etmek zorundadir. Boylece tum child class’lar ayni dinamik ozelliklere (methods) sahip olurlar.
    //
    //	Abstract class nasil olusturulur ?
    //
    //Abstract class olusturmak icin class keyword’unden once abstract keyword’u yazilmalidir.
    //
    //	public abstract class Personel{}
    //
    //Abstract method nasil olusturulur ?
    //
    //Abstract method olusturmak icin abstract keyword’u yazilmalidir. Abstract method’un body’si olmaz (No implementation), body olusturursaniz CTE olusur. Abstract method private, final veya static olarak tanimlanamaz.
    //
    //	public abstract void maasHesapla();
    //	public abstract void mesaiBilgisi(){}
    //
    //Kural 1) Concrete bir child class, parent’i olan abstract class’lardaki tum abstract method’lari implement etmelidir, diger turlu CTE olusur.
    //
    //Kural 4) Abstract bir child class, parent’i olan abstract class’lardaki method’lari implement etmek ZORUNDA DEGILDIR. Parent-child iliskisi ile tum method’lara ulasabilir.
    //
    //Kural 2) Abstract method’lari implement etmek icin oncelikle overriding yapilmalidir.
    //
    //Kural 3) Bir abstract class, abstract veya concrete method’lara sahip olabilir, Cocrete method’lar implement edilmek ZORUNDA DEGILDIR. Parent-child iliskisi ile kullanilabilirler veya istenirse override edilebilirler
    //
    //NOT : Concrete class icinde Abstract method OLUSTURULAMAZ
    //
    //Kural 5) Abstract class’lar somutlastirilamaz (can not be instantiated) yani constructor’a sahiptir ama abstract class’larda obje olusturulamaz.
    //
    //Kural 6) Abstract class’lar private veya final olarak tanimlanamaz
    //
    //özetle Abstract classes
    //1) Class’dir
    //2) abstract ve concrete method’lar konabilir
    //3) Kismi olarak abstraction saglar.
    //4) Birden fazla abstract class’a direk child olunamaz. Coklu inheritance’i desteklemez.
    //5) Hiz acisindan avantajlidir
    //6) Icindeki tüm nesnelerin “public” olması zorunlu degildir
    //7) soyut olmayan metodlar static olarak tanımlanabilir.
    //8) Abstract class constructor’a sahiptir
}
