/*
 * Xây dựng chương trình quản lý danh sách hoá đơn tiền điện của khách hàng. Thông tin bao gồm các loại khách hàng :
 Khách hàng Việt Nam: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): 
số lượng (số KW tiêu thụ), đơn giá, định mức. Thành tiền được tính như sau:
- Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
- Ngượclạithì;	thànhtiền = sốlượng *đơngiá * địnhmức + sốlượngKWvượtđịnhmức * Đơn giá * 2.5.
 Khách hàng nước ngoài: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), quốc tịch, số lượng, đơn giá.
 Thành tiền được tính = số lượng * đơn giá.
Thực hiện các yêu cầu sau:
 Xây dựng các lớp với chức năng thừa kế.
 Nhập xuất danh sách các hóa đơn khách hàng.
 Tính tổng số lượng cho từng loại khách hàng.
 Tính trung bình thành tiền của khách hàng người nước ngoài.
 Xuất ra các hoá đơn trong tháng 09 năm 2013 (cùa cả 2 loại khách hàng).
 */
package thuchanhoop;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

 class KhachHang {
	 protected int MaKH, SoLuong;	 
	 protected double DonGia, ThanhTien; 
	 protected String NgayHD, HoTenKH; 
	 Scanner in =new Scanner(System.in);
	 protected KhachHang() {
		 this.MaKH=0; 
		 this.DonGia=0;
		 this.NgayHD=""; 
		 this.HoTenKH="";
		 this.SoLuong=0;
}
	 protected KhachHang(int ma, double dgia, String ngay, String hoten, int sl, double ttien)
	 {	
		 this.MaKH=ma;
		 this.DonGia=dgia; 
		 this.NgayHD=ngay; 
		 this.HoTenKH=hoten; 
		 this.SoLuong=sl; 
		 this.ThanhTien=ttien;
	 }
	 protected int getMaKH() { 
		 return MaKH;
}
	 protected void setMaKH(int maKH) {
		 MaKH = maKH; 
		 }
	 protected double getDonGia() { 
		 
		 return DonGia;
	 	}
	 protected void setDonGia(double donGia) {
		 DonGia = donGia; 
		 }
	 protected String getNgayHD() { 
		 return NgayHD;
}
	 protected void setNgayHD(String ngayHD) {
		 NgayHD = ngayHD;
	 }
	 protected String getHoTenKH() { 
		 return HoTenKH;
	 }
	 protected void setHoTenKH(String hoTenKH) { 
		 HoTenKH = hoTenKH;

	 }
	 protected int getSoLuong() {
		 return SoLuong; 
		 }

	 protected void setSoLuong(int sl) {
		 SoLuong = sl;
	 }
	 protected double getThanhTien() {
		 return ThanhTien; 
		 }
	 protected void setThanhTien(double thanhTien) { 
		 ThanhTien = thanhTien;
}
	protected void nhap() {
	System.out.println("Nhap Ma Khach Hang: ");
	MaKH = in.nextInt();
	System.out.println("Ho va Ten Khach Hang: "); 
	HoTenKH = in.next();
	System.out.println("Ngay Lap Hoa Don: "); 
	NgayHD = in.next(); 
	System.out.println("So Luong(KW): "); 
	SoLuong = in.nextInt(); 
	System.out.println("Don Gia: ");
	DonGia = in.nextDouble(); 
	}
	public String toString() {
	return "[MaKH: " + MaKH + ", HoTenKH: " + HoTenKH + ", NgayHD: " +
	NgayHD
	+ ", DonGia: " + DonGia + ", SoLuong: " +SoLuong;
	}
	 }
class khachhangnuocngoai extends KhachHang{
	 private String quoctich;
	 public khachhangnuocngoai() {
		 super();
		 this.quoctich="";
		 
		 
	 }
	 public khachhangnuocngoai(int ma, double dgia, String ngay, String hoten, int sl, double ttien, String quoctich) {
		 super(ma, dgia, ngay,hoten, sl,ttien);
		 this.quoctich=quoctich;
		 
	 }
	public String getQuoctich() {
		return quoctich;
	}
	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	 public void nhap() {
		 super.nhap();
		 System.out.println(" Nhap quoc tich: ");
		 quoctich =in.nextLine();
		 
	 }
	 public double tinhtien() {
		 return this.ThanhTien = this.SoLuong * this.DonGia;
	 }
	 public int tongsoluong() {
		 int sum=0;
		 return sum+=this.SoLuong;
	 }
	 public String toString() {
		 return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + quoctich
                 + ", ThanhTien: " + ThanhTien;
	 }
	 
 }
