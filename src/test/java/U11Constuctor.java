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
