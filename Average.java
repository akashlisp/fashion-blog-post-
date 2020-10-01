import java.lang.Integer;
import java.lang.Double;

public class Average{
	public static void main(String args[]) {
		/*1. program for 1st question*/
		if(args.length != 0){
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
		}
		else{
			System.out.println("No arguments");
		}

		/*2. program for 2nd question*/
		if(args.length == 0){
			System.out.println("No arguments");
		}else if(args.length>=2){
			float sum=0;
			for(int i=0;i<args.length;i++){
				sum += Integer.parseInt(args[i]);}
			System.out.println("The average is "+(float)sum/args.length);
		}else{
			System.out.println(args[0]);
		}

		/*3. program for Q3*/
		// product of 2 doubles
		double a,b;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		System.out.println("product of "+a+" and "+b+" is "+a*b);
		

		/*check whether num is odd or even*/
		if(Integer.parseInt(args[0])%2==1){
			System.out.println("its odd");
		}else{
			System.out.println("its even");
		}

		/*area of circle whose radius is given*/
		double pi=3.142857;
		double r=Double.parseDouble(args[0]); 
		System.out.println("area of circle with radius "+args[0]+" is "+pi*r*r);

	}
}
