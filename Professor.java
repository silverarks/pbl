
package pbl2;

public class Professor extends Human{
	public String profes_subphone;//사번
	public String profes_subject;//강의과목
	public String profes_rank;//직급(조교수,부교수,교수)
	public String profes_day;//입사일   
	public Professor(){}
	public Professor(String name,String email,String phonenum,String major,String money,String profes_subphone,String profes_subject,String profes_rank,String profes_day){
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.major = major;
		this.money = money; 
		this.profes_subphone= profes_subphone;
		this.profes_subject = profes_subject;
		this.profes_rank = profes_rank;
		this.profes_day = profes_day;
	}
}