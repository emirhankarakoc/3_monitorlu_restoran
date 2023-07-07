public class kASA {

    //siparis gorme
    //fiyat hesaplama

    public void masaninFiyatiniHesapla(mASALAR masa){
        System.out.println(masa.isim + "in yediklerinin toplam ucreti = " + masa.hesap +"TL\n");
    }
    public void masaninYedikleriniGoster(mASALAR masa){
        System.out.println(masa.isim + "in yedikleri :\n" + masa.yedikleri +"\n" );
    }

}
