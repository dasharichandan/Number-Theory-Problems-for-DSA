//Given a number N. Calculate the product of all factors of N. 
//Since Answer can be very large,compute the answer modulo 109+7.

import java.util.*;
class Productoffactorsofnumber {
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long mod=1000000007;
        long result=1;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(i != N/i){
                      result=(result*i*(N/i)%mod);
                }
                else{
                    result=(result*i)%mod;
                }
            }
            
        }
        System.out.println(result);
        sc.close();
    }


}