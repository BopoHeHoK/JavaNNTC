package com.company;

//купейные вагоны
public class CouchetteCars extends Cars{
    double couchetteIncome = 0;
    int lower = 16, upper = 16, lowerSide = 4, upperSide = 4;
    double lowerPrice = 1500, upperPrice = 1000, lowerSidePrice = 700, upperSidePrice = 600;
    @Override
    public double cost(int lower, double lowerPrice, int upper, double upperPrice,
                       int lowerSide, double lowerSidePrice, int upperSide, double upperSidePrice) {
        System.out.println("Купейный вагон:");
        System.out.println("Количество нижних мест: " + lower + ", цена: " + lowerPrice + " рублей");
        System.out.println("Количество верхних мест: " + upper + ", цена: " + upperPrice + " рублей");
        System.out.println("Количество нижних боковых мест: " + lowerSide + ", цена: " + lowerSidePrice + " рублей");
        System.out.println("Количество верхних боковых мест: " + upperSide + ", цена: " + upperSidePrice + " рублей");
        couchetteIncome = lower * lowerPrice + upper * upperPrice + lowerSide * lowerSidePrice + upperSide * upperSidePrice;
        System.out.println("Доход от эксплуатации вагона: " + couchetteIncome + " рублей");
        System.out.println();
        return couchetteIncome;
    }
}

