import java.util.Scanner;
import java.util.Scanner;

public class GitProjet 
{

 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name:");
	        String name = sc.nextLine();
	        System.out.println("Enter Sex:");
	        char gender = sc.next().charAt(0);
	        System.out.println("Enter Age:");
	        int age = sc.nextInt();
	        System.out.println("Enter Mob no.:");
	        long mobileNo = sc.nextLong();
	        System.out.println("Enter CGPA:");
	        double cgpa = sc.nextDouble();
	        System.out.println("Your details are as below: ");
	        System.out.println("Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("Age: "+age);
	        System.out.println("Mobile Number: "+mobileNo);
	        System.out.println("CGPA: "+cgpa);
	    }
	}


