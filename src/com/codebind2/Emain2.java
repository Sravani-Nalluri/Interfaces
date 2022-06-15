package com.codebind2;

enum Level{
	
	LOW,
	  MEDIUM,
	  HIGH
	
}

public class Emain2 {
	
	public static void main(String[] args)
	{
		for(Level obj:Level.values())
		{
			System.out.println(obj);
		}
		/*switch(obj)
		{
		case LOW:	
		System.out.println("Low");
		break;
		case MEDIUM:
		System.out.println("Medium");
		break;
		case HIGH:
			System.out.println("High");
			break;
		
		
		}*/
		
	}

}
