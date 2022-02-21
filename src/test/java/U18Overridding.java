public class U18Overridding {

    //	Overiding
    //
    //	Method Signature
    //
    //Method signature, method ismi ve parametrelerden olusur.
    //
    //Signature’i degistirmek icin bilesenlerinden isim veya parametrelerle ilgili degisiklikler yapilmalidir.
    //
    //1) Isim ayni kalsa da parametre sayisi degistirildiginde signature degisir.
    //
    //2) Farkli data turlerine sahip parametrelerin yerleri degistirildiginde signature degisir.
    //
    //➢ Parent class'da var olan bir methodu method signature’ini degistirmeden, method body’sini
    // degistirerek kullanmaya Method Overriding denir.
    //
    //➢ Overriding kullanarak, child class’in parent class’daki methodu kendine uyarlayarak (implement)
    // kullanmasini saglamis oluruz.
    //Overriding parent class’daki genel method’u degistirmeden child class’in
    // kendine uygun method uretmesini saglar
    //
    //➢ Overriding yapildiginda parent class’daki methoda Overridden Method,
    // child class’daki methoda Overriding Method denir.
    //
    //Not: Eclipse menu’den Source sekmesinde bulunan Override/Implement methods secenegiyle
    // otomatik olarak overriding method’u olusturabiliriz.
    //Bu sekilde yapilan islemde Java @Override annotation’i kullanir.
    //@Override kullanmak zorunda degiliz, istersek silebiliriz.
    //Ancak kodun anlasilabilir ve okunabilir olmasi icin degil,
    // overridden method’da degisiklik yapildiginda Java’nin rapor etmesi icin kullanilmasi tercih edilir.
    //




    //	Overiding Kurallari
    //
    //1) Method Signature’i (name and parameters) ayni olmalidir.
    //
    //2) Child class’daki method’un (overriding method) Access Modifier’i parent class’daki
    // method’un (overridden) modifier’indan daha dar olamaz. (parent public child protected gibi)
    //
    //NOT : Private method’lar override edilemez.
    //
    //3) Overriding method covariant return type kullanmalidir.
    //
    //4) private, static and final method’lar overriding yapilamazlar.
    //
    //
    //	//5 ve 6 sonra aciklanacak
    //
    //5) Child class’daki method (overriding method), parent class’daki method’un
    // (overridden method) compile time edip etmedigine bakmaksizin compile time exception throw edebilir.
    // Fakat child class’daki method (overriding method), parent class’daki method’dan
    // (overridden method) daha bir run time exception throw edemez.
    //
    //6) Eger abstract olmayan bir class abstract class’a extend ediyorsa veya
    // bir interface’i implement ediyorsa abstract method’larin tamami override edilmelidir.
    //
    //➢ Overriding method return type’i overridden method’un return type’i ile ayni olabilir
    //
    //➢ Eger ikisi ayni degilse parent class(overridden)’daki return type ile
    // child class(overriding)’daki return type arasinda IS-A RELATION olmalidir. (covariant return types)
    //
    //➢ Primitive data turlerinde boyle bir iliski olmadigi icin return turu ayni olmalidir.

  //==========================================================================================//

    //Overloading vs Overriding
    //
    //➢Kisaca Overloading’de sadece parametreler degisir,
    // overriding’de signature’a dokunulmaz sadece body degisir.
    //
    //1) Overloading’de method signature degisir, Overriding’de degismez.
    //
    //2) Overloading’de body istenirse degistirilebilir, Overriding’de body %99 degistirilir.
    //
    //3) final, static ve private methodlar Overload edilebilir, ama Override edilemezler.
    //
    //4) Overloading Compile Time Polymorphism (static)’dir,
    // Overriding  Run Time Polymorphism’(dynamic)dir.
    //
    //5) Overloading’de inheritance gerekmez, Overriding’de gerekir.
    //
    //6) Overloading’de istedigimiz sekilde access modifier ve return type kullanabiliriz ama
    // Overriding’de access modifier ve return type kullanma belli kurallara baglidir.
    //
    //➢ “Overriding”in faydasi:  Coklu uygulama, reusability

    //==========================================================================================//

    //OVERRIDING (gecersiz kilma)
    //
    //-tamamen methodlarla ilgiidir. Child in parentinden aldigi methodu kendine göre düzenlemesidir.
    //
    //	public class Isci {				//parent class	//overridden(gecersiz kilinan)
    //    		public int maasHesapla() {		//ayni isimle chil de de bu method var.
    //        	return 30 * 8 * 15;
    //    		}
    //	}
    //
    //public class GeciciIsci extends Isci {    	//child class
    //
    //    public static void main(String[] args) {
    //        GeciciIsci obj=new GeciciIsci();		//main method da obje ile yadiridigimizda
    //        System.out.println(obj.maasHesapla());
    //    }
    //    @Override		//annotation denir ve Overriding edildigini anlatan bir aciklamadir.
    //    public int maasHesapla() {				//kendi class indaki method u kullanir.
    //        Return 30 * 8 * 10;			//overriding
    //    }
    //}
    //	*overriden; overriding edilmis method a denir.
    //	*Implement: Methodu kendine uyarlama
    //
    //	*hem overriding hem de overridden method calissin istiyorsak super.maasHesapla(); 	yazilir.
    //	Constructor dan farki; super.maasHesapla(); yazilmazsa parent calismaz (ilk satir sart degil).
    //
    //	*@Override	sürekli parent deki methodu kontrol eder ve parantteki method signature
    //	degistirilirse hata verir.
    //
    //	*Child in Acsess Modifier i Parentinden daha dar olamaz. (public-protected gibi)
    //
    //	*final static ve private methodlar override edilemez.
    //
    //	*overriding icin Inheritance gereklidir(extends).
    //
    //	*run time(dynamic) polymorphism dir.
    //
    //	*Ayni isim ve ayni parametre dir ama body farklidir(%99).
    //
    //	*child daki methodun return type i ya aynisi ya da childi olmali(-Covaryant-Object>String)
    //-------------------------------------------------------------------------------------------------------
}
