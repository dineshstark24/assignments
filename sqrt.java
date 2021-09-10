package sqr;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();

//calculating square of the number
int sqr;
sqr=num*num;
System.out.println("Square of "+num+" is: "+sqr);

//calculating square root of the number		
float temp, sqrt;
sqrt=num/2;
temp=0;
while (sqrt !=temp) {
	temp=sqrt;
	sqrt=(num/temp+temp)/2;
}
System.out.println("Square root of "+num+" is: "+sqrt);
}


}