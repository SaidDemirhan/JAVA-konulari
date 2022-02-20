import java.util.Arrays;
import java.util.Scanner;

public class U03Array {
    public static void main (String[] args){
        String isimler[]= {"ahmet", "mehmet", "ali"};
        System.out.println(Arrays.toString(isimler));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen girmek istediginiz sayilari giniz:");
        int sayilar[]=new int[3];
        int i=0;
        for (i=0; i<sayilar.length; i++){
            sayilar[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(sayilar));


        scanner.nextLine();

        String sehirler[]= new String[3];
        System.out.println("lütfen en sevdiginiz üc adet sehri giriniz:");
        int j=0;
        for (j=0; j<sehirler.length; j++){
            sehirler[j]= scanner.nextLine();
        }
        System.out.println(Arrays.toString(sehirler));


        //	Arrays
        //
        //Arrays birden fazla variable depolamak icin kullanilabilen object (non-primitive data)’lerdir.
        //
        //1) Arrays’de sadece primitive datalar veya non-primitive datalara ait referans’lar depolanabilir
        //
        //2) Arrays icindeki tum variable’lar ayni data type’inde olmalidir.
        //
        //3) Bir Array olusturmadan once o Array’in icine kac variable koyacagimiza karar vermeliyiz.
        //
        //4) Bir Array icine koyabilecegimiz variable sayisina o Array’in “length” i denir. O Array icine length’den fazla variable koyamayiz.
        //


        //5) Array’ler object (non-primitive) ’tir. Bu yuzden
        //
        //	- runtime’da olusturulurlar.(calistirildiginda)
        //	- Heap Memory’de depolanirlar.
        //	- Value ile birlikte method’lara da sahiptirler
        //
        //Bir Array declare edildiginde stack memory’de referans olusturulur ama Array henuz olusturulmamistir.
        //


        //6) Array declare etmek icin iki yol vardir :
        //
        //	- int myArray[ ] ; // Bu daha cok kullanilir
        //	- int [ ] myArray;
        //


        //7) Bir Array atama yapmak icin; iki sekilde yapilabilir;

        	int myArray[ ] = new int[3]; 	//(length’i 3 olan bir array olusturur.) //{0, 0, 0}

        	myArray[0] = 9;
        	myArray[1] = 10;
        	myArray[2] = 11;

        //	Once olusturup, sonra istedigimiz indexler icin deger atayabiliriz.
        //
        //Biz array’e eleman eklemezsek Java elemanlar icin data type’ina uygun default degerler atar.

        	int myArray1[ ] = {9, 10, 11};

        //Olusturma ve tum indexler icin deger atamayi tek satirda yapariz.
        //


        //9) Array’in elemanlarina nasil ulasilir ve nasil update edilir ?

        	myArray1[1] = 10;

        //Bir Array’de olmayan index’i kullanmak isterseniz “ArraysIndexOutOfBoundsException” alirsiniz.
        //


        //10) Bir Array’in uzunlugu nasil bulunur?

        	int myArray2[] = {9, 10, 11};

        	int size = myArray2.length;   //3

        //NOT : String ve Array icin length method’larinda dikkatli olmak gerekir.
        //
        //	Strings ==> length( )
        //	Arrays ==> length
        //


        //11) Bir Array’in tum eleamanlari nasil yazdirilir? Iki sekilde yazdirilabilir:

        	System.out.println(Arrays.toString(myArray2));

        	for(int k=0; k<size; k++) {
        	System.out.println(myArray2[k]);
        	}



        //12) Bir Array’in tum elemanlari nasil siralanir? Kücükten büyüge siralar.

        	Arrays.sort (myArray2);

        //Siralama buyukten kucuge nasil yapilir ?
        //
        //	- Once sort methodu kullanilir
        //	- Sonra siralamayi ters cevirmek icin loop kullanilir
        //


        //13) Bir Array’de istenen bir elemanin varligi nasil kontrol edilir?
        //
        //	Arrays.binarySearch( ) method’u belli bir elemanin bir array’de olup olmadigini
        //	kontrol etmek icin kullanilir.
        //
        //*Ancak, binarySearch( ) methodunu kullanmadan once mutlaka sort( ) methodu kullanilmalidir.
        //
        //	*Eger bir eleman array’de yoksa output negatif olur.
        //	-O eleman var olsaydi sira numarasi (lengt’i) kac olurduysa negatif’li hali,
        //	binarySearch( )’un outputu olur.
        //
        //	*Eger  bir eleman array’de varsa direkt olarak index’ini yazdirir.
        //


        //14) Iki array’in esit olup olmadigi nasil kontrol edilir?
        //
        //	Arrays.equals() method’u degerleri ve indexleri birlirkte kontrol edip,
        //	boolean bir deger return eder.
        //


        //16) Bir String nasil array’e cevrilir ?
        //
        //	.split( ) method’u String’e ait bir method’dur ve belirledigimiz ayirac’a gore
        //	String’i parcalara ayirip bir Array’e cevirir.

        	String strSplit= "Java ögrenmek ugras ister.";
        	String arrSplit[]=strSplit.split(" ");       // bosluklardan ayirir.
        	System.out.println(Arrays.toString(arrSplit));		//[Java, ogrenmek, ugras, ister]


        //=========================================================================//
        //		Multi Dimensional Arrays (Cok Katli Array’ler)
        //
        //Eger bir Array ic ice Array’lerden olusuyorsa buna Multi Dimensional Array denir.
        //
        //Array’i tanimlarken (declaration), her bir kat icin bir [ ] kullanilir.
        //
        //*Multi Dimensional Array’i iki sekilde olusturabiliriz;

        	int arr[ ][ ] = { {1,2} , {3,4}, {5,6}}; 	//bu sekilde olusturulabilecegi gibi

        	int arr1[ ] [ ] = new int [3][2];

        	arr [0][0]=1; 	//1 	//0 in 0 inci index ine deger atayarak da olusturabiliriz.

		System.out.println(Arrays.toString(arr[0]));
		//[1, 2] 	//ana array in 0. index indeki ic Array i yazdirir.

		System.out.println(arr[0][1]);
		//2	//ic array deki bir elemani yazdirir.

		System.out.println(Arrays.toString(arr));
		//[I@……..]         //seklinde anlasilmaz bir deger yazdirir.

        //*Multi Dimensional Array’in tum elemanlari nasil yazdirilir ? Iki sekilde olabilir;
		System.out.println(Arrays.deepToString(arr));
		// direkt yazdirabiliriz.
        //
        //Eger deepToString kullanilmaz, yerine toString kullanilirsa inner array’lerin
        // referanslarini yazdirir
        //
        //veya forLoop ile:

        	for(int l=0; l< arr.length; l++) {
        		for(int m=0; m<arr[l].length; j++){
					System.out.println(arr[l][m] + " ");
				}
        	}

    }

    //ARRAY OLUSTURMA
    //
    //int arr[]= {1,2,3};
    //
    //String isimler[] = {"Veli", "Ece", "Ali"};
    //
    //String isimler2[] = new String[3];	bos da olusturulabilir
    //isimler2[0] = "Ali";			sonradan ekleme veya degistirme
    //
    //Arrays.toString(arr)			=array yazdirma
    //
    //syso(Arrays.deepToString(arr));		=multiD Arrayin tum elemanlarini yazdirma
    //
    //	for (int i = 0; i < isimler2.length; i++) {
    //		System.out.print(isimler2[i]+" ");
    //	}							//sadece icindekileri yazdirir. //Ali Ahmet
    //
    //arr.length					=uzunlugunu verir *parantez yok.
    //Arrays.sort(arr);				=kucukte buyuge siralar
    //Arrays.equals(arr1,arr2)			=iki array index ve deger olarak esit mi TRUE/FALSE
    //Arrays.binarySearch(arr, 2)		=array da var mi? Varsa index, yoksa negatif sira(lengt)
    //return arr;					=metoddan istenilen methoda geri döndür
    //String kacKarakter[]=cumle.split(""); 	=harflerine boler(hiclik)
    //
    //List<String> list = Arrays.asList(arr);		=array i arrayList e cevirir.
    //String arr[ ] = list1.toArray(new String[0]);	=arrayList i array a cevirir
    //Object arr[ ] = list1.toArray( );		=arrayList i array a cevirir
}
