//package TransportFactoryPattern;

// Product Interface
interface Transport {
    String book();
}

// Concrete Products
class Car implements Transport {
    public String book() {
        return "Booking a Car";
    }
}

class Bike implements Transport {
    public String book() {
        return "Booking a Bike";
    }
}

class Bus implements Transport {
    public String book() {
        return "Booking a Bus";
    }
}

// Factory class
abstract class TransportFactory {
    abstract Transport createTransport();
}

// Concrete Factories
class CarFactory extends TransportFactory {
    public Transport createTransport() {
        return new Car();
    }
}

class BikeFactory extends TransportFactory {
    public Transport createTransport() {
        return new Bike();
    }
}

class BusFactory extends TransportFactory {
    public Transport createTransport() {
        return new Bus();
    }
}

// Client Code
public class exe2 {
    public static void main(String[] args) {
        TransportFactory factory;

        factory = new CarFactory();
        Transport t1 = factory.createTransport();
        System.out.println(t1.book());

        factory = new BikeFactory();
        Transport t2 = factory.createTransport();
        System.out.println(t2.book());

        factory = new BusFactory();
        Transport t3 = factory.createTransport();
        System.out.println(t3.book());
    }
}
