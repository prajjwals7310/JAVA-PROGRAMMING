import java.util.*;
public class staircaseapp {
    public static boolean staircase(matrices[4][4],int key){
        
    }

    }
    
    public static void main(String[] args) {
        int row =3; 
        int columns = 3;
        int matrices[][] =  new int[row][columns];
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                matrices[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrices[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
        



    }
    
}
