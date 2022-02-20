import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U06NestedForLoop {
    public static void main(String[] args){
        //bir carpim tablosu olusturalim

        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

        //================================================================================//

        //iki listedeki ortak isimlerin hangileri oldugunu yazdiralim

        List<String> isimler1=new ArrayList<>();
        isimler1.add("ali");
        isimler1.add("ayse");
        isimler1.add("fatma");

        String isim[]={"Ali", "Ayse", "Fatih"};
        List<String> isimler2= Arrays.asList(isim);

        List<String> ortakIsimler=new ArrayList<>();

        for (int i=0; i<isimler1.size(); i++) {
            for (int j = 0; j<isimler2.size(); j++){
                if (isimler1.get(i).equalsIgnoreCase(isimler2.get(j))){
                    ortakIsimler.add(isimler1.get(i));
                }
            }
        }

        System.out.println("ortakIsimler = " + ortakIsimler);
    }

    //Nested For Loop
    //
    //Bazen tek bir loop ile istedigimiz sonuclara ulasamayiz.
    //Ozellikle iki boyutlu sekiller cizdirmek veya carpim tablosu gibi
    //sayi ikilileri olusturmak icin nested loop kullanmamiz gerekir.
}
