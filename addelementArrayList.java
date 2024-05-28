import java.util.ArrayList;

public class addelementArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(7);
        System.out.println(list);
        // get element
        int ele=list.get(4);
        System.out.println("the elemet is="+ ele);
        // delete element
        int In=list.remove(5);
        System.out.println("THE REMOVED ELEMENT IS ="+In);
        // set element
        list.set(4,6);
        System.out.println(list);
        System.out.println(list.contains(8));
        System.out.println(list.contains(17));


    }
    
}
