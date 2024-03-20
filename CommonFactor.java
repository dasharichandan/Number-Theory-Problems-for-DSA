import java.util.*;
public class CommonFactor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                //System.out.println(i);
                count +=i;
                
            }
        }
        System.out.print(count);
        sc.close();
        
    }
}
