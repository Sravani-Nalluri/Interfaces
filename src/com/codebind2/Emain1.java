package com.codebind2;
public class Emain1{ 
int x=20;
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}

		
		  public static void main(String[] args) { 
		    Level myVar = Level.MEDIUM; 
		    System.out.println(myVar); 
		    Emain1 obj=new Emain1();
		    System.out.println(obj.x);
		  } 
		}

