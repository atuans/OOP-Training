package thuchanhoop;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
/*
 * Nghành công an cần quản lý các phương tiện giao thông gồm: ô tô, xe máy, xe tải. Mỗi loại gồm các thông tin:
 *  Hãng sản xuất, năm sản xuất, giá bán và màu xe.

Các ô tô có các thuộc tính riêng: số chỗ ngồi, kiểu động cơ.

Các xe máy có các thuộc tính riêng: công xuất.

Xe tải cần quản lý thêm: Trọng tải.

Yêu cầu 1: Xây dựng các lớp để quản lý các phương tiện trên sao cho hiệu quả.

Yêu cầu 2: Xây dựng lớp QLPTGT có các chức năng:

    Thêm, xoá các phương tiện thuộc các loại trên.
    Tìm phương tiện theo hãng sản xuất, màu.
    Thoát chương trình.

 */
class vehicle{
	protected String brand;
	protected int yearrelease;
	protected String color;
	public vehicle() {
		this.brand="";
		this.yearrelease=0;
		this.color="";
		
	}
	public vehicle(String brand, int yearrelease, String color) {
		this.brand=brand;
		this.yearrelease = yearrelease;
		this.color=color;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYearrelease() {
		return yearrelease;
	}
	public void setYearrelease(int yearrelease) {
		this.yearrelease = yearrelease;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "Brand name: " + brand +"\n" + "Year release: " + yearrelease + "\n" + "Color: "+ color;
	}
	
}
class car extends vehicle{
	protected  int seatnumber;
	protected String engine;
	public car() {
		super();
		this.seatnumber=0;
		this.engine="";
		
	}
	public car(String brand, int yearrelease, String color, int seatnumber, String engine) {
		super(brand, yearrelease, color);
		this.seatnumber=seatnumber;
		this.engine=engine;
		
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String toString() {
		super.toString();
		return "Number of seat: "+ seatnumber +"\n" + "Type of engine: "+ engine;	
	}
}
class motorbike extends vehicle{
	protected String wattage;
	public motorbike() {
		super();
		this.wattage="";
		
	}
	public motorbike(String brand, int yearrelease, String color,String wattage) {
		super(brand,yearrelease, color);
		this.wattage=wattage;
		
	}
	public String getWattage() {
		return wattage;
	}
	public void setWattage(String wattage) {
		this.wattage = wattage;
	}
	public String toString() {
		super.toString();
	return "Wattage: " + wattage;
	}
}
class truck extends vehicle{
	protected int payload;
	public truck () {
		super();
		this.payload = payload;
	}
	public truck(String brand, int yearrelease, String color, int payload) {
		super(brand, yearrelease, color);
		this.payload=payload;
	}
	public int getPayload() {
		return payload;
	}
	public void setPayload(int payload) {
		this.payload = payload;
	}
	public String toString() {
		super.toString();
		return "Payload:" + payload;
	}
	
}
class managevehicle{
	private List<vehicle> ve;
	public managevehicle() {
		this.ve=new ArrayList<>();
	}
	public void add(vehicle v) {
		this.ve.add(v);
	}
	public boolean delete(String brand) {
		vehicle v=this.ve.stream().filter(veh->veh.getBrand().equals(brand)).findFirst().orElse(null);
		if(v==null) {
			return false;
			
		}
		else {
			this.ve.remove(v);
			return true;
		}
		
	}
	public List<vehicle> searchbybrand(String brand) {
		return this.ve.stream().filter(b -> b.getBrand().contains(brand)).collect(Collectors.toList());
		
	}
	
}
public class bai15 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		managevehicle mg=new managevehicle();
		while(true) {
			System.out.println("--------------Welcome--------------");
			System.out.println("Press 1 to insert vehicle:");			
			System.out.println("Press 2 to delete vehicle:");
			System.out.println("Press 3 to search vehicle");
			System.out.println("Press 4 to exit:");
			String m=sc.nextLine();
			switch(m) {
			case "1":
			{
				System.out.println("Press a to insert car");
				System.out.println("Press b to insert motorbike:");
				System.out.println("Press c to insert truck:");
				String sw = sc.nextLine();
				switch (sw) {
				case "a":{
					System.out.println("Enter brand:");
					String brand =sc.nextLine();
					System.out.println("Enter release year:");
					int yearrelease =sc.nextInt();
					System.out.println("Enter color:");
					String color=sc.nextLine();
					sc.nextLine();
					System.out.println("Enter number of seat:");
					int seatnumber =sc.nextInt();
					System.out.println("Enter engine:");
					String engine=sc.nextLine();
					
					vehicle carr=new car(brand, yearrelease, color, seatnumber, engine) ;
					mg.add(carr);
					break;
				}
				case "b":{
					System.out.println("Enter brand:");
					String brand =sc.nextLine();
					System.out.println("Enter release year:");
					int yearrelease =sc.nextInt();
					System.out.println("Enter color:");
					String color=sc.nextLine();
					System.out.println("Enter wattage:");
					String wattage =sc.nextLine();
					
					vehicle motor =new motorbike(brand, yearrelease, color, wattage) ;
					mg.add(motor);
					break;
				}
				case "c":
				{
					System.out.println("Enter brand:");
					String brand =sc.nextLine();
					System.out.println("Enter release year:");
					int yearrelease =sc.nextInt();
					System.out.println("Enter color:");
					String color=sc.nextLine();
					System.out.println("Enter Payload:");
					int payload =sc.nextInt();
					vehicle lorry = new truck(brand, yearrelease, color, payload) ;
					mg.add(lorry);
					break;
				}
				}

				break;
			}
			case "2":
			{
				System.out.println("Enter brand name to delete:");
				String del=sc.nextLine();
				System.out.println(mg.delete(del)?"Success": "Fail");
			}
			case "3":
			{
				System.out.println("Enter brand name to search:");
				String name=sc.nextLine();
				mg.searchbybrand(name).forEach(brand ->{
					System.out.println(brand.toString());
				});
				
				break;		 
			}
			case "4":{
				return ;
			}
			default:
			{
				System.out.println("Invalid");
				
			}
				
				
			}



			

		
		}
		
		
	}
}
