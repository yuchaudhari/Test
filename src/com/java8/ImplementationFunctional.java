package com.java8;

public class ImplementationFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//u can not add parameter in that bracket
		
		Runnable run = () ->  
			System.out.println("Thread");
			System.out.println("Bye");
			
			/* you can also write like this
			Runnable run = () -> { 
				System.out.println("Thread");
				};
			*/
			
			Thread t = new Thread(run);
			 t.start();
	}

}
