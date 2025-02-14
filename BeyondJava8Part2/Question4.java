package com.java.company.BeyondJava8Part2;

// Sealed class
 sealed class Vehicle permits Car, Bike, Truck {
    private final String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void displayInfo() {
        System.out.println("This is a Vehicle. Brand: " + getBrand());
    }
}


// Subclass 1: Car (non-sealed class)
 final class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Car. Brand: " + getBrand());
    }
}

// Subclass 2: Bike (sealed class)
 sealed class Bike extends Vehicle permits MountainBike, RoadBike {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Bike. Brand: " + getBrand());
    }
}

// Subclass 3: Truck (sealed class)
 sealed class Truck extends Vehicle permits PickupTruck, DeliveryTruck {

    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Truck. Brand: " + getBrand());
    }
}

// Specific subclass 1: MountainBike
 final class MountainBike extends Bike {

    public MountainBike(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Mountain Bike. Brand: " + getBrand());
    }
}

// Specific subclass 2: RoadBike
 final class RoadBike extends Bike {

    public RoadBike(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Road Bike. Brand: " + getBrand());
    }
}

// Specific subclass 3: PickupTruck
 final class PickupTruck extends Truck {

    public PickupTruck(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Pickup Truck. Brand: " + getBrand());
    }
}

// Specific subclass 4: DeliveryTruck
 final class DeliveryTruck extends Truck {

    public DeliveryTruck(String brand) {
        super(brand);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a Delivery Truck. Brand: " + getBrand());
    }
}

public class Question4 {
    public static void main(String[] args) {
        // Create instances of each subclass
        Vehicle car = new Car("Toyota");
        Vehicle mountainBike = new MountainBike("Giant");
        Vehicle pickupTruck = new PickupTruck("Ford");

        // Display information for each vehicle
        car.displayInfo();
        mountainBike.displayInfo();
        pickupTruck.displayInfo();
    }
}

