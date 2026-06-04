package ru.netology.stats.stats.service;

public class StatsService {
    public long sum(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total;
    }
    public double average(long[] sales) {
        double monthlyAverage = sum(sales) / sales.length;
        return monthlyAverage;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++ ) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++ ) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberofMonthsofSalesBelowAverage(long[] sales) {
        double avg = average(sales);
        int cont = 0;
        for (int i = 0; i < sales.length; i++ ) {
            if (sales[i] < avg){
                cont ++;
            }
        }return cont;
    }

    public int numberofMonthsofSalesAboveAverage(long[] sales) {
        double above = average(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > above ) {
                count ++;
            }
        }return count;

    }

}
