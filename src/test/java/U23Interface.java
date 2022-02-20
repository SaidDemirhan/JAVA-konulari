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
    //*istisna;Interface de default keyword u ile cocrete method olusturulabiliyor. AcsessModifier 	olan default degil,öyle olsaydi hem public hem default olurdu.Javanin özel cözüm durumudur. Tanim degismez!
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
    //=>Eger almasini istemedigimiz bazi özellikler de varsa parent olarak bir CONCRETE Class olusturup o class a Interfacelerimizi IMPLEMENTS ederiz.(extends yerine implements yazariz.)
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
}
