package thuchanhoop;
import java.util.Scanner;


class GiaoDich {
	
protected int MaGD, SoLuong;
protected String NgayGD;
protected double DonGia, ThanhTien; 

	Scanner in = new Scanner(System.in);
	protected GiaoDich() {
		this.MaGD=0; 
		this.NgayGD=""; 
		this.DonGia=0; 
		this.SoLuong=0; 
		this.ThanhTien=0;
		}
		protected GiaoDich(int ma, int sl, String ngay, double dgia, double ttien) {
		this.MaGD=ma; 
		this.NgayGD=ngay; 
		this.DonGia=dgia; 
		this.SoLuong=sl; 
		this.ThanhTien=ttien;
		}
		protected int getMaGD() { 
			return MaGD;
		}
		protected void setMaGD(int maGD) {
			MaGD = maGD; 
		}
		protected int getSoLuong() { 
			return SoLuong;
		}
		protected void setSoLuong(int soLuong) {
			SoLuong = soLuong; 
			}
		protected String getNgayGD() { 
			return NgayGD;
			}
		protected void setNgayGD(String ngayGD) {
			NgayGD = ngayGD; 
			}
		protected double getDonGia() { 
			return DonGia;
		}
		protected void setDonGia(double donGia) {
			DonGia = donGia; 
			}
		protected double getThanhTien() { 	
			return ThanhTien;
		}
		protected void setThanhTien(double thanhTien) {
			ThanhTien = thanhTien;
		}
protected void nhap()
	{
			System.out.println("Ma Giao Dich: "); 
			MaGD = in.nextInt(); 
			System.out.println("Ngay Giao Dich: ");
			NgayGD = in.next(); 
			System.out.println("Don Gia: ");
			DonGia = in.nextDouble(); 
			System.out.println("So Luong: "); 
			SoLuong = in.nextInt();
	}
public String toString() {
return " [MaGD=" + MaGD + ", SoLuong=" + SoLuong + ", NgayGD=" + NgayGD + ", DonGia=" + DonGia;
}


}
class GiaoDichVang extends GiaoDich
{
	private String LoaiVang;
	public GiaoDichVang() {
		super();
		this.LoaiVang=""; }
	public GiaoDichVang(int ma, int sl, String ngay, double dgia, double ttien, String lvang)
		{
		super(ma, sl, ngay, dgia, ttien); 	
		this.LoaiVang=lvang;
		}
		public String getLoaiVang() { 
			return LoaiVang;
		}
		public void setLoaiVang(String loaiVang) { 
			LoaiVang = loaiVang;
		}
		public void nhap() {
		super.nhap(); 
		System.out.println("Loai Vang: "); 
		LoaiVang = in.next();
		}
		public double TTien() {
			return this.ThanhTien=this.DonGia*this.SoLuong; 
			}
			public String toString() {
			return "Giao Dich Vang: " + super.toString() + ", LoaiVang: " + LoaiVang
			                      + ", ThanhTien: " + ThanhTien + "]";
			}
			}

class GiaoDichTienTe extends GiaoDich {
	private float TiGia; 
	private int LoaiTienTe;
		public GiaoDichTienTe() {
			super(); 
			this.TiGia=0; 
			this.LoaiTienTe=0;
		}
		public GiaoDichTienTe(int ma, int sl, String ngay, double dgia, double ttien, float tgia, int loai)
		{
			super(ma, sl, ngay, dgia, ttien); 
			this.TiGia=tgia; 
			this.LoaiTienTe=loai;
		}
		public float getTiGia() { 
			return TiGia;
		}
		public void setTiGia(float tiGia) {
			TiGia = tiGia; }
		public int getLoaiTienTe() { 
			return LoaiTienTe;
		}
		public void setLoaiTienTe(int loaiTienTe) {
			LoaiTienTe = loaiTienTe;
			}
		public void nhap() {
			super.nhap();
			System.out.println("Ti Gia: "); 
			TiGia=in.nextFloat();
			System.out.println("Loai Tien Te: ");
		LoaiTienTe=in.nextInt(); }
		public double TTien() {
			if(LoaiTienTe==1)
				return this.ThanhTien=this.DonGia*this.SoLuong;
			else
				return this.ThanhTien=this.DonGia*this.SoLuong*this.TiGia;
		}
		public String toString() {
			String temp; 
			if(LoaiTienTe==1)
				temp="VND";
			else if(LoaiTienTe==2) 
				temp="USD";
			else
				temp="EURO";
			return "Giao Dich Tien Te: " + super.toString() + "' Ti Gia: " + TiGia
		                + ", Loai Tien Te: " + temp + ", ThanhTien: " + ThanhTien +"]"; }
		}
