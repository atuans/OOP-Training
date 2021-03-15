package thuchanhoop;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;
/*
 * Để quản lý biên lai thu tiền điện, người ta cần các thông tin sau:

    Với mỗi biên lai: Thông tin về hộ sử dụng điện, chỉ số điện cũ, chỉ số mới, số tiền phải trả.
    Các thông tin riêng của từng hộ gia đình sử dụng điện: Họ tên chủ hộ, số nhà, mã số công tơ điện.

Yêu cầu 1: Hãy xây dựng lớp khachHang để lưu trữu các thông tin riêng của mỗi hộ gia đình.

Yêu cầu 2: Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ dân.

Yêu cầu 3: Xây dựng các phương thức thêm, xoá sửa các thông tin riêng của mỗi hộ sử dụng điện.

Yêu cầu 4: Viết phương thức tính tiền điện cho mỗi hộ gia đình theo công thức: (số mới – số cũ ) * 5.
 */

class Bill {
	protected String name;
	protected String sonha;
	protected int masocongtodien;	
	protected int oldindex;
	protected int newindex;
	protected int payment;
	public Bill() {
		
		this.oldindex=0;
		this.newindex=0;
		this.payment=0;
		this.name="";
		this.sonha="";
		this.masocongtodien=0;
		
	}
	public Bill(String name, String sonha, int masocongtodien,int oldindex, int newindex) {
		this.name=name;
		this.sonha=sonha;
		this.masocongtodien=masocongtodien;
		this.oldindex=oldindex;
		this.newindex = newindex;
	
	}
	public int getOldindex() {
		return oldindex;
	}
	public void setOldindex(int oldindex) {
		this.oldindex = oldindex;
	}
	public int getNewindex() {
		return newindex;
	}
	public void setNewindex(int newindex) {
		this.newindex = newindex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSonha() {
		return sonha;
	}
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	public int getMasocongtodien() {
		return masocongtodien;
	}
	public void setMasocongtodien(int masocongtodien) {
		this.masocongtodien = masocongtodien;
	}
	
	public String toString() {
		return "Name  of  host: "+ name + "\n"+ "House number: "+ sonha +"\n" + "Electric power index: "+ masocongtodien + "\n" + "Old Index: "+ oldindex +"\n" + "New Index"+ newindex + "\n" + 
	"Total payemnt: "+ payment;
	}
}
class method{
	private List<Bill> Receipt;
	public method() {
		this.Receipt=new ArrayList<>();
		
	}
	public void addinfo(Bill r) {
		this.Receipt.add(r);
	}
	public boolean deleteinfo( String name) {
		Bill r = this.Receipt.stream().filter(re -> re.getName().equals(name)).findFirst().orElse(null);
		if (r == null) {
			return false;
			
		}else {
			this.Receipt.remove(r);
			return true;
		}
	}
	public void editinfo(Bill re) {
		Receipt.replaceAll((UnaryOperator<Bill>)re );
	}
	public int calculate (String name) {//(số mới – số cũ ) * 5.
		Bill r =this.Receipt.stream().filter(re->re.getName().equals(name)).findFirst().orElse(null);
		if (r==null) {
			return 0;
		}
		else {
			return r.getOldindex() * r.getNewindex() *5;
		}
	}
	
}
public class bai12 {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		method manage =new method();
		while(true ) {
			System.out.println("---------------Welcome----------------");
			System.out.println("Press 1 to add your information:");
			System.out.println("Press 2 to delete your information:");
			System.out.println("Press 3 to replace your information:");
			System.out.println("Press 4 to calculate your bill:");
			System.out.println("Press 5 to exit:");

			String m=sc.nextLine();
			switch(m) {
			case"1":
			{
				System.out.println("Enter your name:");
				String name =sc.nextLine();
				System.out.println("Enter your house number:");
				String sonha =sc.nextLine();
				System.out.println("Enter your Electric power index:");
				int masocongtodien =sc.nextInt();
				System.out.println("Enter your old index:");
				int oldindex=sc.nextInt();
				System.out.println("Enter your new index:");
				int newindex =sc.nextInt();
				Bill r = new Bill(name ,sonha,masocongtodien, oldindex, newindex);
				manage.addinfo(r);
				sc.nextLine();
				break;
				
			}
			case "2":
			{
				System.out.println("Enter your name to delete:");
				String del =sc.nextLine();
				System.out.println(manage.deleteinfo(del)? "Success" : "Fail");
				break;
			}
			case "3":
			{
				System.out.println("Enter name you want to replace information");
				String replace=sc.nextLine();
				
				System.out.println("Enter your name:");
				String name =sc.nextLine();
				System.out.println("Enter your house number:");
				String sonha =sc.nextLine();
				System.out.println("Enter your Electric power index:");
				int masocongtodien =sc.nextInt();
				System.out.println("Enter your old index:");
				int oldindex=sc.nextInt();
				System.out.println("Enter your new index:");
				int newindex =sc.nextInt();
//				receipt r = new receipt(name ,sonha,masocongtodien, oldindex, newindex);
//				manage.addinfo(r);
//				sc.nextLine();
//				receipt rnew = new receipt(name ,sonha,masocongtodien, oldindex, newindex);
//				manage.addinfo(rnew);
			}
			case "4":
			{
				System.out.println("Enter name:");
				String name=sc.nextLine();
				System.out.println("Your total payment : " +manage.calculate(name));
				break;
			}
			case "5":
			{
				return ;
			
			}
			default:
			{
				System.out.print("Invalid!");
			}
			}
			
		}
	}
}
