
package pbl2;

public class Major {
	public String name;//학과이름 
	public int stunum;//학과학생수
	public String profes;//담당교수
	public String phone;//전화번호
	public Major(){}
	public Major(String name,int stunum,String profes,String phone){
		this.name = name;
		this.stunum = stunum;
		this.profes = profes;
		this.phone = phone;
	}
}