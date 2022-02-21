public class U16Inheritance {

    //Inheritance (Kalitim)  extends
    //
    //➢ Java'da inheritance, bir objenin/class’in baska bir objenin/class’in
    // tüm özelliklerini ve davranışlarını elde ettiği bir mekanizmadır.
    //
    //➢ Inheritance,OOP'lerin (Nesne Yönelimli programlama sistemi) önemli bir parçasıdır.
    //
    //➢ Java'da Inheritance’in arkasındaki fikir, daha once’den olusturulmus
    // Class’larin üzerine yeni Class’lar oluşturabilmemizdir.
    //
    //➢ Inheritance sayesinde yeni olusturdugumuz bir class’in var olan bir class’in
    // tum methodlarini ve variable’larini kullanmasini saglayabiliriz.
    //
    //➢ Inheritance bu islemin adidir. Inheritance sayesinde child class,
    // parent class’daki public veya protected primitive datalari, objectleri,
    // veya metodlari problemsiz bir sekilde kullanabilir.
    //
    //Inheritance sayesinde yazılan bir code’un tekrar tekrar kullanılabilmesi
    // (reusability) mümkün olur.
    //
    //Geneli kapsayan class uyeleri parent class’a, daha spesifik olanlar ise
    // child class’larda olusturulur.
    //
    //NOT 1: Child classlar public ve protected data’lari problemsiz bir sekilde
    // inherit edebilir.
    //
    //NOT 2: Private data’lar inherit edilemez.
    //
    //NOT 3: Default data’lar child ve parent ayni package’da olduklari zaman inherit edilebilirler.
    //
    //NOT 4: Static Methods veya variable’lar inherit edilemezler.
    //
    //*parent class Super olur child class Sub olur.
    //
    //* Child extends Parent(public class Child extends Parent)

    //1)Java’da class’lar arasinda parent(Aile)-child(Cocuk) relationship(iliski) vardir.
    //
    //2)Parent Class’a “super class” da denir. Child Class’a “sub class” da denir.
    //
    //3)Ortak ozellikler parent class’a, specific uniqe ozellikler child class’a yazilir.
    //
    //4)Parent Child Relationship “reusability” (tekrarlı kullanım), “maintenance” (tamir),
    // “less code” (az kod), “well organization” acilarindan faydalidir.
    //
    //5)Child classlar parent’lardaki her methodu ve variable’i kullanabilir ama
    // parent class child’dakileri kullanamaz.
    //
    //6)Java “Multiple Inheritance”’i desteklemez.
    // Yani; Java’da bir Child Class’in 1’den fazla parent’i olamaz.
    // Yani extends bir tane yazilir.
    //
    //7)Bir parent class, 1'den fazla child class ile olusturulan parent child relationship’e
    // “Hierarchical Inheritance” denir.
    // yani Kardes klaslar parentlerine karsi hiyerarsik olur.
    //
    //
    //8)Child-Parent-Grandparent... seklinde olusturulan cok katli parent child relationshipe’e
    // multi-level inheritance denir.
    // Dede baba torun iliskisi
    //
    //9)“Object Class” butun classlarin parent class’idir.
    // Java’da parent class’i olmayan tek class “Object Class”dir. hz Adem gibi.
    //
    //	Inheritance’in faydalari:
    //
    //1: Tekrarlardan kurtuluruz
    //2: Daha az kod yazarak islemlerimizi yapabiliriz
    //3: Kolayca update yapabiliriz
    //4: Application’in bakimi ve surdurulmesi (maintenance) kolaylasir
    //


    //	Single Inheritance
    //
    //Java Single Inheritance kabul eder.
    // Bir child class’in sadece bir tane parent class’i olabilir .
    //


    //	Hierarchical Inheritance
    //
    //Birden fazla class ayni class’i parent olarak kullanabilir.



    //	Multiple Inheritance
    //
    //Bir class’in birden fazla class parent olarak kabul etmesi demektir,
    // ancak Java multiple inheritance KABUL ETMEZ
    //


    //	Multilevel Inheritance
    //
    //Java Inheritance zincirini kabul eder.
    //Bir child class’in sadece bir tane parent class’i olabilir
    // (ve onun parent class zinciri).
    //


    //	java.Iang.Object Class
    //
    //Java’da, butun class’lar Object Class’dan inherit ederler.
    //Object Class butun class’larin parent’idir ve
    // Object Class parent’i olmayan tek class’dir.
    //



    //	IS-A (i) & HAS-A (!) Relationship
    //
    //IS-A ilişkisini kolayca tanımlayabileceğinizi unutmamak önemli bir noktadır.
    // Bir extends anahtar sözcüğünü gördüğünüz her yerde,
    // bu sınıfın IS-A ilişkisine sahip olduğu söylenebilir.
    // ( BMW IS-A Car, Car IS-A Vehicle vb..)  child den parent e giderken
    //


    //HAS-A iliskisi Java'da kodun yeniden kullanılabilirliği için kullanılır.
    // Java'da Has-A ilişkisi, basitçe, bir sınıfın bir örneğinin başka bir sınıfın
    // bir örneğine veya aynı sınıfın başka bir örneğine başvurusu olduğu anlamına gelir.
    // (Apartman HAS-A daire, daire HAS-A mutfak vb..) parentten childe giderken
    //




    //	Inheritance’da Constructor Cagirma (extends oluyorlar akraba gibi)
    //
    //1) Bir class’da constructor calistirdigimizda once parent class’daki constructor calisir.
    //Cunku her constructor’in ilk satirinda super() keyword vardir(gorunmese bile).
    //
    //2) Eger parent (super) class’da super() ile cagirdiginiz constructor yoksa
    // Java Compile time Error verir.
    //
    //2) super(); parent class’dan constructor cagirmak icin,
    //this(); icinde olunan class’da baska bir constructor cagirmak icin kullanilir.
    //
    //Not: Esasinda “this” keyword parent class’dan variable cagirmak icin de kullanilabilir;
    // fakat tavsiye edilmez.
    //Cunku, child ve parent class’larda ayni isimli iki variable varsa,
    // “this” parent class’dan variable cagiramaz.
    //
    //➢ super() ve this() constructor cagirmak icin kullanilirlar ve
    // constructor’in ilk satirinda olmalidirlar.
    // Bu durumda bir constructor’da ikisinin birden olmasi mumkun degildir.
    //
    //➢ super. ve this. variable cagirmak icin kullanilirlar.
    // Ilk satirda olma sarti olmadigi icin ikisi birlikte kullanilabilirler.
    //
    //*bir obje create edildiginde once, parentteki consructor
    // sonra hiyerarsik olarak daha sonraki parentteki constructor,
    // en son torun classtaki constr calisir
    //	Inheritance’da Data Type Kullanimi
    //
    //Avantaj : Daha genis tanimlama yapilabilir
    //
    //Dezavantaj : Kullanilabilen variable’lar o class ve parent class’lara ait olanlar
    // Ayni isimde iki method varsa Data Turu’ne bakilir.


    //====================================================================//
    //INHERITANCE
    //
    //public class ParentClass{
    //	public String isim;/public String isim=“Ali“;
    //}
    //
    //public class ChildClass extends ParentClass{
    //	public static void main(String[] args()){
    //	ChildClass obj=new ChildClass();
    //	obj.isim=“Mehmet“;/ obj.isim;
    //	}
    //}
    //	*Bird IS-A (n) Animal(/\). / Car HAS-A (n) Engine(\/).=>Relationship
    //	*inheritance ta private methodlar görünmez. private Varable lara set ve get ile ulasilabilir.
    //
    //-------------------------------------------------------------------------------------------------------
}
