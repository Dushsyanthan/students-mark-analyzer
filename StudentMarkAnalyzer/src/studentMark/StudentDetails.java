package studentMark;

public class StudentDetails {
	
	String name;
	int rollNo;
	int tamil;
	int english;
	int maths;
	char grade;
	int total;
	
	@Override
	public String toString() {
		System.out.println("The Topper of the Class is : "+this.name);
		System.out.println("Student Total Mark is : "+this.total);
		return "";
	}
	
	static StudentDetails s1=new StudentDetails();
	static StudentDetails s2=new StudentDetails();
	static StudentDetails s3=new StudentDetails();
	static StudentDetails s4=new StudentDetails();
	static StudentDetails s5=new StudentDetails();
	static StudentDetails s6=new StudentDetails();
	static StudentDetails s7=new StudentDetails();
	static StudentDetails s8=new StudentDetails();
	static StudentDetails s9=new StudentDetails();
	static StudentDetails s10=new StudentDetails();
	
	StudentDetails[] sList={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
	

}
