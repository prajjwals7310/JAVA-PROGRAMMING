import java.util.*;
public class Fabonacci{
    public static int fib(int n){
        if(n==0||n==1){
            return n;

        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return (f1+f2);


    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("THE no is=" );
       int n=sc.nextInt();

       System.out.println(fib(n));
       sc.close();
    }
    
}
