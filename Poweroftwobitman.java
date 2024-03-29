import java.util.*;
public class Poweroftwobitman {
    public boolean Power(int n){
       if(n<=0){
         return false;
       } 
       if((n & (n-1))==0){
        return true;
       }
       return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Poweroftwobitman obj =new Poweroftwobitman();
        if(obj.Power(n)){
              System.out.print("The number is power of 2");
        }
        else{
          System.out.print("The number is not power of 2");
        }

      sc.close();
    }
    
}
