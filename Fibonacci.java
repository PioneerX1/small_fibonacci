import java.util.Scanner;

public class Fibonacci {

  // private static long calc_fib(int n) {
  //   if (n <= 1)
  //     return n;
  //
  //   return calc_fib(n - 1) + calc_fib(n - 2);
  // }

  private static long calc_fib(int n) {
    long[] series = new long[n + 1];
    series[0] = 0;
    series[1] = 1;

    // System.out.println("0 - " + series[0]);
    // System.out.println("1 - " + series[1]);

    for (int i = 2; i <= n; i++) {
      series[i] = series[i - 1] + series[i - 2];
      // System.out.println(i + " - " + series[i]);
    }

    return series[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
