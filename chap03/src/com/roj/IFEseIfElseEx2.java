package com.roj;

import java.util.Scanner;

public class IFEseIfElseEx2 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("점수");
    	int score = scan.nextInt();
    	int grade = score/10;
    	
    	//case 10
    	switch(grade) {
    	    case 10:
    		case 9:
    			
    			System.out.println("A");
    			break;
    			
    		case 8:
    			
    			System.out.println("B");
    			break;
    			
    		case 7:
    			
    			System.out.println("C");
    			break;	
    			
    		default :	
    			
    			System.out.println("D");
    			break;
    	}
    	
    	
    }
}

