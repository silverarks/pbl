
package pbl2;

public class Employee extends Human{
	public String empoly_subphone;//���
	public String empoly_rank;//����
	public String empoly_day;//�Ի���
	public Employee(){}
	public Employee(String name,String email,String phonenum,String major,String money,String empoly_subphone,String empoly_rank,String empoly_day){
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.major = major;
		this.money = money;
		this.empoly_subphone = empoly_subphone;
		this.empoly_rank =empoly_rank;
		this.empoly_day = empoly_day;
	}
}