//import java.util.*;

public class exe4 {
    public static void main(String[] args) {
        // Sales data for the last 7 days
        int[] days =    {1, 2, 3, 4, 5, 6, 7};
        double[] sales = {100, 120, 150, 170, 200, 220, 250};

        int n = days.length;

        // Calculate averages
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += days[i];
            sumY += sales[i];
            sumXY += days[i] * sales[i];
            sumX2 += days[i] * days[i];
        }

        // Calculate slope (m) and intercept (c)
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double c = (sumY - m * sumX) / n;

        // Predict sales for next day (day 8)
        int nextDay = 8;
        double forecast = m * nextDay + c;

        System.out.printf("Predicted sales for Day %d: ₹%.2f\n", nextDay, forecast);
    }
}
