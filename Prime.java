import java.util.*;
public class Prime{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter a no. to find prime :");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2)
            System.out.print("Prime no.");
        else
            System.out.println("Not a prime number");

        sc.close();
    }
}