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
}
