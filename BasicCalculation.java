package javaproject;

import java.util.Scanner;

public class BasicCalculation {

	public static void main(String[] args) {
		
		int num1,num2,operator;
		System.out.println("1.Addition");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		
		System.out.println("Choose Operator: ");
	    Scanner sc = new Scanner(System.in);
	    operator = sc.nextInt();
	    System.out.println("Enter first number: ");
	    num1 = sc.nextInt();
	    System.out.println("Enter second number: ");
	    num2 = sc.nextInt();
	    
	    int result = 0;
	    switch(operator) {
	    case 1:
	    	result = num1+num2;
	    	break;
	    case 2:
	    	result = num1-num2;
	    	break;
	    case 3:
	    	result = num1*num2;
	    	break;
	    case 4:
	    	result = num1/num2;
	    	break;
	    	
	    	default:
	    		System.out.println("Entered operator is not valid");
	    }
	    
	    System.out.println("Result is: " + result);
		
		
	}

}
