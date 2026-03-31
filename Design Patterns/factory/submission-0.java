interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    private Vehicle car = new Car();
    @Override
    public Vehicle createVehicle() {
        return this.car;
    }
}

class BikeFactory extends VehicleFactory {
    private Vehicle bike = new Bike();
    @Override
    public Vehicle createVehicle() {
        return this.bike;
    }
}

class TruckFactory extends VehicleFactory {
    private Vehicle truck = new Truck();
    @Override
    public Vehicle createVehicle() {
        return this.truck;
    }
}
