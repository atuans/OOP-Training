package thuchanhoop;
/*
 * Xây dựng lớp SoPhuc có các thuộc tính PhanThuc, PhanAo kiểu double.

Yêu cầu 1: Xây dựng các phương thức tạo lập

Yêu cầu 2: Xây dựng các phương thức:

    Nhập một số phức.
    Hiện thị số phức.
    Cộng 2 số phức.
    Nhân 2 số phức.

 */
class complexnumber{
	protected double realside;
	protected double fakeside;
	public complexnumber() {
		this.fakeside=0;
		this.realside=0;
}
	public complexnumber(double realside, double fakeside) {
		this.fakeside=fakeside;
		this.realside=realside;
		
	}
	public double getRealside() {
		return realside;
	}
	public void setRealside(double realside) {
		this.realside = realside;
	}
	public double getFakeside() {
		return fakeside;
	}
	public void setFakeside(double fakeside) {
		this.fakeside = fakeside;
	}
	public double add() {
		return 0;
	}
}
public class bai14 {

}
