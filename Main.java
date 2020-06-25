package com.company.lesson1;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int summEven = 0;
	   Scanner arrSize = new Scanner (System.in);
	   System.out.print("Enter size for array: ");
	   int size = arrSize.nextInt();
	   int[] arrOfNumb = new int[size];
	   System.out.println("Enter array`s numbers: ");
	   for (int i = 0; i < arrOfNumb.length; i++){
	       arrOfNumb[i] = arrSize.nextInt();
	       
	       if (arrOfNumb[i]%2 == 0) {
	           summEven += arrOfNumb[i];
	       }
	   }
	  System.out.println("Array`s numbers (summEven): " + summEven)
	}    
}
