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
}
