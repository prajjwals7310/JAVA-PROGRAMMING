import java.util.Scanner;
public class Printinc {

    
        public static void Pinc(int n){
            if(n==1){
                System.out.print(n+ " ");
                return ;
            }
            Pinc(n-1);
            System.out.print(n+ " ");
           
    
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("The no is =" );
            int n = sc.nextInt();
            Pinc(n);
            sc.close();
        }
    
    }
    

