//Given a positive integer N, print count numbr of 1 bits in it. 

import java.util.*;
public class Numberofonebits {
    public static int  Number(int N){
        int count=0;
        while(N!=0){
            if((N & 1)!=0){
            count=count+1;
        }
        N>>=1;
    }
    return count; 
}
    public static void main(String aargs[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a no to check the no contans how many 1 bits:");
      int N=sc.nextInt();
      System.out.print(Number(N));

      sc.close();
    }
    
}
