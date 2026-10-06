public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("34 ABC 123", "Toyota Corolla", 20.0, 50.0);

        myCar.checkStatus();


        System.out.println("\n>>> İşlem: 100 km sürüş yapılıyor...");
        myCar.drive(100);
        myCar.checkStatus();


        System.out.println("\n>>> İşlem: 200 km sürüş deneniyor (Yetersiz yakıt testi)...");
        myCar.drive(200);
        myCar.checkStatus();


        System.out.println("\n>>> İşlem: 20 litre yakıt alınıyor...");
        myCar.refuel(20); // 10L vardı + 20L = 30L oldu.
        myCar.checkStatus();


        System.out.println("\n>>> İşlem: 30 litre yakıt alınıyor (Aşırı doldurma testi)...");
        myCar.refuel(30);
        myCar.checkStatus();


        System.out.println("\n>>> İşlem: 450 km sürüş (Düşük yakıt uyarısı testi)...");
        myCar.drive(450);
        myCar.checkStatus();
    }
}