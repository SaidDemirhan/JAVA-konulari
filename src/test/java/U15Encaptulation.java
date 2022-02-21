public class U15Encaptulation {

//
//	Encapsulation (Data Hiding) (Data Gizleme)
//
//Encapsulation, onemli Class uyelerini korumak icin uyugulanan data saklama yontemidir.
//
//Farkli Class’lardan erisilerek ya da yanlış kullanım sonucu kodunuzun veya
// onemli datalarinizin degismesini istemiyorsaniz Encapsulation ile datalarinizi koruyabilirsiniz.
//
//Encapsule edilen variable ve method’lara sadece sizin izin verdiginiz oranda erisilebilir.
//
//Encapsule edilen variable ve method’lara izin verdiginiz kisiler ulasabilir ama DEGISTIREMEZ.
//
//Datalarimizi korumak icin data’larimizi private yapabiliriz ama
// private yaptigimiz datalari baska Class’lar kullanamaz.
//
//Bu durum OOP consept’ine uygun olmaz.
//
//Encapsulation iki adimda yapilir:
//
//1) Class uyelerini (variable, method) private yapmalisiniz. (koruma altina aliyoruz)
//2) public olan getter() ve setter() methodlar uretmelisiniz.
//
//Not: getter() data’yi sadece okumamiza yarar, data'da degisiklik yapamaz.
//Not: setter() baska Class’larda olusturulan objeler icin data degerini degistirmemizi saglar.
//



//	Getters & Setters (Java Beans)
//
//Getter and setter method’lari “Java Beans” olarak da adlandirilir.
//


//	Getter Methods :
//
//Encapsule ettigimiz class uyelerinin okunabilmesine izin verir.
// Bu tarz class’lara immutable class denir.
//*Return var parametresi olmaz
//
//
//
//
//Setter Methods :
//
//Encapsule ettigimiz class uyelerinin, baska class’lardan obje uretilerek kullanilmasina
// ve deger atanmasina izin verir.
// Data degerleri degistirilebilir ama ilk atanan deger baska class’lardan okunamaz.
//*Return yok islem yapiyor, parametresi var.
//



//	Isim verme kurallari (naming convention)
//
//1) Data type’lari boolean olan variable’larin getter metod isimleri “is” ile baslar.
//
//	private boolean happy = true; public boolean isHappy() { return happy; }
//		* boolean a has bir durum get yerine is yaziliyor.(SET te degil) Kapsullenenleri getiriyor.
//
//2) Data type’lari boolean olmayan variable’larin getter metod isimleri “get” ile baslar.

	private int num = 123;
	public int getNum() {
	    return num;
	}

//3) Setter method isimleri her zaman “set” ile baslar

	private String str = "Ali";
	private boolean happy = true;
	public void setStr(String str) {
		this.str = str;
	}

//	public void setHappy(boolean happy) { extend
//		this.happy = happy;
//	}


	//================================================================//

    //ENCAPTULATION

    private String okulIsmi = "Yildiz Koleji";
    private int hesapNo = 5554321;


    public String getOkulIsmi() {
            return okulIsmi;
        }

    public void setHesapNo(int hesapNo) {
            this.hesapNo = hesapNo;
            System.out.println("HesapNumaraniz: "+hesapNo);
        }

//    public boolean isOkulAcikMi(){// boolean icin getter(); olarak “is“ kullanilmalidir.
//            return okulAcikMi;
//        }
//
//    UlasilanClass obj1 = new UlasilanClass();
//    obj1.getOkulIsmi();
//    obj1.setHesapNo(52623145);
//    obj1.isOkulAcikMi();
    //-------------------------------------------------------------------------------------------------------
}
