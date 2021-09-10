

import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


 int intnum;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a integer number: "+"\n");
 intnum = sc.nextInt();
 long longnum = intnum;
 System.out.println("After converting to long: "+longnum);
 System.out.println("Datatype: "+((Object)longnum).getClass().getSimpleName()+"\n");
 float floatnum=longnum;
 System.out.println("After converting to float: "+floatnum);
 System.out.println("Datatype: "+((Object)floatnum).getClass().getSimpleName());

}
} 