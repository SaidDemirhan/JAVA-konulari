public class U20ErrorsExceptions {

    public static void main(String[] args) {

    }

    //***ERRORS***
    //Object
    //   Throwabel
    //      Error(Unchecked)
    //      Exception
    //         RunTimeException(Unchecked)
    //         Other Exceptions(Checked)
    //*******************************************************************************************************

    //ERROR
    //
    //	*yazacagimiz kodlarla handle edilemez.
    //	*sistemin bir eksiklik veya aksakligindan kaynaklanir.
    //	*Anormal sekilde sistem kapanir
    //	*uncheck tirler ve run Time da ortaya cikarlar.-
    //		örn:  OutOfMemoryError= hafiza dolunca alinan hatadir.
    //
    //-------------------------------------------------------------------------------------------------------

    //26-EXCEPTIONS
    //*kod yazildiginda veya calisirken karsilastigimiz cözülebilir problemlerdir.
    //	A)Compile Time (Checked) Exception -kodu yazarken gördüklerimiz.
    //		Throws keyword da bu gruba girer(main methodun bitisigine yazilir).
    //	B)Run Time (Unchecked) Exception	-kod calistirildiginda ortaya cikanlar.
    //
    //1- ArithmeticException =Run Time Exception dir. Matematiksel Exception lardir.
    //
    //	int sayi1=10;
    //	int sayi2=0;
    //
    //        try {				//eger bunu kullanmasaydik hata verecekti
    //            System.out.println("sonuc: " + (sayi1 / sayi2));
    //        } catch (ArithmeticException e){
    //            System.out.println("Sayiyi sifira bölemezsiniz!!!"); //e//
    //        }
    //
    //	*System.out.println("e");			//java.lang.ArithmeticException: / by zero //yazdirir
    //	*System.out.println(e.getmessage());	// / by zero	//kisaca yazdirir.
    //	*e.printStackTrace();			//mesajin tamamini yazdirir.
    //						java.lang.ArithmeticException: / by zero
    //							at exceptions.Exceptions03.main(Exceptions03.java:13)
    //
    //*******************************************************************************************************
    //2-FileNotFoundException =Checked Exception dir. “Ya dosya yoksa“ exception inidir.
    //
    //        try {
    //            FileInputStream fis= new FileInputStream("C:\\Users\\ASD\\IdeaProjects\\File.txt");
    //        } catch (FileNotFoundException e) {
    //            e.printStackTrace();
    //        }
    //
    //	*mutlaka FileInputStream class indan obje olusturulmali
    //veya
    //	public static void main(String[] args) throws FileNotFoundException {
    //		FileInputStream fis= new FileInputStream("C:\\Users\\ASD\\IdeaProjects\\File.txt");
    //	}
    //seklinde de olabilir ama kod bloke olur.(throws her zaman bloke ettirir.)
    //
    //*******************************************************************************************************
    //3-IOException =Checked Exception dir. dosya ile ilgili genel okuma ve yazma sorunu
    //	  try {
    //            FileInputStream fis= new FileInputStream("C:\\Users\\ASD\\IdeaProjects\\File.txt");
    //		int k = 0;
    //             try {
    //                while ((k = fis.read()) != -1) {		//dosyadakileri yazdirmak icin
    //                    System.out.print((char) k);		//char olarak yazdirmak icin
    //                }
    //            } catch (IOException e) {
    //                e.printStackTrace();
    //            }
    //        } catch (FileNotFoundException e) {			***‘e’ eksik ise her zaman hata verir.
    //            e.printStackTrace();
    //        }
    ////veya tek try ve multiple catch blogu ile yapilabilir.
    //
    //	try {
    //            FileInputStream fis= new FileInputStream("C:\\Users\\ASD\\IdeaProjects\\File.txt");
    //	int k = 0;
    //            while ((k = fis.read()) != -1) {
    //                System.out.print((char) k);
    //            }
    //        } catch (FileNotFoundException e) {		//once child exception i yazdik
    //            e.printStackTrace();		//bu catch blogu silinebilir ama sorun sonrasinda net görunmez.
    //        } catch (IOException e) {			//sonra parent i yazdik  //SIRA ONEMLI
    //            e.printStackTrace();
    //        }
    //veyahut
    //	public static void main(String[] args) throws  IOException{
    //		int k = 0;
    //       	while ((k = fis.read()) != -1) {
    //       	System.out.print((char) k);
    //		}
    //	}						//kod bloke olur
    //
    //*******************************************************************************************************
    //
    //4-NullPointerException =Unchecked dir. Null degerindeki bir objeyle uygunsuz islemde ortaya cikar.
    //
    //	String str=null;
    //		System.out.println(str.concat( "bos"));
    //		System.out.println(str.length());
    //
    //*******************************************************************************************************
    //5-ArrayIndexOutOfBoundsException =Unchecked- indexi disinda bir islem olursa karsilasiriz.
    //
    //     int arr[]={1,2,5,6};
    //        System.out.println(arr[1]);//2
    //        System.out.println(arr[3]);//6
    //        System.out.println(arr[4]);//ArrayIndexOutOfBoundsException
    //
    //veya IndexOutOfBoundsException;
    //
    //     List<String>l=new ArrayList<>(Arrays.asList("bahaddin","kazim","cemil"));
    //        System.out.println(l);//[bahaddin, kazim, cemil]
    //        System.out.println(l.get(2));//cemil
    //        System.out.println(l.get(3));//IndexOutOfBoundsException
    //
    //*******************************************************************************************************
    //6-NumberFormatException =unchecked
    //
    //	 String str="123456";
    //
    //        System.out.println(str+10);//12345610
    //
    //        int strSayi=Integer.parseInt(str);//integer a cevirdik
    //        System.out.println(strSayi+10);//123466
    //
    //        String str2="123a56";
    //        System.out.println(Integer.parseInt(str2));//NumberFormatException
    //
    //*******************************************************************************************************
    //7-ClassCastException =unchecked
    //
    //	Object sayimiz=40;
    //	String sayistr=(String) sayimiz;//ClassCastException// Explicit narrowing casting
    //*******************************************************************************************************
    //
    //8-IllegalArgumentException		//mutlaka  throw new kullanilmali!
    //	Int yas=-20
    // 	try {						//eksi bir yas girdigimizde exception verdiriyoruz
    //            if (yas >= 0) {
    //                System.out.println("Girdiginiz yas: " + yas);
    //            } else {
    //                throw new IllegalArgumentException();		***
    //            }
    //        } catch (IllegalArgumentException e) {
    //            e.printStackTrace();
    //        }						//kod bloke olmadan devam etmis oldu
    //*throw sadece bir exception firaltir,main methodun yanindaki throws daha fazla exception verebilir.
    //
    //*******************************************************************************************************
    //
    //CREATE CUSTOM CHECKED EXCEPTION	(kendimizin olusturdugu exception)
    //
    //	*Class ismi sonunda mutlaka exception olmali
    //	*Exception class ina extend olmali.
    //
    //public class Exceptions12Exception extends Exception {	//extends var
    //    private static final long serialVersionUID = 1L; 	//hataya bir numara veriliyor(sart degil)
    //    Exceptions12Exception(String message) {			//sabit yazilmasi gerekiyor
    //        super(message);
    //    }
    //}				//Exception13 Class iyla bagli calisiyor
    //
    //
    //	-------
    //public class Exceptions13 {
    //    public static void main(String[] args) throws Exceptions12Exception {
    //        String eMail = "rasit@gomail.com";
    //        mailDogrula(eMail);									//method call
    //    }
    //    public static void mailDogrula(String email) throws Exceptions12Exception{
    //        if ((email.contains("@gmail.com")) || (email.contains("@hotmail.com"))) {
    //            System.out.println("Email iniz basariyla kaydedildi");
    //        }else{
    //            throw new Exceptions12Exception("EMail uygun degil");
    //        }			//bir önceki class üzerinden hatayi getirtmis olduk.
    //    }
    //}
    //
    //
    //*******************************************************************************************************


    //Exception
    //
    //Java’da bir program calistirildiginda, farkli sorunlar olusabilir.
    //
    //➢ Programcilarin yazdigi kodlarda hata olabilir
    //
    //➢ Kullanicidan istenen degerlerde uygun olmayan deger girilebilir
    //➢ Internet baglantisinin kesilmesi gibi ongorulemeyen hatalar olabilir
    //
    //	Her sey olmasi gerektigi gibi.. No exception
    //
    //	Sorun var ama halledilebilir.. No Exception
    //
    //	Sorun var ve halledilemez! Throw Exception
    //
    //Bir program calistirildiginda, Java cozemedigi bir sorunla karsilastiginda calismayi durdurur (stops execution) ve “throws an exception”  hatasi verir.
    //
    //Java karsilastigi sorunu ve sorunla karsilastigi durumu bize rapor eder (konsol daki kirmizi ve mavi yazilar)
    //
    //*Sorunu cozmek icin try - catch block kullaniriz.
    //*Try blogu tek basina calismaz. (Sorun cikmazsa yapacagi islem )
    //*Try blogundan sonra mutlaka catch block(lari) veya finally block olmalidir. (Beklenen exception turu gerceklendiginde calisacak kodlar )
    //
    //	Catch block’da kullanilan “e” nin gorevi
    //
    //➢ Catch block’da yazdigimiz Exception ismi class adi (Data turu) , “e” ise variable ismidir.
    //
    //➢ e. yazinca ilgili exception class’indan kullanabilecegimiz method’lari gorebiliriz.
    //
    //	File Input/Output Exceptions
    //
    //Java’dan bir dosya okumasini veya bir dosyaya yazmasini istedigimizde, Java olasi problemleri ongorur ve bizden cozum ister.
    //
    //Buradaki CTE, kodumuzda bir hata oldugu icin degil yazdigimiz kod calistiginda olusabilecek olasi okuma hatalarinda ne yapilacagina karar vermek icindir.
    //
    //Muhtemel sorunlar birden fazla ise;
    //
    //1) Ic ice try-catch bloklari kullanilabilir.
    //
    //2) Tek try- multiple catch kullanilabilir.
    //
    //Birden fazla catch block kullanilacaksa yazilacak exception’larin sirasi onemlidir.
    //Birbiri ile parent-child iliskisi olan exception’lar ise once child olan yazilmalidir.
    //Aksi durumda child exception kullanilmaz olur.
    //
    //3) Eger tum exception’lari iceren bir exception varsa sadece onu yazabiliriz.
    //
    //		Exception Types
    //
    //	1) Compile Time (Checked) Exceptions CTE
    //
    //Kod yazildiginda Java’nin ongordugu olasi sorunlardir.
    //Java olasi bir problem gordugunde kirmizi cizgi ile bizi uyarir.
    //
    //(Not: Her kirmizi cizgi exception degildir.)
    //(FileNotFoundException,IOException)
    //
    //	2) RunTime (Unchecked) Exceptions RTE
    //
    //Kod calistirildiginda ortaya cikan exception’lardir.
    //(ArithmeticException)
    //
    //	2a) NullPointerException
    //
    //➢ null objesini uygun olmayan bir komutta kullanirsaniz Java NullPointerException verir.
    //
    //➢ NullPointerException run time exception’dir.
    //
    //	2b) illegalArgumentException
    //
    //……… Yas eksi deger girildiginde
    //
    //	2c) ArrayIndexOutOfBoundsException
    //
    //➢ Array veya List’de olmayan bir index icin islem yapmak isterseniz Java ArrayIndexOutOfBoundsException verir.
    //
    //➢ ArrayIndexOutOfBoundsException run time exception’dir.
    //
    //	2d) ClassCastException
    //
    //➢ Bir datayi casting yapilamayacak bir dataya cevirmek istediginizde ClassCastException verir.
    //
    //➢ ClassCastException run time exception’dir.
    //
    //	2e) NumberFormatException
    //
    //➢ Sayi olmayan bir String’i sayiyaya cevirmeye calisirsaniz Java NumberFormatException verir.
    //
    //➢ NumberFormatException run time exception’dir.
    //
    //	3a)IOException
    //
    //Programimizda bir file’a input/output yapiliyorsa ve program calisirken bir problem cikarsa olusur.
    //Checked exception’dir ve kod yazilirken mutlaka handle edilmelidir.
    //
    //	3b)FileNotFoundException
    //
    //Programimizda bir dosyayi okumaya calisiyorken, dosya bulunamazsa olusur. IOException’in subclass’idir.
    //
    //	3c)ClassNotFoundExeption
    //
    //	3d)SQLExeption
    //
    //	3e)NoSuchMethodExeption
    //
    //	throws
    //
    //➢ throws keyword “checked exceptions” icin kullanilir.
    //
    //➢ throws keyword, exception handle yapilmak istenmiyorsa kullanilir.
    //	NOT: (Exception olusunca program calismasi durur)
    //
    //➢ throws keyword’den sonra, aralarina virgul konularak, birden fazla exception yazilabilir
    //
    //➢ throws keyword method body icinde kullanilamaz, kullanilacaksa method isminin oldugu satirda yazilmalidir.
    //
    //➢ throws keyword’den sonra birden fazla exception kullanilacaksa ve yazilan exception’lar arasinda parent child iliskisi varsa , child exception yazilabilir ama tavsiye edilmez.
    //Cunku parent exception tum durumlari kapsayacaktir.
    //(Hedef farkli durumlar icin aciklama yazip handle etmek olmadigindan, bir exception’in calismasi yeterlidir)
}
