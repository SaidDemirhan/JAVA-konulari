import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class U08DoWhileLoop {
    public static void main(String[] args){

        //iki pozitif sayinin carpinini bulalim; while loppla bulalim önce:

        int carpim=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen pozitif bir sayi giriniz: ");

        int sayi1=0;
        int sayi2=0;
        while (sayi1<=0 || sayi2<=0){ //sart saglandigi müddetce calisacaktir.

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();
            if (sayi1>0 && sayi2>0) {
                carpim = sayi1 * sayi2;
                System.out.println("carpim = " + carpim);
            }else
                System.out.println("Lütfen pozitif tam sayilar giriniz: ");
        }


        //Simdi de do while loop ile bulalim:

        int sayi3=0;
        int sayi4=0;
        System.out.println("Lütfen whileloop icin 2 sayi giriniz:");
        do {
            sayi3=scanner.nextInt();
            sayi4=scanner.nextInt();
            if (sayi3>0 && sayi4>0){
                System.out.println("whileloop carpimi:"+sayi3*sayi4);
            }else
                System.out.println("Lütfen pozitif sayi giriniz:");

        }while (sayi3<=0 || sayi4<=0); //yazilan sart dogruysa döngüye devam et

        //============================================================================//

        //kullanicidan toplamak icin pozitif sayilar iste ve bitirmek icin 0 a basmasini söyle.

        int sayi5=0;
        int toplam=0;
        int sayac=0;
        System.out.println("toplayacagim sayilari gir: \nbitirmek icin 0 a bas!");
        do {
            sayi5=scanner.nextInt();
            toplam+=sayi5;
            sayac++;
        }while (sayi5!=0);
        System.out.println((sayac-1)+" adet sayi girdiniz ve sayilarin toplami: "+toplam);

        //============================================================================//

        //List<Integer> rakamlar=new ArrayList<>();
        //rakamlar.add(3);
        //rakamlar.add(5);
        //rakamlar.add(7);              //veya
        Integer rakam[]={3,5,7};
        List<Integer> rakamlar= Arrays.asList(rakam);

        List<Integer> benimRakamlarim=new ArrayList<>();
        int sayi6;
        int sayac1=0;

        System.out.println("Lütfen istediginiz kadar rakam giriniz: \nbitirmek icin 0 a basiniz! ");

        do {
            sayi6=scanner.nextInt();
            if (sayi6!=0) {
                benimRakamlarim.add(sayi6);
                sayac1++;
            }
        }while (sayi6!=0);
        System.out.println(sayac1+" adet sayi girdiniz. \nGirdiginiz rakamlar "+benimRakamlarim);
        System.out.println("olan liste : "+ rakamlar);

        int sayac3= 0;
        List<Integer> ortakRakamlar= new ArrayList<>();

        for (int i=0; i<benimRakamlarim.size(); i++){
            if (rakamlar.contains(benimRakamlarim.get(i))){
                ortakRakamlar.add(benimRakamlarim.get(i));
                sayac3++;
            }
        }
        System.out.println("ortak olan "+sayac3+" adet rakam var ve bu/nlar: "+ortakRakamlar);
    }

    //Do While Loop Vs While Loop
    //
    //Fark : While Loop, dongunun başlangıcında kosulu kontrol eder ve kosul saglanirsa body
    // icindeki kodlari calistirir, saglanmazsa kodlar calistirilmaz.
    //
    //Do-while loop’ta ise , kosul body icerisindeki kodlar 1 kere calistiktan sonra
    //kontrol edilir.
    //
    //Sonuc : Bir while loop’daki kosul yanlıssa, loop hic caismaz ‘do-wile' loop’ta ise ,
    // kosul yanlissa kodlar 1 kere calisir.
}
