
//What to do when we want to use variables from calling method
//When block of code we passed to run method has multiple parameters 

interface Executable{
	 int execute(int a, int b);  // -modify interface from using lambda code  
}					             // so execute() has two parameters

//If method expects a return value 


/*interface StringExecutable{
	int execute(String a);
}*/


class Runner{
	
	public void run(Executable e){// will supply parameters to block of code if there are any
		System.out.println("Executing code block...");
		int value = e.execute(12, 13); //modify value so run method supplies 2 values
		System.out.println("Return Value is: " + value );
	}
	
	
/*	//Runner method from interface String Executable
	
	public void run(StringExecutable e){
		System.out.println("Executing code block...");
		int value = e.execute("Hello");
		System.out.println("Return Value is: " + value );
	}*/
	
	
	
}



public class App {
 
	public static void main(String[] args) { //calling method
	
	int c = 100;//effectively final when we don't change it in jdk 8 so no need for final int c =100;
	int d = 77;	
		
	//the old way	
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute(int a, int b) { // now for two int params
				System.out.println("hello there");
				return c + a + b +d;	//return value now can be a+b+c+d with local variable d and c
			}
			
		});
		
		
		System.out.println("=====================");//separator between using diff vers. lambda expressions
		
		//using lambda expression in java 8
		runner.run( (int a,int b) -> { // or just runner.run( (a,b) -> )
								System.out.println("HELLO THERE");
								return a + b + c - d;
								});  //now return value can have a parameter 
		 							 //multiple parameters and local variables c and d
	
	

		
//Because lambda expression is an object you can assign it to whatever
//functional interface you're working with 			
		Executable ex = ( a, b) -> { 
			System.out.println("HELLO THERE");
			return a + b;
			};  
			
		
			runner.run(ex);
			
//If you want to assign to object or superclass of Executable interface
//might need a cast
	
			Object codeBlock = (Executable)( a, b) -> { 
				System.out.println("HELLO THERE!");
				return a + b + c;
				};  
				
				
				
			
	
	}							
	
}


























/*

//When block of code we passed to run method has multiple parameters 

interface Executable{
	 int execute(int a, int b);  // -modify interface from using lambda code  
}					             // so execute() has two parameters

//If method expects a return value 


/*interface StringExecutable{
	int execute(String a);
}*/


/*
class Runner{
	
	public void run(Executable e){// will supply parameters to block of code if there are any
		System.out.println("Executing code block...");
		int value = e.execute(12, 13); //modify value so run method supplies 2 values
		System.out.println("Return Value is: " + value );
	}
	
	
/*	//Runner method from interface String Executable
	
	public void run(StringExecutable e){
		System.out.println("Executing code block...");
		int value = e.execute("Hello");
		System.out.println("Return Value is: " + value );
	}
	
	
	
}



/*public class App {
 
	public static void main(String[] args) {
	
		
	//the old way	
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute(int a, int b) { // now for two int params
				System.out.println("hello there");
				return a + b;	//return value now can be 7 + a
			}
			
		});
		
		
		System.out.println("=====================");//separator between using diff vers. lambda expressions
		
		//using lambda expression in java 8
		runner.run( (int a,int b) -> { // or just runner.run( (a,b) -> )
								System.out.println("HELLO THERE");
								return a + b;
								});  //now return value can have a parameter
		}
	
}*/













/*

//When block of code that we passed to method run has parameters of different types

interface Executable{
	 int execute(int a);  // -modify interface from using lambda code  
}					     //  that returns value ( int exectute();	) to 
					     // one that has parameter( int execute(int a) )

//If method expects a return value 


/*interface StringExecutable{
	int execute(String a);
}*/


