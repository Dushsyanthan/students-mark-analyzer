package studentMark;
import java.util.Scanner;

public class StudentsMarkUI extends ViewAnalyzeReport {
	 
	static Scanner inp=new Scanner(System.in);
	public static void main(String[] args) {
		new StudentsMarkUI().starter();
		System.out.println("Thank You For Using.");
	}
	
	public void starter() {
		while(true) {
			System.out.println("=".repeat(120));
			System.out.println("1.Add Student Details & Marks");
			System.out.println("2.Report of All the Students");
			System.out.println("3.Topper of the Class");
			System.out.println("4.Exit");
			System.out.println("=".repeat(120));
			String n=inp.nextLine();
			switch(n) {
			case "1" :{addStudent();break;}
			case "2" :{showReport();break;}
			case "3" :{showTopper();break;}
			case "4" :{return;}
			default:{
				System.out.println("Enter Valid Numeric Values Only");
			}
			}
		}
	}
}
