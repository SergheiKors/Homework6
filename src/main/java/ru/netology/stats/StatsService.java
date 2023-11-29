package ru.netology.stats;


public class StatsService {

    public long sumSales (long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;

    }

    public long middleSales (long[] sales) {
        return sumSales(sales) / sales.length;
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowMiddle(long[] sales) {
        int count = 0;
        long middleSales =  middleSales(sales);

        for (long sale : sales) {
            if (sale < middleSales(sales)) { // если месячная продажа меньше средней продажи, то
                count++; // увеличиваем счет
            }
        }

        return count; // вывод количества месяцев ниже среднего
    }

    public int overMiddle(long[] sales) {
        int count = 0;
        long middleSales =  middleSales(sales);

        for (long sale : sales) {
            if (sale > middleSales(sales)) { // если месячная продажа больше средней продажи, то
                count++; // увеличиваем счет
            }
        }

        return count; // вывод количества месяцев выше среднего
    }


}
