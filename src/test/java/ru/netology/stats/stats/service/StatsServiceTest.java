package ru.netology.stats.stats.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    private final long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма всех продаж");
        System.out.println("Ожидание "+ expected + " Актуальность " + actual);

//        System.out.println("Кол-во ячеек в массиве " + sales.length);
//        long cells = sales.length;
//        System.out.println("Кол-во ячеек " + cells);
//
//        long average = actual / cells;
//        System.out.println("Среднее " + average);
    }

    @Test
    void  testAverage() {
        StatsService service = new StatsService();
        double expected = 15;
        double actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж");
        System.out.println("Ожидание "+ expected + " Актуальность " + actual);

    }

    @Test
    void testMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("В каком месяце макс сумма продаж.");
        System.out.println("Ожидание " + expected + ", Актуальность " + actual);
    }


    @Test
    void  testMinSales() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

        System.out.println("В каком месяце мин. сумма продаж.");
        System.out.println("Ожидание " + expected + ", Актуальность " + actual);
    }

    @Test
    void testnumberofMonthsofSalesBelowAverage() {
        StatsService service = new StatsService();
        double expected = 5;
        double actual = service.numberofMonthsofSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("кол-во месяцев, в которых продажи были ниже среднего");
        System.out.println("Ожидание " + expected + ", Актуальность " + actual);
    }

    @Test
    void testnumberofMonthsofSalesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberofMonthsofSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("кол-во месяцев, в которых продажи были выше среднего");
        System.out.println("Ожидание " + expected + ", Актуальность " + actual);
    }



}
