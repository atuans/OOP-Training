package thuchanhoop;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


class candidate{
	protected String sbd;
	protected String name;
	protected String address;
	protected String prioritize;
	public candidate (String sbd, String name, String address, String prioritize) {
		this.sbd=sbd;
		this.name=name;
		this.address=address;
		this.prioritize=prioritize;
		
	}
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrioritize() {
		return prioritize;
	}
	public void setPrioritize(String prioritize) {
		this.prioritize = prioritize;
	}
	
}
class khoiA extends candidate {
	public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

	public khoiA(String sbd, String name,String address, String prioritize) {
		super(sbd,name,address, prioritize);
		
	}
	
	public String toString() {
		return "Candidate group A: " + "SBD: "+ sbd + "Name: "+ name+ "Address: "+ address+ "Prioritize level: "+ prioritize+ 
				"Subject attend:"+ MON_TOAN + "," + MON_LY + "," +MON_HOA;
	}
}
class khoiB extends candidate{
	public static final String MON_TOAN = "Toan";
    public static final String MON_SINH = "SINH";
    public static final String MON_HOA = "Hoa";

	public khoiB(String sbd, String name,String address, String prioritize) {
		super(sbd,name,address,prioritize);
		
		
		
		
	}
	
	public String toString() {
		return "Candidate group B: " + "SBD: "+ sbd + "Name: "+ name+ "Address: "+ address+ "Prioritize level: "+ prioritize+ 
				"Subject attend:"+ MON_TOAN + "," + MON_SINH + "," +MON_HOA;
	}
	
}
class khoiC extends candidate{
	public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

	public khoiC(String sbd, String name,String address, String prioritize) {
		super(sbd,name,address,prioritize);
		
		
	}
	
	public String toString() {
		return "Candidate group C: " + "SBD: "+ sbd + "Name: "+ name+ "Address: "+ address+ "Prioritize level: "+ prioritize+ 
				"Subject attend:"+ MON_VAN + "," + MON_SU + "," + MON_DIA;
	}
}
class TuyenSinh{
	private List<candidate> tuyensinh;
	public TuyenSinh() {
		this.tuyensinh=new ArrayList<>();
		
	}
	//them thi sinh
	public void addcandidate( candidate thisinh) {
		this.tuyensinh.add(thisinh);
	}
	public void showinfo() {
		this.tuyensinh.forEach(thisinh-> System.out.println(thisinh.toString()));
		
	}
	public List<candidate> searchbysbd (String sbd) {
		return this.tuyensinh.stream().filter ( thisinh-> thisinh.getSbd().contains(sbd)).collect(Collectors.toList());
		
	}
	
	
	
}


public class bai3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		TuyenSinh ts =new TuyenSinh();
		while (true) {
			System.out.println("Welcome to my program");
			System.out.println("Press 1 to add student: ");
			System.out.println("Press 2 to show info of student:");
			System.out.println("Press 3 to search based on sbd :");
			System.out.println("Press 4 to exit:");
			String st = sc.nextLine();
			switch( st) {
			case "1":{
				System.out.println("Enter a to insert student group A:");
				System.out.println("Enter b to insert student group B:");
				System.out.println("Enter c to insert student group C:");
				String gr = sc.nextLine();
				switch (gr) {
				case "a":{
					System.out.println("Enter sbd:");
					String sbd=sc.nextLine();
					System.out.println("Enter name:");
					String name =sc.nextLine();
					System.out.println("Enter address:");
					String address = sc.nextLine();
					System.out.println("Enter your prioritize:");
					String prioritize =sc.nextLine();
					candidate groupA = new khoiA(sbd,name, address, prioritize);
					ts.addcandidate(groupA);
					System.out.println(groupA.toString());
					sc.nextLine();
					break;
				}
				case "b":
				{
					System.out.println("Enter sbd:");
					String sbd=sc.nextLine();
					System.out.println("Enter name:");
					String name =sc.nextLine();
					System.out.println("Enter address:");
					String address = sc.nextLine();
					System.out.println("Enter your prioritize:");
					String prioritize =sc.nextLine();
					candidate groupB = new khoiB(sbd,name, address, prioritize);
					ts.addcandidate(groupB);
					System.out.println(groupB.toString());
					sc.nextLine();
					break;
					
				}
				case "c":
				{
					System.out.println("Enter sbd:");
					String sbd=sc.nextLine();
					System.out.println("Enter name:");
					String name =sc.nextLine();
					System.out.println("Enter address:");
					String address = sc.nextLine();
					System.out.println("Enter your prioritize:");
					String prioritize =sc.nextLine();
					candidate groupC = new khoiC(sbd,name, address, prioritize);
					ts.addcandidate(groupC);
					System.out.println(groupC.toString());
					sc.nextLine();
					break;
					
				}
				
				


				}


			}
			case "2":
			{
				ts.showinfo();
			}
			case "3":{
				System.out.println("Enter student sbd:");
				String id =sc.nextLine();
				ts.searchbysbd(id).forEach(o -> {
					o.toString();
				});
				if (id == null) {
                    System.out.println("Not found");
                } else {
                    System.out.println(id.toString());
                }
				break;
			}
			case "4":
				return ;
				default:
				{
					System.out.println("Invalid");
					
				}




		}
		
	}
}
}
/*
 
 
 Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: 
 Số báo danh, họ tên, địa chỉ, mức ưu tiên.

Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.

Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.

Thí sinh thi khối C thi các môn: Văn, Sử, Địa.

Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.

Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:

    Thêm mới thí sinh.
    Hiện thị thông tin của thí sinh và khối thi của thí sinh.
    Tìm kiếm theo số báo danh.
    Thoát khỏi chương trình.

 */
