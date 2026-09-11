package Jobsheet1;

public class BikeDemo26 {

    public static void main(String[] args) {
        Bike26 mountainBike1 = new Bike26();
        Bike26 mountainBike2 = new Bike26();
        RoadBike26 roadBike1 = new RoadBike26();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();

    }
    
}
