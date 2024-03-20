public class Factor {
    public static void main(String[] args) {
        int n =36;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    System.out.println(i+" "+n/i);
                }
                else{
                    System.out.println(i);
                }
            }
        }

    }
}
    
