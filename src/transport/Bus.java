package transport;

import java.util.Objects;

public class Bus extends Transport implements Competing {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;

    public Bus (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }
    @Override
    public int hashCode(){
        return Objects.hash (getModel(), getBrand(), getEngineCapacity());
    }
    void startMoving () {
        System.out.println("Автобус начинает движение");
    }
    void stopMoving () {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }
}