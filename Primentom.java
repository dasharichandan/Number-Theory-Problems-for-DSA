import java.util.*;

public class Primentom{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m,j,i;
        n=sc.nextInt();
        m=sc.nextInt();
        for( i=n;i<m;i++){
            for( j=2;j<=i;j++){
                if(i%j==0)
                 break;
            }    
            if(i==j)
            {
                System.out.println(j);
            }
        }
        sc.close();
    }
}