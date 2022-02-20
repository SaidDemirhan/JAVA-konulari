import java.util.Scanner;

public class U01Yazdirma {
    public static void main (String[]args){
        java.util.Scanner scan=new java.util.Scanner(System.in);
        System.out.println("isim:");
        String isim= scan.next();
        System.out.println("adim "+isim);


        System.out.print("soyad:");
        String soyad= scan.next();
        System.out.println("ben "+isim+" "+soyad);
        scan.close();

        //1-MAIN METHOD			public static void main(String[] args) { }
        //
        //2-SCANNER			Scanner scan = new Scanner(System.in);	scan.close();
        //
        //3-SYSO				System.out.println("");	int X = scan.nextInt();	/scan.nextLine();

    }


}