class ListGD {
		GiaoDich gd[] = new GiaoDich[100];
			private int CountGD, sum1=0, sum2=0, dem=0, sumtien=0; 
		public ListGD()
			{
			CountGD=0;
			for(int i=0; i<100; i++)
				gd[i] = new GiaoDich();
			}
		public void ThemGD(int temp) {
			if(CountGD>100)
				System.out.println("Bo nho full, ko the them moi!");
			else
			{
				if(temp==1)
				{
					gd[CountGD] = new GiaoDichVang(); 
					GiaoDichVang gdv = new GiaoDichVang();
				gdv.nhap();
				gdv.ThanhTien=gdv.TTien();
				gd[CountGD] = gdv;
				sum1+=gdv.SoLuong;
				}
				else
				{
					gd[CountGD] = new GiaoDichTienTe(); 
					GiaoDichTienTe gdtt = new GiaoDichTienTe(); 
					gdtt.nhap();
					gdtt.ThanhTien=gdtt.TTien();
					gd[CountGD] = gdtt; 
					sumtien+=gdtt.ThanhTien;
					sum2+=gdtt.SoLuong;
					dem++;
				}
				CountGD++; 
				}
			}
				public void HienThiDS() {
					for(int i=0; i<CountGD; i++) 
					{
						System.out.println("\n----So TT: " + (i+1));
						System.out.println(gd[i].toString()); }
		}
		   // Tong so luong cua giao dich
			public void TongSL() {
			System.out.println("|-> Tong So Luong cua Giao Dich Vang: " + sum1 + " <-|");
			System.out.println("|-> Tong So Luong cua Giao Dich Tien Te:" + sum2 + " <-|");
			}
			public void TrungBinhGDTT() {
			System.out.println("|-> Trung Binh Thanh Tien Giao Dich Tien Te: " + (sumtien/dem) + " <-|");
			}
		   // xuat danh sach giao dich 1 ty
			public void GiaoDich1ty() {
			int d=0;
			for(int i=0; i<CountGD; i++) {
			if(gd[i].DonGia>1000) {
			System.out.println(gd[i].toString());
			d++; }
			} if(d==0)
			System.out.println("Khong co Thong Tin!");
			} }

public class bai8{
	public static void main(String[] args) {
		
		ListGD lgd =new ListGD();
		Scanner in = new Scanner(System.in); int x;
		do
		{
		System.out.println("\n\t\t----------------------------------"); 
		System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |"); 
		System.out.println("\t\t|1. Them Giao Dich Vang\t\t\t\t |"); 
		System.out.println("\t\t|2. Them Giao Dich Tien Te\t\t\t |"); 
		System.out.println("\t\t|3. Hien Thi Danh Sach Giao Dich\t\t |"); 
		System.out.println("\t\t|4. Xem Tong So Luong cua cac Giao Dich\t\t");
		System.out.println("\t\t|5. Xem Trung Binh Cua Giao Dich Tien Te\t");
		System.out.println("\t\t|6. Hien Thi Danh Sach Giao Dich co Don Gia> 1 ngan|");
		System.out.println("\t\t--------------------------------------"); 
			x=in.nextInt();
			switch(x)
			{
			case 1: 
				lgd.ThemGD(1);
				break; 
			case 2:
				lgd.ThemGD(2);
				break; 
			case 3:
				lgd.HienThiDS();
				break; 
			case 4:
				lgd.TongSL();
				break; 
			case 5:
				lgd.TrungBinhGDTT();
				break; 
			case 6:
				lgd.GiaoDich1ty();
				break; 
				}
			}
		while(x!=0);
			System.out.println(""); 
			}
}
	
/*
Xây dựng chương trình quản lý danh sách các giao dịch. Hệ thống quản lý 2 loại giao dịch:
Giao dịch vàng: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá, số lượng, loại vàng. Thành tiền được tính như sau:
thành tiền = số lượng * đơn giá.
Giao dịch tiền tệ: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), Đơn giá, số lượng, tỉ giá, loại tiền tệ có 3 loại: 
tiền Việt Nam, tiền USD, tiền Euro. Thành tiền được tính như sau:
- Nếu là tiền USD hoặc Euro thì: thành tiền = số lượng * đơn giá* tỉ giá
 - Nếu là tiền VN thì: thành tiền = số lượng * đơn giá Thực hiện các yêu cầu sau:
 Xây dựng các lớp với chức năng thừa kế.
 Nhập xuất danh sách các giao dịch.
 Tính tổng số lượng cho từng loại.
 Tính trung bình thành tiền của giao dịch tiền tệ.
 Xuất ra các giao dịch có đơn giá > 1 tỷ.

*/