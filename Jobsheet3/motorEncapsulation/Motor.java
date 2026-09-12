package Jobsheet3.motorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int maxSpeed = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 50;
            if (kecepatan > maxSpeed) {
                System.out.println("Kecepatan tidak bisa melebihi " + maxSpeed + "\n");
                kecepatan = maxSpeed;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
            if (kecepatan < 0) {
                kecepatan = 0;
            }
        } else {
            System.out.println("Kecepatan tidak bisa dikurangi karena meisn off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
