package transport;

import transport.Bus;
import transport.Car;
import transport.Lorry;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130);

        DriverB driverB = new DriverB("Иванов Иван", true, 4 );


        System.out.println(car);
        System.out.println(lorry);
        System.out.println(bus);
        bus.startMoving();
        car.stopMoving();
        lorry.startMoving();
        System.out.println(driverB.getCarMessage(car));
        System.out.println(driverB.start());
    }
}


