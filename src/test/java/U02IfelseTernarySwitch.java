import java.util.Scanner;

public class U02IfelseTernarySwitch {
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
    //Ternary Operator
    //
    //Ternary islemi If Statement ile yapacagimiz islemleri basit olarak yapmamizi saglar
    //
    //Ternary islemi bize bir sonuc donecegi icin, bu islemi bir variable’a atamaliyiz.
    //
    //int y = 1;
    //int z = 1;
    //int a = y<10 ? y++ : z++; 			// true       a=1
    //
    //System.out.println(y + “,” + z + “,” + a); 	output= 2,1,1
    //
    //	Nested Ternary
    //
    //Condition ? (Kod 1) : (Kod 2) ;
    //
    //int y = 5;
    //(y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y); 			//8
    //
    //
    //	Switch Statement
    //
    //If else ile cozdugumuz sorularda kontrol etmemiz gereken sart sayisi cok oldugunda switch Statement kullanilir.
    //
    //“break“ komutu yapacagimiz islem bittiginde switch statement’in sonuna gitmemizi saglar.
    //
    //Java istenen case’e gittikten sonra break komutunu gorene kadar tum case’leri calistirir.
    //
    //default komutu basta tanimlanan degisken icin hic bir case calismazsa calistirmak isedigimiz kodlari yazdigimiz bolumdur. (If else statements da en sonda yazdigimiz else gibi calisir)
    //
    //Switch Statement’da long,double,float ve boolean kullanilamaz!
    //
    //int sayi= 3;
    //
    //		switch (sayi) {
    //		case 1:	//secenekler yazilmalidir.
    //			System.out.println("sayi=1");
    //			break;
    //		case 2:
    //			System.out.println("sayi=2");
    //			break;
    //		case 3:
    //			System.out.println("sayi=3");
    //			break;
    //		case 4:
    //			System.out.println("sayi=4");
    //			break;
    //		default:
    //			System.out.println("Sayi 1,2,3,4 rakamlarindan biri degildir!");
    //			break;	//sonda oldugu icin koyulmasa da olur.
    //		}
}
