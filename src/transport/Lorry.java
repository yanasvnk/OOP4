package transport;

public class Lorry extends Transport implements Competing {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;

    public Lorry (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed) {
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
    void startMoving() {
        System.out.println("Грузовик начинает движение");
    }
    @Override
    void stopMoving() {
        System.out.println("Грузовик заканчивает движение");
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
