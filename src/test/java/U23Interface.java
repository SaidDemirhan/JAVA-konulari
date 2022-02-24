public interface U23Interface {

    //INTERFACE
    //
    //=>Interface bir class degildir.
    //=>obje üretilemez.(instantiate-instanscheyt- edilemezler.)
    //=>constuctor i yoktur.
    //=>icindeki methodlarin BODY si yoktur
    //=>Variable ve Abstract methodlardan olusur.
    //=>Bir Class birden fazla Class a extends edilemez ama birden fazla Interface a IMPLEMENTS edilebilir.
    //=>Method larin BODY si yoktur.*
    //
    //=>Methodlar sadece PUBLIC ABSTRACT olur. Concrete methodlar olamaz!* Tam abstarction (soyutluk) saglar.
    //	public abstract void kasa();/abstract void kasa();/void kasa();/ da yazilsa ayni kabul edilir**.
    //	**return type lar farkli olabilir.
    //
    //*istisna;Interface de default keyword u ile cocrete method olusturulabiliyor. AcsessModifier 	olan
    // default degil,öyle olsaydi hem public hem default olurdu.Javanin özel cözüm durumudur. Tanim degismez!
    //
    //	public default void deneme(){
    //	}	//gibi. Buradaki default keyword methodun concrete oldugunu belirtir.
    //	Bagli olan Class tan obje olusturularak cagrilmalidir.(obj.deneme();)
    //
    //	static void deneme2(){
    //	}	//ayni default gididir ve orada yazilanlar burda da gecerlidir.
    //	Bagli 	olan classtan InterfaceIsmi.methodIsmi();seklinde cagrilabilir.
    //
    //	Default ve static keyword u ile olusturlan method lar override edilmek zorunda degildir.
    //
    //=>Concrete bir clas implements ile bagli oldu Interface lerden ayni sinature(isim+parametre) ye sahip
    //methodlarin Reurn Type i (void,string) farkli ise inherit edemez hata verir.
    //	void yakitTuru();/String yakitTuru();=» Java hangisini inherit etmeliyim der?
    //
    //=>Bir Class implement edilen Interface (ler)in tüm methodlarini almak zorundadir.
    //=>Methodlarin tümü soyut olacagi icin static olamaz.
    //
    //=>Eger almasini istemedigimiz bazi özellikler de varsa parent olarak bir CONCRETE Class olusturup
    // o class a Interfacelerimizi IMPLEMENTS ederiz.(extends yerine implements yazariz.)
    //
    //=>Abstract Class lar, baglandiklari Interface lerden Abstract methodlari almak zorunda degildir.
    //=>Hiz acisindan abstract class a göre daha yavastir.
    //
    //=>Interface de üretilen tüm variable lar PUBLIC STATIC FINAL dir.(koyu italik büyük)
    //=>Variable lar final oldugu icin INITIALIZE(inischilayz) etmek yani deger atamak zorundayiz.
    //	int a=1;/public int a=1;/public static int a=1;/public static final int a=1;/hepsi aynidir.
    //	*Variable icin abstract diye bir sey yoktur.
    //
    //=>Interface leri ve Class lari birbirleriyle Parent-child iliskisi olustururken;
    //	Class(child)>Class(parents)= extends
    //	*Class(child)>Interface(parents)= implements
    //		public calss Araba implements ElektrikliMotor,OtomatikVites,Sedan{
    //		}		//birden fazla interfaceye baglamak
    //	*Interface(child)>Interface(parents)= extends
    //
    //=>Birden fazla Interfaceye bagli classlarda ayni isimde varible lar varsa;(InterfaceIsmi.VARIABLE;)
    //	sedan.MODELNO;/ ElektrikliMotor.MODELNO;/OtomatikVites.MODELNO;seklinde cagirilabilir.
    //
    //public interface Interface01 {		//seklinde olusturulur.
    //}
    //
    //=>Interface, nesnenin ne yapmasi gerektigini belirler ama nasil yapmasi gerektigini BELIRLEMEZ.
    //*Selenyum daki WebDreiver ayni zamanda bir INTERFACE dir.
    //-------------------------------------------------------------------------------------------------------

    //Interfaces
    //
    //➢ Interface bir class degildir. Interface interface’dir
    //
    //➢ Interface içinde sadece kendisinden türeyen sınıfların içini doldurmak zorunda olduğu, body’si olmayan method’larin olusturuldugu bir yapıdır.
    //
    //➢ Kısacası kendisini inherit eden class’lar için, yerine getirmeleri gereken metodları belirten “tum alanlari doldurulmak zorunda olan bir sablon” gibidir.
    //
    //➢ Interface’ler somutlastirilamaz (can not be instantiated) yani Interface’de obje olusturulamaz.
    //
    //	Interface Nicin Kullanilir?
    //
    //➢ Interface bir cesit to do list’dir. Concrete class’lari interface’deki tum metodlari implement etmek zorunda birakir. Nasil yapilacagina degil ne yapilacagina odaklanir
    //
    //➢ Bir class birden fazla class’a extend edilemez ama birden fazla interface’e implement edilebilir.
    //
    //➢ Interface’e sadece abstract public method’lar konabilir.
    //
    //➢ Return type’lar farkli olabilir
    //
    //➢ Interface icindeki variable’lar mutlaka public, static , ve final olmalidir.
    //private veya protected variable’lar compile time error verir.
    //
    //➢ Interface icindeki variable’lari mutlaka initialize etmek zorundasiniz, aksi takdirde Compile Time Error alirsiniz. int a = 12; gibi yapmalisiniz.
    //
    //Özetle Interface
    //1) Class degildir.
    //2) sadece abstract method’lar konabilir.
    //3) Tam abstraction (soyutluk) saglar
    //4) Bir class’dan istediginiz kadar interface’i inherit edebilirsiniz. Coklu inheritance’a uygundur.
    //5) Hiz acisindan abstract class’a gore yavastir.
    //6) Icindeki tüm nesnelerin “public” olması gerekir
    //7) metodlar static olamaz
    //8) Interface constructor’a sahip degildir
    //
    //	Interface’ler Icin Inheritance Kurallari
    //
    //1) Interface’lerde inheritance yapmak icin implements keyword’u kullanilir.
    //
    //2) Bir class birden fazla Interface’e implements ile baglanabilir
    //	public class Arabam implements ElektrikMotor, OtomatikVites, Sedan{}
    //
    //3) Birden fazla Interface’i implements ile inherit ettigimizde ayni isimde variable veya method’larla karsilasabiliriz.
    //Bu durumda Java ne yapacagini net olarak bilmek isteyeceginden istedigimiz variable ismini interface ismi ile birlikte yazariz.
    //
    //Method’lar mecburen override yapilacagi icin hangi interface’den alindiginin hicbir onemi yoktur.
    //	@Override
    //	public void YakitTuru(){}
    //
    //4) Ayni isme fakat farkli return type’a sahip methodlari olan Interface’leri ayni class’dan inherit edemeyiz .
    //
    //	Interface’lerde Body’si Olan Method Yazilabilir mi ?
    //
    //Java8’e kadar interface icinde “body’si olan method” olusturulamiyordu. Java8 ve uzeri versiyonlarda bu opsiyonu ekledi.
    //
    //A) method’un basina “default” keyword’u kullanabilirsiniz. Burada kullandigimiz “default” access modifier degil, method turudur.
    //
    //B) return type’dan once “static” keyword’u kullanabilirsiniz. Burada kullandigimiz “static” daha once kullandigimiz static gibi degildir. Cunku ayni paketteki baska class’dan clasIsmi.methodIsmi() yazarak kullanilamiyor.
    //
    //NOT : default veya static keyword’u ile olusturulan method’lar override yapilmak zorunda degildir.
    //
    //Farki: Default keyword’u ile olusturulan method’lari obje kullanarak cagirabiliriz ama static olanlari inherit ettigimiz interface’den ismi ile cagirabiliriz.
}
