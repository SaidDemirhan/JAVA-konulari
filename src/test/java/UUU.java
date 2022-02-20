import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UUU {
    public static void main(String[] args) {
        //============================================================================//

        //Kullanicidan rakamlar iste ve bunlari bir list e kaydet.
        //daha önceden olusturulmus rakamlar list indeki ortak olanlari yazdir.

        Scanner scanner=new Scanner(System.in);

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
}
