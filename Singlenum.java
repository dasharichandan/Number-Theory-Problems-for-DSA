//Single Number
/*
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
*/
import java.util.Scanner;

public class Singlenum {
    
    public static int single(int[] num) {
        int xor = 0;
        for (int i=0;i<num.length;i++) {
            xor = xor^num[i];
        }
        return xor;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(single(num));
        sc.close();
    }
}
