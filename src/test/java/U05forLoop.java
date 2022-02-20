import java.util.ArrayList;
import java.util.Scanner;

public class U05forLoop {
    public static void main (String[] args){
        //50 den 10  a kadar olan sayilari 3er 3er geri dogru yazdir


        ArrayList<Integer> ucerli=new ArrayList<>();
        for (int i=50; i>=10; i-=3 ){
            //System.out.print(i+" ");
            ucerli.add(i);
        }
        System.out.print(ucerli);

        System.out.println();
//=====================================================================================//
        //50 ile 100 arasindaki 3 ebölünebilen sayilari list e kaydet

        ArrayList<Integer> uceBolunen=new ArrayList<>();
        for (int i=50; i<=100; i++){
            if (i%3==0)
                uceBolunen.add(i);
        }
        System.out.println(uceBolunen);
        System.out.println(uceBolunen.get(3));

        //=====================================================================================//

        //Kullanicidan bir string iste ve tersten yazdir

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();

        //ArrayList<String> tersKelime=new ArrayList<>();
        String terstenkelime="";
        for (int i=0;i<kelime.length(); i++){
            //tersKelime.add(kelime.substring(kelime.length()-i-1,kelime.length()-i+1-1));
            System.out.print(kelime.substring(kelime.length()-i-1,kelime.length()-i));
            terstenkelime+=kelime.substring(kelime.length()-i-1,kelime.length()-i);
        }
        //System.out.print(tersKelime);
        System.out.println();
        System.out.println(terstenkelime);
//=====================================================================================//

        //10 dan kücük bir tamsayi iste ve faktorielini bul

        scanner.nextLine();
        System.out.println("10 dan kücük bir tam sayi gir:");

        int sayi= scanner.nextInt();

        int faktoryel=1;
        for (int i=1; i<=sayi; i++){
            faktoryel*=i;
        }
        System.out.println(faktoryel);
    }
}
