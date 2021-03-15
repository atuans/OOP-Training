package thuchanhoop;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar ;
// Nguyễn Hoàng Anh Tuấn - ITITIU19233


abstract class ABook extends java.lang.Object{
	abstract int DaysOverDue();
	abstract boolean isOverDue();
	
	
}
class RegBook extends ABook{
	private static final int DAY = 14;
	private static final int BORROW_FEE_DAY_REG = 5000;
	private static final int OVER_DUE_FEE = 10000;
	
	public String title;
	public String author;
	public int DayTaken;
	
	public  RegBook() {
		super();
		this.title="";
		this.author="";
		this.DayTaken=0;
		
	}
	public RegBook(String title, String author, int DayTaken) {
		this.title=title;
		this.author=author;
		this.DayTaken=DayTaken;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDayTaken() {
		return DayTaken;
	}
	public void setDayTaken(int dayTaken) {
		DayTaken = dayTaken;
	}
	
	 int DaysOverDue() {
		 LocalDate startDate = LocalDate.of(1970, 1, 1);
		 LocalDate endDate = LocalDate.of(2020, 10, 22);  
		 Period borrowday = Period.between(startDate, endDate);
		 System.out.println("Total Rented day: " + 
			        borrowday.getYears() + " Years " + borrowday.getMonths() + " Months " +
			        borrowday.getDays() + " Days.");
			
		 int totalday = borrowday.getYears()*365+borrowday.getMonths()+borrowday.getDays();
		 int Dayover = totalday -DAY;
		 return Dayover;
}
	 boolean isOverDue() {
			if(getDayTaken() >DAY) {
				return true;
			}
			return false;
		}
	 long calculate() {
		 long payment=0;
		 
		 if ( isOverDue()==true) {
			 payment = DAY * BORROW_FEE_DAY_REG + OVER_DUE_FEE * DaysOverDue();
		 }
		 else {
			 payment = DAY * BORROW_FEE_DAY_REG * DaysOverDue();
			 }
		
			 return payment;
		 }
	 
	 
	 }
class RefBook extends ABook{
	private static final int DAY =2;

	private static final int OVER_DUE_FEE = 10000;
	private static final int BORROW_FEE_DAY_REG = 5000;
	
	public String title;
	public int DayTaken;
	public RefBook() {
		this.title="";
		this.DayTaken=0;
		
	}
	
	public RefBook(String title, int dayTaken) {
		super();
		this.title = title;
		DayTaken = dayTaken;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDayTaken() {
		return DayTaken;
	}

	public void setDayTaken(int dayTaken) {
		DayTaken = dayTaken;
	}
	boolean isOverDue() {
		if(getDayTaken() >DAY) {
			return true;
		}
		return false;
	}
	

	@Override
	int DaysOverDue() {
		LocalDate startDate = LocalDate.of(1970, 1, 1);
		 LocalDate endDate = LocalDate.of(2020, 10, 22);  
		 Period borrowday = Period.between(startDate, endDate);
		 System.out.println("Total Rented day: " + 
			        borrowday.getYears() + " Years " + borrowday.getMonths() + " Months " +
			        borrowday.getDays() + " Days.");
			
		 int totalday = borrowday.getYears()*365+borrowday.getMonths()+borrowday.getDays();
		 int Dayover = totalday - DAY;
		 return Dayover;
	}
	
	long calculate() {
		 long payment=0;
		 
		 if ( isOverDue()==true) {
			 payment = DAY * BORROW_FEE_DAY_REG + OVER_DUE_FEE * DaysOverDue();
		 }
		 else {
			 payment = DAY * BORROW_FEE_DAY_REG * DaysOverDue();
			 }
		
			 return payment;
		 }
	 
	 
	 }
	

class AudioBook extends ABook{
	private static final int DAY =14;
	private static final int BORROW_FEE_DAY_REG = 20000;
	private static final int OVER_DUE_FEE = 10000;
	
	public String title;
	public String author;
	public int DayTaken;
	
	public AudioBook() {
		super();
		this.title="";
		this.author="";
		this.DayTaken=0;
		
	}

	public AudioBook(String title, String author, int dayTaken) {
		super();
		this.title = title;
		this.author = author;
		DayTaken = dayTaken;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDayTaken() {
		return DayTaken;
	}

	public void setDayTaken(int dayTaken) {
		DayTaken = dayTaken;
	}
	boolean isOverDue() {
		if(getDayTaken() >DAY) {
			return true;
		}
		return false;
	}
	


	
	int DaysOverDue() {
		LocalDate startDate = LocalDate.of(1970, 1, 1);
		 LocalDate endDate = LocalDate.of(2020, 10, 22);  
		 Period borrowday = Period.between(startDate, endDate);
		 System.out.println("Total Rented day: " + 
			        borrowday.getYears() + " Years " + borrowday.getMonths() + " Months " +
			        borrowday.getDays() + " Days.");
			
		 int totalday = borrowday.getYears()*365+borrowday.getMonths()+borrowday.getDays();
		 int Dayover = totalday -DAY;
		 return Dayover;
	}

	
	long calculate() {
		 long payment=0;
		 
		 if ( isOverDue()==true) {
			 payment = DAY * BORROW_FEE_DAY_REG + OVER_DUE_FEE * DaysOverDue();
		 }
		 else {
			 payment = DAY * BORROW_FEE_DAY_REG * DaysOverDue();
			 }
		
			 return payment;
		 }
	 
	 
	 }

public class bai16 {
	public static void main(String []args) {
		RegBook reg= new RegBook("Grand Zi o "," Tokiwa Sougo ",12);
		RefBook ref= new RefBook(" Build harzard  ",12);
		AudioBook aud= new AudioBook("Metal Cluster Hopper "," Aruto Hiden ",20);
		System.out.println(reg.calculate());
		System.out.println(ref.calculate());
		System.out.println(aud.calculate());
		
	}

}
