import java.util.Arrays;

public class stockProblem {
     public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            span[i] = 1;
            int j = i - 1;

            while (j >= 0 && prices[j] <= prices[i]) {
                span[i] += span[j];
                j -= span[j];
            }
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] stockSpans = calculateSpan(prices);
        System.out.println("The stock spans are: " + Arrays.toString(stockSpans));
    }
}
