import java.util.*;
public class Palindrome{
    static boolean isPlindrome(int n){
        int temp=n;
        int rem=0;
        int rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return temp==rev;
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPlindrome(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}