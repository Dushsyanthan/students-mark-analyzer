package studentMark;

public class ViewAnalyzeReport extends AddStudentDetails {
	


	public void showReport() {
		if(sList[0].name!=null) {
		System.out.println("=".repeat(80));
		System.out.printf("%-15s"," Student Name");
		System.out.printf("%-10s","Roll No");
		System.out.printf("%-10s","Tamil");
		System.out.printf("%-12s","English");
		System.out.printf("%-10s","Maths");
		System.out.printf("%-10s","Total");
		System.out.printf("%-10s","Grade");
		System.out.println("=".repeat(80));
		for(int i=0;i<sList.length;i++) {
			if(sList[i].name!=null) {
				System.out.printf("%-15s"," "+sList[i].name);
				System.out.printf("%-10d",sList[i].rollNo);
				System.out.printf("%-10d",sList[i].tamil);
				System.out.printf("%-12d",sList[i].english);
				System.out.printf("%-10d",sList[i].maths);
				System.out.printf("%-10d",sList[i].total);
				System.out.printf("%-10c",sList[i].grade);
			}
			System.out.println();
		}
		System.out.println("=".repeat(80));
		}
		else {
			System.out.println("No Student Data Added");
		}
	}
	public void showTopper() {
		int top=0;
		for(int i=0;i<sList.length-1;i++) {
			if(sList[i].total<sList[i+1].total) {
				top=i+1;
			}
		}
		System.out.println(sList[top].toString());
	}
}