/*class Runner{
	
	public void run(Executable e){// will supply parameters to block of code if there are any
		System.out.println("Executing code block...");
		
		
		int value = e.execute(12);// modify value so run method supplies
								  //a value for e.execute(12);
		
		System.out.println("Return Value is: " + value );
	}
	
	
	//Runner method from interface String Executable
	public void run(StringExecutable e){
		System.out.println("Executing code block...");
		int value = e.execute("Hello");
		System.out.println("Return Value is: " + value );
	}
	
	
	
}



public class App {
 
	public static void main(String[] args) {
	
		
	//the old way	
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute(int a) {//need to modify from execute() to execute(int a)
				System.out.println("hello there");
				return 7 + a;	//return value now can be 7 + a
			}
			
		});
		
		
		System.out.println("=====================");//separator between using diff vers. lambda expressions
		
		//using lambda expression in java 8
		runner.run( (int a) -> {
								System.out.println("HELLO THERE");
								return 7 + a;
								});  //now return value can have a parameter
		}
	
}
















//When block of code that we passed to method run has parameters

/*interface Executable{
	 int execute(int a);  // -modify interface from using lambda code  
}					     //  that returns value ( int exectute();	) to 
					     // one that has parameter( int execute(int a) )

//If method expects a return value 

class Runner{
	
	public void run(Executable e){// will supply parameters to block of code if there are any
		System.out.println("Executing code block...");
		
		
		int value = e.execute(12);// modify value so run method supplies
								  //a value for e.execute(12);
		
		System.out.println("Return Value is: " + value );
	}
}



/*method3			runner.run( ()-> {
 					System.out.println("Hello There!");
					System.out.println("this is code passed in a lambda expression.");
					return 8;
		   			});*/


//method4			runner.run( () -> { return 8; });




//method5 			runner.run( () -> 8); 



//change return type for interface runner method public void execute() to int
/*public class App {
 
	public static void main(String[] args) {
	
		
	//the old way	
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute(int a) {//need to modify from execute() to execute(int a)
				System.out.println("hello there");
				return 7 + a;	//return value now can be 7 + a
			}
			
		});
		
		
		System.out.println("=====================");//separator between using diff vers. lambda expressions
		
		//using lambda expression in java 8
		runner.run((int a) -> {
								System.out.println("HELLO THERE");
								return 7 + a;
								});  //now return value can have a parameter
		}
	
}




//Code for using the lambda expression for If method expects a return value 


interface Executable{
	 int execute();     -modify interface from defining lambda code to returning int type 
}


//If method expects a return value 

class Runner{
	
	public void run(Executable e){
		System.out.println("Executing code block...");
		int value = e.execute();// modify execute call to receive int value
		System.out.println("Return Value is: " + value );
	}
}




/*method3			runner.run( ()-> {
 					System.out.println("Hello There!");
					System.out.println("this is code passed in a lambda expression.");
					return 8;
		   			});*/


//method4			runner.run( () -> { return 8; });




//method5 			runner.run( () -> 8); 



//change return type for interface runner method public void execute() to int
/*public class App {
 
	public static void main(String[] args) {
	
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute() {
				System.out.println("hello there");
				return 7;	//return value
			}
			
		});
		
		
		System.out.println("=====================");//separator between using diff vers. lambda expressions
		
		//using lambda expression in java 8
		runner.run( () -> { System.out.println("this is code passed in a lambda expression");
							System.out.println("Hello There!");					
							return 8;
		
							}); 
		
		}
	
}


 
  
  Code for Defining the Lamdba Expression
 

interface Executable{
	 void execute();
}


class Runner{
	public void run(Executable e){
		System.out.println("Executing code block...");
		e.execute();
	
	}
}



//method1  			runner.run(  () -> System.out.println("Hello There!"));

/*method2			runner.run(  ()-> {
					System.out.println("Hello There!");
					System.out.println("this is code passed in a lambda expression.");
					});  multiple blocks to execute*/ 


/*method3			runner.run( ()-> {
 					System.out.println("Hello There!");
					System.out.println("this is code passed in a lambda expression.");
					return 8;
		   			});*/


//method4			runner.run( () -> { return 8; });




//method5 			runner.run( () -> 8); 


/*public class App {
 
	public static void main(String[] args) {
	
	
	//The old way
		
		Runner runner = new Runner();
		runner.run(new Executable(){
			public void execute() {
				System.out.println("hello there");
			}
			
		});
		
		
		System.out.println("=====================");//separator between using lambda expressions
		
		
		//using lambda expressions in java 8
		runner.run( () -> {System.out.println("Hello There!");					
						   System.out.println("this is code passed in a lambda expression");
		
							}); 
		
		}
	
}*/