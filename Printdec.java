import java.util.Scanner;

public class  Printdec{
    public static void Pdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        Pdec(n-1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("The no is =" );
        int n = sc.nextInt();
        Pdec(n);
        sc.close();
    }

}