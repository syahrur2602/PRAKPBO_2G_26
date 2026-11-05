package Jobsheet8.Tugas.Tugas2;

import Jobsheet8.Tugas.Tugas1.Barrier;
import Jobsheet8.Tugas.Tugas1.Destroyable;
import Jobsheet8.Tugas.Tugas1.JumpingZombie;
import Jobsheet8.Tugas.Tugas1.Plant;
import Jobsheet8.Tugas.Tugas1.WalkingZombie;
import Jobsheet8.Tugas.Tugas1.Zombie;

public class MainTugas2 {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        Destroyable[] objects = {wz, jz, b};

        for (int i = 0; i < 4; i++) {
            for (Destroyable object : objects) {
                p.doDestroy(object);
            }
        }

        for (Destroyable object : objects) {
            if (object instanceof Zombie) {
                Zombie z = (Zombie) object;
                z.heal();
                System.out.println(z.getZombieInfo());
            } else if (object instanceof Barrier) {
                Barrier barrier = (Barrier) object;
                System.out.println(barrier.getBarrierInfo());
            }
        }
    }
}
