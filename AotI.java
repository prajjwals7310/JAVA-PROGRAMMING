//using instance variable

import java.util.*;

class AotI{
int b=5;
int h=8;
float ar=(b*h)/2;
   public static void main(String args[]){
   AotI obj = new AotI();
   obj.ar=(obj.b*obj.h)/2;

      System.out.println("Area of traingle=" +obj.ar);
   }
 }