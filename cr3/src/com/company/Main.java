package com.company;

public class Main {

    public static void main(String[] args) {
        CouchetteCars couchetteCars = new CouchetteCars();
        int lower, upper, lowerSide, upperSide;
        double lowerPrice, upperPrice, lowerSidePrice, upperSidePrice;
        lower = couchetteCars.lower;
        upper = couchetteCars.upper;
        lowerSide = couchetteCars.lowerSide;
        upperSide = couchetteCars.upperSide;
        lowerPrice = couchetteCars.lowerPrice;
        upperPrice = couchetteCars.upperPrice;
        lowerSidePrice = couchetteCars.lowerSidePrice;
        upperSidePrice = couchetteCars.upperSidePrice;
        couchetteCars.cost(lower, lowerPrice, upper, upperPrice, lowerSide, lowerSidePrice, upperSide, upperSidePrice);

        ReservedCars reservedCars = new ReservedCars();
        lower = reservedCars.lower;
        upper = reservedCars.upper;
        lowerSide = reservedCars.lowerSide;
        upperSide = reservedCars.upperSide;
        lowerPrice = reservedCars.lowerPrice;
        upperPrice = reservedCars.upperPrice;
        lowerSidePrice = reservedCars.lowerSidePrice;
        upperSidePrice = reservedCars.upperSidePrice;
        reservedCars.cost(lower, lowerPrice, upper, upperPrice, lowerSide, lowerSidePrice, upperSide, upperSidePrice);

        SleepingCars sleepingCars = new SleepingCars();
        lower = sleepingCars.lower;
        upper = sleepingCars.upper;
        lowerSide = sleepingCars.lowerSide;
        upperSide = sleepingCars.upperSide;
        lowerPrice = sleepingCars.lowerPrice;
        upperPrice = sleepingCars.upperPrice;
        lowerSidePrice = sleepingCars.lowerSidePrice;
        upperSidePrice = sleepingCars.upperSidePrice;
        sleepingCars.cost(lower, lowerPrice, upper, upperPrice, lowerSide, lowerSidePrice, upperSide, upperSidePrice);

        Train train = new Train();
        double couchetteIncome = couchetteCars.couchetteIncome;
        double reservedIncome = reservedCars.reservedIncome;
        double sleepingIncome = sleepingCars.sleepingIncome;
        train.cost(train.couchetteCars, couchetteIncome, train.reservedCars, reservedIncome, train.sleepingCars, sleepingIncome);
    }
}

