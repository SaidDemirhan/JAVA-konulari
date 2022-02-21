public class U31Queue {

    //QUEUE
    //
    //- Kuyruk manasina gelir.
    //- Elemanlar en sona eklenir ve en bastan silinir.(FIFO=First In First Out)
    //- Yemekhane, Eczane vs bu sistemi kullanmalidir.
    //- Interface oldugu icin constructor i yoktur.
    //- Queue olusturmak icin Child Class i olan LinkedList ten veya PriorityQue kullanilabilir
    //- Queue da index yoktur.
    //*******************************************************************************************************
//
//    Collections / Queue
//
//    Queue interface’dir dolayisiyla constructor’i yoktur.
//
//    Queue olusturmak icin child class’i olan LinkedList veya PriorityQueue kullanilabilir.
//
//            1) PriorityQueue constructor’i kullanarak Queue uretirseniz, Java kendisi bir "priority"(oncelik) kurali uretir ve urettigi bu kurala gore elemanlari dizer.
//    Istersek biz kendi "priority"(oncelik) kuralimizi uretip elemanlari bu kurala gore diz diyebiliriz.
//
//            2) LinkedList constructor’i kullanarak Queue uretirseniz elemanlari insertion sirasina gore ekler
//
//    Queue icin ayirici ozellik : Elemanlar en sona eklenir ve en bastan silinir. Bu sisteme FIFO(First In First Out) denir. Eczaneler, Yemekhaneler bu sistemi kullanir.
//
//    Collection Queue Method’lari
//
//1) peek(); ilk elemani silmeden bize retrun eder.
//
//            2) poll(); ilk elemani queue'dan siler ve bize return eder
//
//            3) offer(); eleman eklemek icin kullanilir
//
//    NOT : remove() ve poll() ilk elemani siler ve return eder.
//    Ama collection'da eleman yoksa remove() methodu Exception atar poll() methodu Exception atmaz null return eder.

}
