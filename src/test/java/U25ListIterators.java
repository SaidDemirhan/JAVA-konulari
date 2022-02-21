public class U25ListIterators {
    //LISTITERATORS		=Iterator un cok method lu hali
    //-ileri veya geri hareket edebilir.
    //-ListIterator interface i, Iterator Interface inin child idir ve tüm methodlarini kullanir.
    //-Collection daki elemanlari arasinda gezinebilmek icin mutlaka WHILE LOOP olusturulmali.
    //
    //add()		=eleman ekler.
    //*next()	=bulundugu elemani getirir ve ileriye gider.
    //*hasNext()	=sonrasinda bir eleman olup olmadigini boolean olarak getirir.
    //*remove()	=elemani siler.
    //previous()	=bulundugu elemani getirir ve geriye dogru gider.
    //hasPrevious()	=öncesinde bir eleman olup olmadigini boolean olarak getirir.
    //nextIndex()	=index i destekleyen bir collection ise kullanilabilir, next() gibidir.
    //previousIndex()=index i destekleyen bir collection ise kullanilabilir, previous() gibidir.
    //set()		=getirilen elemani istenilen ile degistirir.
    //
    //List<String> l = new ArrayList<>(Arrays.asList("A","B","C","D"));		//[A, B, C, D]
    //        //her elemanin sonuna B harfi ekleyelim
    //        ListIterator li1=l.listIterator();
    //        while (li1.hasNext()){
    //            String temp= (String) li1.next();
    //            li1.set(temp+"B");
    //        }
    //        System.out.println(l);		//[AB, BB, CB, DB] sekline döndü.
    //=>Baska bir örnek:
    //	List<Integer> l = new ArrayList<>(Arrays.asList(2, 13, 56, 23, 45, 14, 40));
    //        ListIterator li=l.listIterator();
    //        while (li.hasNext()){
    //            int temp= (int) li.next();
    //            if (temp<10||temp>40){		//10 ile 40 arasindakileri istiyoruz.
    //                li.remove();			//sarta uymayanlari sildi.
    //            }
    //        }				        System.out.println(l);//[13, 23, 14, 40]
    //=>Baska bir örnek:
    //	public static void main(String[] args) {
    //        List<Integer> l = new ArrayList<>(Arrays.asList(2, 13, 56, 23, 45, 14, 40));
    //        ListIterator li=l.listIterator(); 		//tersten yazdirmak istiyoruz.
    //        while (li.hasNext()){
    //            li.next(); 					//bu sekilde yaparak kursöru sona getirdik.
    //        }
    //        while (li.hasPrevious()){
    //            System.out.print(li.previous()+" ");	//40 14 45 23 56 13 2
    //        }
    //-------------------------------------------------------------------------------------------------------

    //ListIterator
    //
    //NOT : ListIterator iterator’in child interface’idir ama  daha fazla method’a sahip oldugu icin
    // daha cok kullanilir.
    //
    //Iterator ve ListIterator arasındaki en büyük fark,
    //Iterator'ın koleksiyondaki öğeleri yalnızca ileri yönde hareket ettirebilmesidir,
    // cunku next(), hasNext(), remove()
    // ve forEachRemaining() method’larina sahiptir. ListIterator ise bir koleksiyondaki öğeleri
    // hem ileri hem de geri yönde hareket ettirebilir .
}
