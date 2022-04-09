package com.company;

//спальные вагоны
public class SleepingCars extends Cars{
    double sleepingIncome = 0;
    int lower = 16, upper = 16, lowerSide = 4, upperSide = 4;
    double lowerPrice = 1100, upperPrice = 800, lowerSidePrice = 600, upperSidePrice = 500;
    @Override
    public double cost(int lower, double lowerPrice, int upper, double upperPrice,
                       int lowerSide, double lowerSidePrice, int upperSide, double upperSidePrice) {
        System.out.println("Спальный вагон:");
        System.out.println("Количество нижних мест: " + lower + ", цена: " + lowerPrice + " рублей");
        System.out.println("Количество верхних мест: " + upper + ", цена: " + upperPrice + " рублей");
        System.out.println("Количество нижних боковых мест: " + lowerSide + ", цена: " + lowerSidePrice + " рублей");
        System.out.println("Количество верхних боковых мест: " + upperSide + ", цена: " + upperSidePrice + " рублей");
        sleepingIncome = lower * lowerPrice + upper * upperPrice + lowerSide * lowerSidePrice + upperSide * upperSidePrice;
        System.out.println("Доход от эксплуатации вагона: " + sleepingIncome + " рублей");
        System.out.println();
        return sleepingIncome;
    }
}