class khachhangvietnam extends KhachHang  {
	private String LoaiKH;
	private int sokw, dinhmuc;
	 public khachhangvietnam() {
		 super();
		 this.dinhmuc=0;
		 this.sokw=0;
		 this.LoaiKH="";
		 
	 }
	 public khachhangvietnam(int ma, double dgia, String ngay, String hoten, int sl, double ttien, int sokw, int dinhmuc,String LoaiKH) {
		 super(ma,dgia, ngay,hoten, sl, ttien);
		 this.dinhmuc=dinhmuc;
		 this.sokw=sokw;
		 this.LoaiKH=LoaiKH;
		 
	 }
	public int getSokw() {
		return sokw;
	}
	public void setSokw(int sokw) {
		this.sokw = sokw;
	}
	public int getDinhmuc() {
		return dinhmuc;
	}
	public void setDinhmuc(int dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	
	 public String getLoaiKH() {
		return LoaiKH;
	}
	public void setLoaiKH(String loaiKH) {
		LoaiKH = loaiKH;
	}
	public void nhap() {
		 super.nhap();
		 System.out.println("Nhap so kw:");
		 sokw= in.nextInt();
		 System.out.println("Nhap gia tri dinh muc :");
		 dinhmuc =in.nextInt();
		 System.out.println("Nhap loai khach hang \n 1 : Sinh Hoat \n 2 : Kinh Doanh \n 3 : SanXuat ");
		 LoaiKH=in.nextLine();
		 
	 }
	 public double tinhtien() {
		 if (this.SoLuong <=this.dinhmuc) {//thành tiền = số lượng * đơn giá.
			 return  this.ThanhTien = this.SoLuong * this.DonGia;
		 }
		 else//thànhtiền = sốlượng *đơngiá * địnhmức + sốlượngKWvượtđịnhmức * Đơn giá * 2.5.
			 return  this.ThanhTien=this.SoLuong * this.DonGia *this.dinhmuc + this.sokw *2.5;
	 }
	 public int tongsoluong() {
		 int sum2=0;
		 return sum2+=this.SoLuong;
	 }
	 public String toString() {
		 String temp; 
		 if(LoaiKH== "1")
			 temp="Sinh Hoat"; else if(LoaiKH== "2")
			 temp="Kinh Doanh"; else
			 temp="San Xuat";
			 return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp
			            +  ", Dinh Muc: " + dinhmuc + ", Thanh Tien: " + ThanhTien;
		 
	 }
	 
 }
class manageKH{
	
	List<KhachHang> customer;
	public manageKH() {
		this.customer=new ArrayList<>();
		
	}
	public void add(KhachHang Customer) {
		this.customer.add(Customer);
	}
	public void show() {
        this.customer.forEach(customer -> System.out.println(customer.toString()));

	}
	
	public void sum() {
		
		System.out.println(":::->> Tong So Luong(KW) Dien cua KH Viet Nam: ");
		
	}
}
public class bai9 {
	public static void main() {
		manageKH manager = new manageKH();
		Scanner sc =new Scanner (System.in);
				int x;
		do
		{
		System.out.println("\n\t\t------------------------------------");
		System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |"); 
		System.out.println("\t\t|1. Them Khach Hang Viet\t\t\t |"); 
		System.out.println("\t\t|2. Them Khach Hang Nuoc Ngoai\t\t\t |"); 
		System.out.println("\t\t|3. Hien Thi Danh Sach Khach Hang\t\t |"); 
		System.out.println("\t\t|4. Xem Tong (KW)cua cac KH\t\t |"); 
		System.out.println("\t\t|5. Xem TB Thanh Tien cua KH NN\t |");	
		System.out.println("\t\t--------------------------------------");
		x=sc.nextInt();
		System.out.println("======>>");
		switch(x)
		{
			case 1:{
			manager.add(null);
			break; 
			}
			case 2:{
			manager.show();
			break;
			}
			
			}
		}while(x!=0);
			System.out.println("");

		
	}
}


