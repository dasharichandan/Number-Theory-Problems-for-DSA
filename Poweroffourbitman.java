import java.util.*;
public class Poweroffourbitman {
    public boolean Power_of_four(int n){
        if(n<=0){
            return false;
        }
        if((n & (n-1))==0 && (n%3)==1){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Poweroffourbitman obj = new Poweroffourbitman();
        if(obj.Power_of_four(n)){
            System.out.print("The number is power of 4");
        }
        else{
            System.out.print("The number is not power of 4");
        }
        sc.close();

    }
    
}
