public class Car {

    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;


    public Car(String plateNumber, String model, double startingFuel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = startingFuel;
        this.tankCapacity = tankCapacity;
    }


    public void drive(double km) {
        double requiredFuel = km / 10.0;


        if (fuelLevel >= requiredFuel) {
            mileage += km;
            fuelLevel -= requiredFuel;
            System.out.println("Araba " + km + " km sürüldü.");
        } else {

            System.out.println("HATA: Bu yolculuk için yeterli yakıt yok!");
            System.out.println("Gereken: " + requiredFuel + " L, Mevcut: " + fuelLevel + " L");
        }
    }


    public void refuel(double amount) {

        if (fuelLevel + amount > tankCapacity) {
            double discarded = (fuelLevel + amount) - tankCapacity;
            fuelLevel = tankCapacity; // Depoyu tam kapasiteye getir
            System.out.println("Depo fullendi. " + discarded + " litre fazla yakıt atıldı.");
        } else {

            fuelLevel += amount;
            System.out.println(amount + " litre yakıt eklendi.");
        }
    }


    public void checkStatus() {
        System.out.println("--- Araç Durumu ---");
        System.out.println("Plaka: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Kilometre: " + mileage + " km");
        System.out.println("Yakıt Seviyesi: " + fuelLevel + " L / " + tankCapacity + " L");

        double lowFuelThreshold = tankCapacity * 0.10;
        if (fuelLevel < lowFuelThreshold) {
            System.out.println("UYARI: Düşük yakıt seviyesi!");
        }
        System.out.println("-------------------");
    }
}
