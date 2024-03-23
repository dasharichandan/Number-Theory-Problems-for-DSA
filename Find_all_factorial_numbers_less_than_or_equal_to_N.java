// Input: N = 3
// Output: 1 2
// Explanation: The first factorial number is 
// 1 which is less than equal to N. The second 
// number is 2 which is less than equal to N,
// but the third factorial number is 6 which 
// is greater than N. So we print only 1 and 2.    
import java.util.ArrayList;
import java.util.*;
class Find_all_factorial_numbers_less_than_or_equal_to_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(factorialNumbers(N));
        sc.close();
    }
        static ArrayList<Long> factorialNumbers(long N) {
            ArrayList<Long> result = new ArrayList<>();
            long fact = 1;
            int n = 1;
            while (fact <= N) {
                result.add(fact);
                n = n + 1;
                fact = fact * n;
            }
            return result;
        }
    }


        