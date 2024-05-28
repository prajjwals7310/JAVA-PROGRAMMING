import java.util.*;
public class Factorial {
    public static int fac(int n){
        if (n==0){
            return 1;
        }
         int f1=fac(n-1);
         int fn= n* f1;
         return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the no is"+ " " );
        int n=sc.nextInt();
        System.out.println(fac(n));
        sc.close();



    }
}
