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

    //ARRAYLIST OLUSTURMA
    //
    //List<Integer> list1 = new ArrayList<>();
    //
    //List<String>arrListe= Arrays.asList(arr);	=array i ArrayList e cevirme
    //syso(list1);				= yazdirma
    //list1.add(10);			= eleman ekleme
    //list1.addAll(list2);		= listeye yeni bir liste ekler
    //list1.isEmpty();			= bos mu? Boolean getirir.
    //liste1.size();			= uzunlugu
    //list1.remove("Zeki");		= listeden cikarma/ bulamazsa RTE
    //list1.removeAll(list1);		= Listedekilerin hepsini sil
    //list1.set(1,”Havva”);		= 1. indexi öldurur, yerine yazar
    //list1.get(3);				= indextekini getirir, gösterir.
    //list1.contains(“kedi”);		= var mi yok mu true /false
    //Collections.sort(list1);		= kucukten buyuge sialar.
    //list1.equals(list2);		= Liste1 list2 ye esit mi? TRUE FALSE
    //list1.clear();			= hepsini siler void calisir.
    //----------------------------------------------------------------------------------------------------

}
