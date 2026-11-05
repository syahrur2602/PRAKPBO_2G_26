package Jobsheet8.Tugas.Tugas3;

import Jobsheet8.Tugas.Tugas1.*;

public class MainTugas3 {
    public static void main(String[] args) {

        // 1. OK: Upcasting
        Zombie z = new WalkingZombie(100, 1);

        // 2. OK: Zombie implements Destroyable
        Destroyable d = z;

        // 3. ERROR KOMPILASI:
        // Zombie z2 = d;

        // 4. OK: Explicit casting
        Zombie z3 = (Zombie) d;
        System.out.println("z3: " + z3.getClass().getSimpleName());

        // 5. ERROR KOMPILASI:
        // Zombie z4 = new Zombie(100, 1);
        // Zombie merupakan abstract class.

        // 6. ERROR KOMPILASI:
        // Destroyable d2 = new Plant();
        // Plant tidak implements Destroyable.

        // 7. ERROR SAAT RUNTIME:
        Zombie z5 = new JumpingZombie(100, 2);

        try {
            WalkingZombie w = (WalkingZombie) z5;
            System.out.println(w);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: "
                    + e.getMessage());
        }
    }
}
