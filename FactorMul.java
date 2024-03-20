public class FactorMul{
    public static void main(String[] args) {
        int n = 18;
        int result = 1;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                result *= i;
                if (i != n / i) {
                    result *= n / i;
                }
            }
        }
        System.out.println(result);
    }
}
