
public class Arraylinear{
    public static int LinearSearch(int ar[], int key){
        for (int i=0; i<ar.length; i++){
            if(ar[i] == key){
                return i;
            }


        }
        return -1;
    }

public static void main(String args[]){
    int ar[] = {2,4,6,10,7,9,11};
    int key = 15;

    int index = LinearSearch(ar,key);
    if(index == -1)
{
     System.out.println("Not Found");
}
 else{
    System.out.println("key is at index : " + index);
 }
} 
}