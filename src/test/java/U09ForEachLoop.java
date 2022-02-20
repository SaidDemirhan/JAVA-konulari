import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U09ForEachLoop {
    public static void main(String[] args){
        //1-Gelecek elementlerin data türü (String)
        //2-Getirdigi elemntlere verilen gecici isim(each)
        //3-Elemetlerin gelecegi collection (isimler1)

        int rakamlar[]={2,3,6,9,12};

        int carpim=1;

        for (int each:rakamlar){
            System.out.println(each); //Hepsi

            carpim*=each;

        }
        System.out.println("carpim = " + carpim); //Hepsinin carpimi

        //listedeki uzunlugu 4 ve daha fazla olan isimleri yazdiralim.

        List<String> isimler1=new ArrayList<>();
        isimler1.add("ali");
        isimler1.add("ayse");
        isimler1.add("fatma");

        for (String each:isimler1) {
            if (each.length()>=4){
                System.out.print(each+" ");
            }

        }

        System.out.println();
        //==========================================================================//

        //iki string arraydeki ortak elalmanlari yazdiralim, bossa eleman yok yazdir

        String arr1[]={"A","b","c","d","E"};
        String arr2[]={"A","c","D","f","E"};

        List<String> ortak= new ArrayList<>();

        for (String each:arr1){
            for (String w:arr2) {
                if (each.equals(w)){
                    ortak.add(w);
                }
            }
        }
        if(ortak.isEmpty()){
            System.out.println("Ortak bir eleman yoktur!");
        }else
        System.out.println("ortak = " + ortak);
    }
}
