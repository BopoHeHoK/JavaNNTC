package com.company;

//плацкартные вагоны
public class ReservedCars extends Cars{
    double reservedIncome = 0;
    int lower = 16, upper = 16, lowerSide = 4, upperSide = 4;
    double lowerPrice = 1300, upperPrice = 900, lowerSidePrice = 600, upperSidePrice = 500;
    @Override
    public double cost(int lower, double lowerPrice, int upper, double upperPrice,
                       int lowerSide, double lowerSidePrice, int upperSide, double upperSidePrice) {
        System.out.println("Плацкартный вагон:");
        System.out.println("Количество нижних мест: " + lower + ", цена: " + lowerPrice + " рублей");
        System.out.println("Количество верхних мест: " + upper + ", цена: " + upperPrice + " рублей");
        System.out.println("Количество нижних боковых мест: " + lowerSide + ", цена: " + lowerSidePrice + " рублей");
        System.out.println("Количество верхних боковых мест: " + upperSide + ", цена: " + upperSidePrice + " рублей");
        reservedIncome = lower * lowerPrice + upper * upperPrice + lowerSide * lowerSidePrice + upperSide * upperSidePrice;
        System.out.println("Доход от эксплуатации вагона: " + reservedIncome + " рублей");
        System.out.println();
        return reservedIncome;
    }
}

