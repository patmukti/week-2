/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author mukti
 */
public class Assignment2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;       
        DataInputStream in=new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of items:");
        int number=sc.nextInt();
        Inventory[] item=new Inventory[number];
        for(int i=0;i<item.length;i++){
            item[i]=new Inventory();
        }
        try{
            int j=1;
            while(j<=item.length){
                System.out.println("Enter item name:"+(j));
                s=in.readLine();
                item[j-1].item_name=s;
                System.out.println("Enter Quantity of item:"+(j));
                s=in.readLine();
                item[j-1].item_quantity=Integer.valueOf(s);
                System.out.println("Enter unit price of item:"+(j));
                s=in.readLine();
                item[j-1].unit_price=Integer.valueOf(s);
                
                
                j++;
               
                
            }
        }
        catch(IOException e){
            System.out.println("Error");
            System.exit(1);            
        }
        System.out.println("Item Name\tQuantity\tUnit Price\tTotal Price");
        System.out.println("-----------------------------------------------------");
        for(int i=0;i<number;i++){
            item[i].display();  
        System.out.println("Final Total"+item[i].final_total);
        }
    }
    
}
