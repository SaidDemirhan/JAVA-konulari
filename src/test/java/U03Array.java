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
