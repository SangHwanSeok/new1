package io;

import java.util.Scanner;

class InputDemo{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
        	System.out.println(sc.nextInt());
        }
        sc.close();	
    }
}