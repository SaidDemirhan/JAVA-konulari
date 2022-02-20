import java.util.Scanner;

public class U02Ifelse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi=scanner.nextInt();
        if (sayi==5){
            System.out.println("Girdiginiz sayi "+sayi+"'tir.");
        }else if(sayi<5){
            System.out.println("Girdiginiz sayi 5'ten kücüktür.");
        }else
            System.out.println("Girdiginiz sayi 5'ten büyüktür.");



    }
}
