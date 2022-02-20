import java.util.ArrayList;
import java.util.Scanner;

public class U04ArrayList {
    public static void main(String[] args){
        ArrayList <String> isimler=new ArrayList<>(3);
        isimler.add(0,"mehmet");
        isimler.add(1,"ahmet");
        isimler.add(2,"samet");
        System.out.println(isimler);

        ArrayList <String> ekIsimler=new ArrayList<>(2);
        ekIsimler.add("burhan");
        ekIsimler.add("serdar");

        isimler.addAll(ekIsimler);

        System.out.println(isimler);

        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<2; i++){
        System.out.println("listeye 1 isim daha gir:");
        isimler.add(scanner.nextLine());}

        System.out.println(isimler);


    }

}
