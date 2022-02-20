import java.util.Locale;

public class U12StringManipulation {
    public static void main(String[] args) {
        //STRING MANIPULATION

        //
        //String cumle = scan.nextLine()
        //
        //toLowerCase();		=kücük harf yapar
        //toUpperCase();		=buyuk harf yapar
        //concat();			=baska bir String i String e ekler
        //
        //charAt(2);			=Index 2. harfi verir
        //equals();			=Stringin yazilan Stringe esit olup olmadigini boolean ifade eder.
        //
        //EqualsIgnoreCase();		=Stringin yazilan Stringe esit olup olmadigini boolean ifade eder. 					 buyuk/kucuk harf e bakmaksizin verir
        //
        //length();			=uzunluk (arraydan farki parantezler)
        //indexOf("@gmail.com");	=kacinci indexten basliyorsa o indexi verir. Yoksa -1 verir
        //lastIndexOf('i');		=istenilen harfin cumle sonundaki indexini verir.
        //contains("buyuk");		=kelime veya harf iceriyor mu? TRUE FALSE
        //endsWith(".");		=ile bitiyor mu? TRUE FALSE
        //startsWith("C");		=ile basliyor mu? TRUE FALSE
        //startsWith("Java",8);	=8 den sonra _ile basliyor mu? TRUE FALSE
        //isEmpty();			=bos mu? TRUE FALSE
        //replace("a","x");		=tum a lari x yapar
        //replaceAll("a", "x");	=tum a lari x yapar
        //replaceAll("\\s", "*");	=space leri degistirir. 	//Caliskanlik*Java'da!*123
        //replaceAll("\\S", "*");	=SPACE koruyucu 		//*********** ******** ***
        //replaceAll("\\w", "*");	=harf ve rakam degistir 	//*********** ****'**! ***
        //replaceAll("\\W", "*");	=HARF/RAKAM KORUYUCU bir de _
        //replaceAll("\\d", "*");	=rakamlari degistirir
        //replaceAll("\\D", "*");	=RAKAM KORUYUCU
        //replaceFirst("J", "K");	=ilk karakteri istenen karakterle degistirir
        //substring(0);			=Index 0 dan itibaren alir
        //substring(3,7);		=Index 3 ten 7 haric alir
        //trim();			=bastaki ve sondaki bosluklari yok eder
        //
        //intiger i Stringe cevirme;
        //String sayiUzunlugu= Integer.toString(sayi);

        //================================================================================//

        //matematiksel islemler
        //
        //double str1D= Double.parseDouble(str1);
        //double toplamada kullanilir
        //double hipotenus= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        //double da matematiksel islem icin
        //
        //-------------------------------------------------------------------------------------------------------

        //String Manipulation / Methods
        //
        //	1- concatenation
        //
        //Birden fazla String’i birleştirerek tek bir String haline getirmek için kullanılır.
        //
        //Iki sekilde kullanilir.
        //
        //a) + (toplama) isareti ile:
        		String isim ="Ali";
        		String soyisim="Can";

        		System.out.println(isim+" "+soyisim);		//Ali Can
        //
        //b) concat() methodu kullanarak:
        		String isim1 ="Ali";
        		String soyisim1="Can";

        		System.out.println(isim1.concat(soyisim1));	//AliCan
        //
        //	2- charAt( )
        //
        //Istenen indexteki karakteri (char) dondurur.
        //Index 0’dan baslar, maximum index (String’in uzunlugu – 1) dir.
        //
        		String firma ="Techproeducation";

        		System.out.println(firma.charAt(2));		//c
        //
        //Eger method’da index olarak maximum indexden buyuk bir sayi kullanilirsa Java hata
        //verir (StringIndexOutOfBoundsException).
        //
        //	3-toUpperCase()
        //	4-toLowerCase()
        //
        //Girilen String degiskendeki tum harfleri Büyük harfe/kücük harfe cevirir.
        //
        		String firma1 ="Techproeducation";

        		System.out.println(firma1.toUpperCase());	//TECHPROEDUCATION
        		System.out.println(firma1.toLowerCase());	//techproeducation

        //NOT : toLowerCase(Locale locale)
        //
        //Girilen String degiskendeki tum harfleri istenen local dilde istenen bicime cevirir.
        //
        		String firma2 ="Techproeducation";		//i>I gibi

        		System.out.println(firma2.toLowerCase(Locale.forLanguageTag("tr")));

        //5- equals
        //
        //Verilen iki String’in iceriginin birbirine esit olup olmadigini kontrol eder.
        //
        //Eger verilen Stringlerdeki tum karakterler  (bosluk, buyuk harf, kucuk harf, ozel karakter ..) tamamen ayni ise TRUE doner, aksi durumda (bir karakter bile farkli olsa) FALSE doner.
        //
        		String isim3 =("Ali Can");
        		String isim4 =("Ali Can");

        		System.out.println(isim3.equals(isim4));		//true

        		String isim5 =("Ali Can");
        		String isim6 =("Ali can");

        		System.out.println(isim5.equals(isim6));		//false

        		String isim7 =("Ali Can");
        		String isim8 =(isim1 +"");

        		System.out.println(isim7.equals(isim8));		//true

        		System.out.println(isim7==isim8);		//false(cunku hiclik ekli)


        //6- equalsIgnoreCase
        //
        //Verilen iki String degiskeni BUYUK HARF / kucuk harf farki gozetmeksizin karsilastirir.
        //
        //Buyuk / kucuk harf farkliligi disinda herhangi bir karakter farkliligi oldugunda equals methodunda oldugu gibi FALSE dondurur.

        		String isim9 =("Ali Can");
        		String isim0 =("ali can");

        		System.out.println(isim9.equalsIgnoreCase(isim0));		//true
        		System.out.println(isim9.equals(isim0));			//false
        		System.out.println(isim9==isim0);				//false

        //7-length()
        //
        //Verilen String’deki karakter sayisini dondurur.

        		String isim11 =("Ali Can");

        		System.out.println(isim11.length());		//7(karakterden olusur)

        		String isim12 =("");

        		System.out.println(isim12.length());		//0

        		String isim13 =null;

        		System.out.println(isim13.length());		//Exception in thread "main"

        //	8-indexOf()
        //
        //Verilen String’de istenen karakterin kullanildigi ilk index’i dondurur.

        		String str ="Calisan Java Ögrenebilir.";

        		System.out.println(str.indexOf("Ö"));		//13	(String)
        		System.out.println(str.indexOf('n'));		//6	(char)
        		System.out.println(str.indexOf("k"));		//-1	(yoksa)
        		System.out.println(str.indexOf("Java"));	//8	(basladigi index)
        		System.out.println(str.indexOf('i', 8));	//20	(8‘den sonraki ilk i)
        		System.out.println(str.indexOf("i",8));		//20

        //	9- lastIndexOf()
        //
        //Verilen String’de istenen karakterin kullanildigi son index’i dondurur. Ayni sayar, sondakini verir.

        		String str1 ="Calisan Java Ögrenebilir.";

        		System.out.println(str1.lastIndexOf('i'));	//22
        		System.out.println(str1.lastIndexOf("l"));	//21
        		System.out.println(str1.lastIndexOf("k"));	//-1
        		System.out.println(str1.lastIndexOf("li"));	//21
        		System.out.println(str1.lastIndexOf('a',6));	//5 (6 da dahil önceki  son)

        //	10- contains()
        //
        //Verilen String’in istenen karakter(ler)i icerip icermedigini kontrol eder. Iceriyorsa TRUE, icermiyorsa FALSE dondurur.
        		String str2 ="Calisan Java Ögrenebilir.";

        		System.out.println(str2.contains("C"));		//true
        		System.out.println(str2.contains("k"));		//false
        		System.out.println(str2.contains("Java"));	//true

        //NOT: contains() methodu char icin kullanilamaz, String kullanmak zorunludur.
        //
        //	11- endsWith()
        //
        //Verilen String’in istenen karakter(ler) ile bitip bitmedigini kontrol eder. Istenen
        //karakter(ler) ile bitiyorsa TRUE, yoksa FALSE dondurur.

        		String str3 ="Calisan Java Ögrenebilir.";

        		System.out.println(str3.endsWith("."));					//true
        		System.out.println(str3.endsWith("bilir."));				//true
        		System.out.println(str3.endsWith("Calisan Java Ögrenebilir."));	//true
        		System.out.println(str3.endsWith(""));		//(hiclik)		//true
        //
        //	12- startsWith()
        //
        //Verilen String’in istenen karakter(ler) ile baslayip baslamadigini kontrol eder. Istenen karakter(ler) ile basliyorsa TRUE, yoksa FALSE dondurur.
        		System.out.println(str3.startsWith("C"));				//true
        		System.out.println(str3.startsWith("Calisan"));			//true
        		System.out.println(str3.startsWith("Calisan Java Ögrenebilir."));	//true
        		System.out.println(str3.startsWith("Java",8));				//true

        //	12 -isEmpty()
        //Verilen String’in uzunlugu 0(sifir) ise (Hicbir karakter icermiyorsa) TRUE, yoksa FALSE dondurur.

        		String str4 ="Calisan Java Ögrenebilir.";
        		String str5="";
        		String str6=null;

        		System.out.println(str4.isEmpty());	//false
        		System.out.println(str5.isEmpty());	//true
        		System.out.println(str6.isEmpty());	//Exception in thread "main"

        //	13- replace()
        //
        //Verilen String’deki istenen karakter(ler)i istenen yeni karakter(ler) ile degistirir.

        	String str7 ="Caliskan Java!";

        	System.out.println(str7.replace("a","x"));		//Cxliskxn Jxvx!
        	System.out.println(str7.replace("Java", "x"));		//Caliskan x!
        	System.out.println(str7.replace("i", "xxx"));		//Calxxxskan Java!
        	System.out.println(str7.replace("a", ""));		//Cliskn Jv!
        	System.out.println(str7.replace('a', '#'));		//C#lisk#n J#v#!

        //NOT : replace() methodu char icin de kullanilabilir.
        //
        //	14- replaceAll()
        //
        //replace() methodu ile benzer olarak verilen String’deki istenene karakter(ler)i istenen
        //yeni karakter(ler) ile degistirir.
        //Aralarindaki farklar:
        //
        //- replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz.
        //- replaceAll() methodunda Regular Expressions kullanilabilir.


        	String str8 ="Caliskanlik Java'da! 123";

        	System.out.println(str8.replaceAll("a", "x"));		//Cxliskxnlik Jxvx'dx! 123

        	System.out.println(str8.replace("a", "x"));		    //Cxliskxnlik Jxvx'dx! 123
        							//a>x replace ile ayni

        	System.out.println(str8.replaceAll("\\s", "*"));	//Caliskanlik*Java'da!*123
        							//space>*

        	System.out.println(str8.replaceAll("\\S", "*"));	//*********** ******** ***
        							// SPACE koruyucu, digerlerini * yapar.

        	System.out.println(str8.replaceAll("\\w", "*"));	//*********** ****'**! ***
        							// harf/rakam>*

        	System.out.println(str8.replaceAll("\\W", "*"));	//Caliskanlik*Java*da**123
        							//HARF/RAKAM KORUYUCU digerlerini * yapar

        	System.out.println(str8.replaceAll("\\d", "*"));	//Caliskanlik Java'da! ***
        							//rakam>*

        	System.out.println(str8.replaceAll("\\D", "*"));	//*********************123
        							//RAKAM KORUYUCU digerlerini * yapar.

        //	15- replaceFirst()
        //
        //Verilen String’deki istenen karakter(ler)in ilkini, istenen yeni karakter(ler) ile degistirir.

        	String str9 ="Caliskanlik Java'da! 123";

        System.out.println(str9.replaceFirst("J", "K"));		//Caliskanlik Kava'da! 123
        System.out.println(str9.replaceFirst("lik", " olmak"));    //Caliskan olmak Java'da! 123
        System.out.println(str9.replaceFirst("\\d", "*"));		//Caliskanlik Java'da! *23

        //	16- substring()
        //
        //Index kullanarak verilen String’in istenen parcasini almamizi saglar.

        	String str0 ="Caliskan Java!";

        	System.out.println(str0.substring(0));		//Caliskan Java!
        	System.out.println(str0.substring(1));		//aliskan Java!
        	System.out.println(str0.substring(14));		//(hiclik)

        	System.out.println(str0.substring(3,7));		//iska
        	System.out.println(str0.substring(3,4));		//i
        	System.out.println(str0.substring(3,3));		//(hiclik)
        	System.out.println(str0.substring(3,1));		//Exception in thread "main"
        	System.out.println(str0.substring(20));		//Exception in thread "main"

        //Not : Java’da iki tur hata mesaji aliriz.
        //
        //1- Compile Time Error (CTE) : Kodumuzu yazarken kod altinin kirmizi cizgi olmasi
        //2- Run Time Error (RTE) : Kod calistirildiginda (Execute) karsilastigimiz hatalar.
        //
        //	17- trim()
        //
        //Istedigimiz String’in basinda veya sonunda var olan bosluk / “space” leri temizler

        		String str11 ="    Caliskan Java!   ";

        		System.out.println(str11.trim());			//Caliskan Java!
        //______________________________________________________________________________________

    }
}
