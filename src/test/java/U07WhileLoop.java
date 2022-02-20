import java.util.Locale;
import java.util.Scanner;

public class U07WhileLoop {
    public static void main(String[] args){

        int i=0;
        while (i<5){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();
        //=============================================================================//

        //Kullanici iki harf girsin ve aradaki harfleri büyük harf olarak yazdiralim

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen ilk harfi giriniz:");
        char ilkHarf=scanner.next().toUpperCase().charAt(0);

        System.out.println("lütfen son harfi giriniz:");
        char sonHarf=scanner.next().toUpperCase(Locale.ROOT).charAt(0);

        char harf=ilkHarf;
        while (harf<=sonHarf){
            System.out.print(harf+" ");
            harf++;
        }

        //=============================================================================//

        //Kullanicidan bir sayi al ve sayinin rakamlar toplamini yazdir.

        scanner.nextLine();
        System.out.println("lütfen bi pozitif tam sayi gir:");

        int sayi= scanner.nextInt();

        int j=sayi;
        int rakamlartoplami=0;
        int sonRakam=0;
        while (j>0){
            sonRakam=j%10;
            rakamlartoplami+=sonRakam;
            j/=10;
        }
        System.out.println("rakamlar toplami = " + rakamlartoplami);

        //=============================================================================//

        //Kullanicidan toplamak üzere rakam alin ve 20 yi gecice
        //kac sayi girdigini ve toplamini yazdirin.

        int sayac=0;
        int toplam=0;
        while (toplam<=20){
            System.out.println("Lütfen bir rakam giriniz: ");
            int rakam=scanner.nextInt();
            toplam+=rakam;
            sayac++;
        }
        System.out.println(sayac+" kez rakam girdiniz\ntoplam = " + toplam);

    }



}
