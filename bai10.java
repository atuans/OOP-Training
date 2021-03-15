/*
 * Một khách sạn X cần quản lý các hóa đơn của khách hàng thuê phòng. Hóa đơn có 2 loại: hóa đơn theo giờ, hóa đơn theo ngày . 
 * Thông tin chung của chi tiết hóa đơn là: Mã hóa đơn, ngày hóa đơn (ngày, tháng, năm), Tên khách hàng, mã phòng, đơn giá. 
 * Thông tin riêng của từng loại hóa đơn gồm:
 Hóa đơn theo giờ còn có số giờ thuê. Thành tiền = số giờ thuê * đơn giá. Nếu trường hợp số giờ > 24 tiếng và < 30 tiếng thì cũng chỉ tính 24 giờ.
 Nếu trường hợp số giờ là > 30 tiếng thì không dùng loại hóa đơn theo giờ.
 Hóa đơn theo ngày sẽ có số ngày thuê. Thành tiền = số ngày thuê * đơn giá. Nếu số ngày >7 thì giảm 20% đơn giá cho những ngày còn lại.
Thực hiện các yêu cầu sau:
 Xây dựng các lớp với chức năng thừa kế.
 Nhập xuất danh sách các hóa đơn thuê phòng.
 Tính tổng số lượng cho từng loại thuê phòng.
 Tính trung bình thành tiền của hóa đơn thuê phòng trong tháng 9/2013.

 */
package thuchanhoop;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class receipt{
	protected String receiptid;
	protected int day;
	protected String name;
	protected String roomid;
	protected  int cost;
	public receipt() {
		super();
		this.receiptid = "";
		this.day=0;
		this.name="";
		this.roomid="";
		this.cost=0;
		
	}
	public receipt(String receiptid, int day, String name, String roomid, int cost) {
		this.receiptid=receiptid;
		this.day = day;
		this.name = name;
		this.roomid = roomid;
		this.cost= cost;
		
	}
	public String getReceiptid() {
		return receiptid;
	}
	public void setReceiptid(String receiptid) {
		this.receiptid = receiptid;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString() {
		return "Receipt ID: "+ getReceiptid()+"Day Rent: "+ getDay()+" Customer name: "+ getName() +"Room id: "+ getRoomid() + "Cost:" + getCost(); 
	}
	
}
class byhour extends receipt{
	private int renthour;

	public byhour() {
		super();
		this.renthour= 0;
	
		
	}
	public byhour(String receiptid, int day, String name, String roomid, int cost,int  renthour) {
		super(receiptid, day, name, roomid, cost);
		this.renthour=renthour;
		
		
	}
	public int getRenthour() {
		return renthour;
	}
	public void setRenthour(int renthour) {
		this.renthour = renthour;
	}
	
	
	public int payment() {		//Thành tiền = số giờ thuê * đơn giá. Nếu trường hợp số giờ > 24 tiếng và < 30 tiếng thì cũng chỉ tính 24 giờ.
								// Nếu trường hợp số giờ là > 30 tiếng thì không dùng loại hóa đơn theo giờ.
		if (getRenthour() >=24 && getRenthour() <30) {
			return  this.renthour * getCost();
		}
		else {
			return  0;
		}
	}
	public String toString() {
		super.toString();
		return "Rent Hour: " +getRenthour();
		
	}
}
class byday extends receipt{
	private int dayuse;
	
	public byday() {
		super();
		this.dayuse=0;
		
		
		
	}
	public byday(String receiptid, int day, String name, String roomid, int cost, int dayuse) {
		super(receiptid, day,name,roomid,cost);
		this.dayuse=dayuse;
		
	}
	public int getDayuse() {
		return dayuse;
	}
	public void setDayuse(int dayuse) {
		this.dayuse = dayuse;
	}
	
	
	public int payment() { //Thành tiền = số ngày thuê * đơn giá. Nếu số ngày >7 thì giảm 20% đơn giá cho những ngày còn lại
		if (getDayuse()>7) {
			return (this.dayuse* this.cost)/2;
		}
		else {
			return 0;
		}
	}
	public String toString() {
		super.toString();
		return "Day Rent: " +getDayuse();
	}
}
class manageS{
	private List<receipt> Receipt;
	public manageS() {
		this.Receipt=new ArrayList<>();
	}
	public void addcustomer(receipt re) {
		this.Receipt.add(re);
	}
	public void showinfo() {
		 this.Receipt.forEach(r -> System.out.println(r.toString()));

	}
	
}
public class bai10 {
	public static void main(String []args) {
		Scanner sc= new Scanner (System.in);
		manageS m =new manageS();
		while(true) {
			System.out.println("Rent In My Hotel");
			System.out.println("Click 1 to add a receipt:");
			System.out.println("Click 2 to show your bill information:");
			String r =sc.nextLine();
			switch(r) {
			case "1":{
				System.out.println("Enter your name:");
				String name=sc.nextLine();
				System.out.println("Enter number of day you rent:");
				int day=sc.nextInt();
				System.out.println("Enter receipt id:");
				String receiptid =sc.nextLine();
				sc.nextLine();
				System.out.println("Enter room id:");
				String roomid =sc.nextLine();
				System.out.println("Enter cost:");
				int cost =sc.nextInt();
				System.out.println("Rent by day or by hour ?, Please press 1 or 2");
				String temp=sc.nextLine();
				if(temp=="1") {
					System.out.println("Enter the hour you rented :");
					int renthour =sc.nextInt();
					receipt receiptbyhour = new byhour (receiptid, day,name, roomid, cost, renthour);
					m.addcustomer(receiptbyhour);
					System.out.println(receiptbyhour.toString());
					break;
				}
				if(temp=="2") {
					System.out.println("enter number of day you rented");
					int dayuse =sc.nextInt();
					receipt receiptbyday = new byday(receiptid, day,  name, roomid,cost, dayuse);
					m.addcustomer(receiptbyday);
					System.out.println(receiptbyday.toString());
					sc.nextLine();
					break;
				}
				break;
			}
			case "2":
			{
				m.showinfo();
			}

			}
				
		}
	}

}
