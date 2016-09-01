package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/1/16.
 */
public class Bicycle implements Vehicle {
    int speed;

    // speed up and apply brake are programmed to gradually increase/decrease speed, emulating an actual bicycle
    @Override
    public void applyBrake() {
        while (speed > 0) {
            speed--;
        }
    }

    @Override
    public void speedUp(int increase) {
        for (int i = 1; i <= increase; i++) {
            speed += 1;
        }

    }

    @Override
    public void slowDown(int decrease) {
        for (int i = 1; i <= decrease; i++) {
            speed += 1;
            System.out.println();
        }
    }
}
