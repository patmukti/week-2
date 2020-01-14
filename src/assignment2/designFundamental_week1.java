/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner;
//import java.lang.*;
/**
 *
 * @author mukti
 */

public class designFundamental_week1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s ;
        System.out.println("Enter your String");
        s=sc.next();
        char[] s1=s.toCharArray();
        int[] size = new int[s.length()];
        for(int i=s1.length-1;i>=0;i--){
            System.out.print(s1[i]);
            }
         
    }
}
