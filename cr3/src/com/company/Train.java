package com.company;

public class Train {
    int couchetteCars = 4;
    int reservedCars = 6;
    int sleepingCars = 3;

    public void cost(int couchetteCars, double couchetteIncome, int reservedCars,
                     double reservedIncome, int sleepingCars, double sleepingIncome){
        double couchetteCarsIncome = couchetteCars * couchetteIncome;
        double reservedCarsIncome = reservedCars * reservedIncome;
        double sleepingCarsIncome = sleepingCars * sleepingIncome;
        double totalIncome = couchetteCarsIncome + reservedCarsIncome + sleepingCarsIncome;
        System.out.println("Общий доход от одного рейса поезда: " + totalIncome);
    }
}

