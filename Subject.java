
package pbl2;

public class Subject {
	public String subname;//과목이름
	public int substunum;//학생수
	public String submajor;//개설학과
	public String subpro;//담당교수
	public Subject(){}
	public Subject(String subname,int substunum,String submajor,String subpro){
		this.subname = subname;
		this.substunum = substunum;
		this.submajor = submajor;
		this.subpro = subpro;
	}
}