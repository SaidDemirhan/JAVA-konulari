import java.util.Scanner;

public class U11Constuctor {
    U11Constuctor(){

    }

    public static void main(String[] args) {
        //Obje üretmek icin kullanilir
        //Class levelde olusturulur
        //Her class ta default constuctur vardir ama biz göremeyiz
        //Class ismiyle ayni olmalidir.
        //Eger yeni bir constructor olusturursak defaultun üzerine yazar.
        //parantez icine parametre konabilir.
        //parametreli const olusturursak mutlaka extra parametresiz const olusturmeliyiz.

        //Scanner scanner =new Scanner(System.in)
        //Scanner classindan System.in parametreli const kullanarak bir obje üretiyoruz.

        //Kullanirken obje üretiyoruz.
        U08DoWhileLoop obj= new U08DoWhileLoop(); //default cons kullandik.
        //obj. yazarak oradaki variable lara ulasabiliyoruz.

        //O classtaki ulasmamiza izin verilen tüm bilgilere ulasabiliyoruz.



        //==============================================================//

        //Constructor
        //
        //Java’da object olusturmak icin kullanilan kod blogudur.
        //
        //Constructor calismadan object olusturulmasi mumkun degildir
        //
        //	Java object’leri nasil olusturur ?
        //
        //Java’da Class’lar object uretmek icin kullanilir
        //
        //Java’da bir Class olusturdugumuzda, Java object olusturabilmemiz icin default constructor olusturur.
        //
        //Default constructor Class icinde gorulmez
        //
        //Kullanici yeni bir Constructor olusturursa Java default constructor’i siler.
        //
        //Constructor, Class icerisinde method’larin disinda olusturulur.
        //
        //Constructor’in ismi Class ismi ayni olmalidir.
        //
        //Constructor’larin return type’lari olmaz
        //
        //	Parametrized Constructor (Parametreli Constructorlar)
        //
        //➢Olusturdugumuz obje icin default deger disinda deger atamak icin Assignment yapmaliyiz.
        //
        //➢Deger atama islemini obje olustururken yapmak istersek atama yapacagimiz variable’lari
        // iceren constructor olusturabiliriz.
        //
        //➢Bu durumda this ile yolladigimiz degerleri instance variable’lara assign etmeliyiz.
        //
        //Eger;
        //
        //Class icinde birden fazla Constructor olursa Java obje create ederken kullandigimiz argument’lere gore uygun constructor’i kullanir
        //



        //=========================================================================//

        //	Constructor Call
        //
        //➢Obje olusturulurken constructor calisir.
        //
        //➢Bir constructor’dan diger constructor’i cagirmak icin this(parametreler); kullanilir.
        //
        //➢Kural 1 : this(parametre); cagrildigi constructor’in ilk satirinda yazilmalidir
        //
        //➢Kural 2: Kural 1’den dolayi bir constructor icinde sadece 1 constructor cagrilabilir

    }

    //CONSTRUCTOR
    //
    //public class ClassIsmi{			//main method disinda olusturulur.
    //
    //	public ClassIsmi(int sayi){	//biz p’li veya p’siz cons olusturunca default olan iptal olur.
    //	}
    //	public ClassIsmi(){			//biz yazmasak da parametresiz constructor zaten vardi ama
    //	}					//iptal oldugu icin p’siz yeniden yazmaliyiz.
    //}
    //
    //	*ilk satirinda her zaman gorunmese bile super() vardir.(method da yok)
    //
    //	*super(); constuctor i PARENT  class a götürür. extends yoksa hicbir mana ifade etmez. Silinir.
    //
    //	*this(); constructor i ICINDE OLDUGU class taki costructor i cagirir.
    //
    //	* super(); ve this(); ayni anda olamaz. Ikisi de ilk satirda olmali.
    //
    //	*super.xxx=>parent class daki variable i, super.xxx()=>parent class taki method u cagirir
    //-------------------------------------------------------------------------------------------------------
}
