 import java.util.ArrayList;
 public class maxelement_arraylist {
  public static void main(String args[]){
    ArrayList <Integer> list=new ArrayList<>();
    int i;
    list.add(4);
    list.add(8);
    list.add(16);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(10);
    list.add(14);
    System.out.println("The Array is:" );
    System.out.print("[" +" ");
    for( i=0;i<list.size()-1;i++){
      System.out.print(  list.get(i)+" ");
      
    }
    System.out.print("]");
    
    System.out.println();
    int max=Integer.MIN_VALUE;
    for( i=0;i<list.size();i++){
        if(max<list.get(i)){
            max=list.get(i);

    
        }
    }
    System.out.println("max element is : " + max);
  

  }

}