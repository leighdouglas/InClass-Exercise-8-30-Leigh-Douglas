package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/1/16.
 */
public interface Vehicle {

    void applyBrake();
    void speedUp(int increase);
    void slowDown(int decrease);

    // notes: this is a contract that you implement on a class defines how an object is created. used by classes.
}