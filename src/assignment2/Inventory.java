/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author mukti
 */
public class Inventory {
   String item_name;
   int item_quantity;
   int unit_price;
   int total;
   int final_total=0;
   
   
   void display(){
       total=item_quantity*unit_price;
       final_total=total+final_total;
       System.out.format("%-10s%10d%16d%16d\n",item_name,item_quantity,unit_price,total);
        }
   
}
