package pbl2;

public class Student extends Human {
	public String student_num;// 학번
	public String student_subject;// 듣는 교과목
	public String student_subgrade;// 듣는 교과목성적
	
	public Student(){}
	public Student(String name,String email,String phonenum,String major,String money,String student_num,String student_subject,String student_subgrade){
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.major = major;
		this.money = money; 
		this.student_num= student_num;
		this.student_subject = student_subject;
		this.student_subgrade = student_subgrade;
	}
}