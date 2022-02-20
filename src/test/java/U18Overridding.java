public class U18Overridding {
    public static void main(String[] args) {

    }

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
    //	*hem overriding hem de overridden method calissin istiyorsak super.maasHesapla(); 	yazilir. 	Constructor dan farki; super.maasHesapla(); yazilmazsa parent calismaz (ilk satir sart degil).
    //
    //	*@Override	sürekli parent deki methodu kontrol eder ve parantteki method signature 	degistirilirse hata verir.
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
