package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();

    @Test
        // сумма всех продаж
    void calcSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        long actual = service.calcSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
        // средняя сумма продаж в месяц
    void calcAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        long actual = service.calcAvg(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
        // пик продаж
    void maxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
        // спад продаж
    void minSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
        // кол-во месяцев с продажами ниже среднего
    void salesBelowAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.salesBelowAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
        // кол-во месяцев с продажами выше среднего
    void salesAboveAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        long actual = service.salesAboveAvg(sales);

        assertEquals(expected, actual);
    }

}