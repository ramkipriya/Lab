package labwork;
import java.util.Scanner;
import java.text.NumberFormat;
public class areaPremeter{

	public static void main(String[] args) {
		System.out.println("Find the Area and Perimeter of the classroom"+  "\n\n\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        	System.out.println("Enter the length ");
        	double len= sc.nextDouble();
        	System.out.println("Enter the Width");
        	double width= sc.nextDouble();
        	double area=len*width;
        	double premeter=2*(len+width);
        	//printing result
            String res = "Area of the rectangle " + area+ "\n"
                    + "Premeter of the rectangle " + premeter + "\n";                  ;
            System.out.println(res);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
		
}
}