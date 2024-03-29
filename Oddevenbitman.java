import java.util.*;
public class Oddevenbitman {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.close();
    EvenOdd(a);
}
 public static void EvenOdd(int a){
    if((a & 1)==0){
        System.out.print("Even");
    }  
    else{
        System.out.print("Odd");
    }

 }
}
