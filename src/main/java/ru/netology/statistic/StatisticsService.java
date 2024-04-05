package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0]; //текущий максимум = значению 1ой ячейки массива
        for (long income : incomes) {   // переменная ПОСТУПЛЕНИЕ принимает новое значение из массива
            if (currentMax < income) {  // если текущий максим. меньше поступления,
                currentMax = income;    // текущий макс. равен поступлению
            }
        }
        return currentMax;
    }
}