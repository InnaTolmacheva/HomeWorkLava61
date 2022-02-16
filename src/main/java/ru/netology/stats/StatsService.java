package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public int calcAvg(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    // пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // спад продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // продажи ниже среднего
    public int salesBelowAvg(long[] sales) {
        int month = 0;
        int belowAvg = 0;
        for (long sale : sales) {
            if (sale < calcAvg(sales)) {
                belowAvg = belowAvg + 1;
            }
            month = month + 1;
        }
        return belowAvg;
    }

    // продажи выше среднего
    public int salesAboveAvg(long[] sales) {
        int month = 0;
        int aboveAvg = 0;
        for (long sale : sales) {
            if (sale >= calcSum(sales) / sales.length) {
                aboveAvg = aboveAvg + 1;
            }
            month = month + 1;
        }
        return aboveAvg;
    }
}