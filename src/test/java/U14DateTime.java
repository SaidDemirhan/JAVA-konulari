public class U14DateTime {
    public static void main(String[] args) {
        //DATE&TIME
        //
        //LocalDate tarih = LocalDate.now();	= tarihi verir
        //
        //tarih.plusDays()			= gun ileri alir
        //tarih.minusDays()			= gun geri alir
        //tarih.getMonth()			= ayi getirir(AUGUST)
        //tarih.getMonthValue()		= kacinci ayda oldugunu getirir.(8)
        //tarih.getDayOfWeek()		= Haftanin hangi gununde oldugunu verir TUESDAY
        //tarih.getDayOfMonth()		= ayin kacinci gununde oldugunu getirir 17
        //tarih.getDayOfYear()		= yilin kacini gununde oldugunu getirir 215
        //tarih.isLeapYear()			= artik yil mi TRUE/FALSE
        //
        //LocalDate tarih2 = LocalDate.of(1986, 5, 1);		= istenilen tarihi tanimlama
        //
        //Period yas =Period.between(tarih2, tarih);		=iki tarih arasindaki süreyi bulma
        //Period.between(tarih2, tarih1).getYears();		=sadece yili getirmek istersek (yas)
        //
        //tarih.isAfter(tarih2)		= sonra mi?  TRUE/FALSE
        //tarih2.isBefore(tarih)		= once mi? TRUE/FALSE
        //
        //LocalTime saat = LocalTime.now();	=saati verir.
        //
        //saat.plusHours()			= yazilan saat kadar ilerisini gösterir
        //saat.minusHours()			= yazilan saat kadar gerisini gösterir
        //saat.getMinute()			= dakikasini gösterir
        //
        //saat.now(ZoneId.of("Turkey"))		= yazilan String in yerel saatini gösterir.
        //
        //LocalDateTime tarihSaat = LocalDateTime.now(); 	= tarihle zamani birlikte verir
        //
        //DateTimeFormatter tarz = DateTimeFormatter.ofPattern("dd/MM/yy");		= tarih yazim tarzini belileme
        //
        //tarz.format(tarih)			= tarz a göre belirlenen tarihi yazdir
        //
        //M 		= Kacinci ay oldugu (8)
        //MM		= Kacinci ay oldugu 2 rakam (08)
        //MMM 		= Ayin ilk 3 harfi (Aug.)
        //MMMM 		= Ay isminin tamami (August)
        //
        //DateTimeFormatter tarz2 = DateTimeFormatter.ofPattern("hh:mm");		= saat yazim tarzini belirler.
        //
        //tarz2.format(saat)		=tarz2 ye göre saati yazdirir.
        //
        //Hh 		= 12 saat formatinda
        //HH 		= 24 saat formatinda
        //mm 		= dakika *MM ay ile karistirilmamali
        //
        //
        //*System.out.println(System.currentTimeMillis());	= milisaniyeyi verir.
        //								  Islem oncesine ve sonrasina konabilir.
        //-------------------------------------------------------------------------------------------------------
    }
}
