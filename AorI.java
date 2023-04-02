//using instance variable

import java.util.*;

class AorI{
int l=6;
int b=7;
int ar=l*b;
   public static void main(String args[]){
   AorI obj = new AorI();
   obj.ar=obj.l*obj.b;

      System.out.println("Area of rectangle=" +obj.ar);
   }
 }