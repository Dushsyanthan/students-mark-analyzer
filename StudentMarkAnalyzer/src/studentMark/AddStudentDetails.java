package studentMark;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddStudentDetails extends StudentDetails {
	
	static int sCount=0;
	static Scanner inp=new Scanner(System.in);
	public void addStudent() {
		try {
			System.out.print("Enter Student Name : ");
			String uName=inp.nextLine();
			if(nameChecker(uName)==1) {
				throw new StudentNameAlreadyExists("Entered Name Already Exists\nTry Agian");
			}
			sList[sCount].name=uName;
			System.out.print("Enter Student Roll No : ");
			int uRollNo=inp.nextInt();
			if(rollNoChecker(uRollNo)==1) {
				throw new StudentNameAlreadyExists("Entered Roll No Already Exists\nTry Agian");
			}
			sList[sCount].rollNo=uRollNo;
			System.out.print("Enter Student Tamil Mark : ");
			int uTamil=inp.nextInt();
			if(uTamil>100 && uTamil>=0) {
				throw new InvalidMarkException("Mark Should Be Below or Equal to 100 ");
			}
			sList[sCount].tamil=uTamil;
			System.out.print("Enter Student English Mark : ");
			int uEnglish=inp.nextInt();
			if(uEnglish>100 && uEnglish>=0) {
				throw new InvalidMarkException("Mark Should Be Below or Equal to 100 ");
			}
			sList[sCount].english=uEnglish;
			System.out.print("Enter Student Maths Mark : ");
			int uMaths=inp.nextInt();
			if(uMaths>100 && uMaths>=0) {
				throw new InvalidMarkException("Mark Should Be Below or Equal to 100 ");
			}
			sList[sCount].maths=uMaths;
			sList[sCount].total=sList[sCount].tamil+sList[sCount].english+sList[sCount].maths;
			gradeCalc();
			sCount++;
			inp.nextLine();		
		}
		catch(InputMismatchException e){
			System.out.println("Enter Only Numeric Values ");
			inp.nextLine();
			resetter();
			addStudent();
		}
		catch(StudentNameAlreadyExists e){
			System.err.println(e.getMessage());
			resetter();
			addStudent();
		}
		catch(RollNoNameAlreadyExists e){
			System.err.println(e.getMessage());
			inp.nextLine();
			resetter();
			addStudent();
		}
		catch(InvalidMarkException e) {
			System.err.println(e.getMessage());
			inp.nextLine();
			resetter();
			addStudent();
		}
	}
	public void resetter() {
		sList[sCount].name=null;
		sList[sCount].rollNo=0;
		sList[sCount].tamil=0;
		sList[sCount].english=0;
		sList[sCount].maths=0;
		sList[sCount].grade=' ';
	}
	
	public int rollNoChecker(int n) {
		for(int i=0;i<sList.length;i++) {
			if(sList[i].rollNo==n) {
				return 1;
			}
		}
		return 0;
	}
	public int nameChecker(String n) {
		
		for(int i=0;i<sList.length;i++) {
			if(sList[i].name!=null) {
			if(sList[i].name.toLowerCase().equals(n.toLowerCase())) {
				return 1;
			}
		}}
		return 0;
	}

	public void gradeCalc() {
		int avg=sList[sCount].total/3;
		if(avg>=90) {
			sList[sCount].grade='a';
		}
		else if(avg>=70) {
			sList[sCount].grade='b';
		}
		else if(avg>=50 ) {
			sList[sCount].grade='c';
		}
		else if(avg>=35) {
			sList[sCount].grade='d';
		}
		else if(avg<35) {
			sList[sCount].grade='f';
		}
	}

}
