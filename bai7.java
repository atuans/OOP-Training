/*
 * Khoa CNTT – DHKHTN cần quản lý việc thanh toán tiền lương cho các cán bộ giá viên trong khoa. Để quản lý được, khoa cần các thông tin sau:

Với mỗi cán bộ giáo viên có các thông tin sau: lương cứng, lương thưởng, tiền phạt, lương thực lĩnh, và các thông tin cá nhân:
 Họ tên, tuổi, quê quán, mã số giáo viên.

Yêu cầu 1: Xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên.

Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.

Yêu cầu 3: Xây dựng các phương thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.

Yêu cầu 4: Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
 */
package thuchanhoop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 class Teacher {
    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;
    private String name;
    private int age;
    private String hometown;
    private String id;


    public Teacher(double salary, double bonus, double penaty, double realSalary, String name, int age, String hometown, String id) {
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.realSalary = realSalary;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }
}
 class manageTeacher {
	 private List<Teacher> teachers;
	 public manageTeacher() {
		 this.teachers =new ArrayList<>();
		 
	 }
	 public void add(Teacher teacher) {
		 this.teachers.add(teacher);
		 
	 }
	 public boolean delete (String id) {
		 Teacher teacher =this.teachers.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
		 if(teacher == null) {
			 return false;
			 
		 }else {
			 this.teachers.remove(teacher);
			 return true;
		 }
	 }
	 public double calculatorsalary(String id) {
		 Teacher teacher = this.teachers.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
	        if (teacher == null) {
	            return 0;
	        }
	        return teacher.getSalary() + teacher.getBonus() -teacher.getPenaty();
	    }
 }
 
public class bai7{
	
	public static void main (String []args) {
		 Scanner sc = new Scanner(System.in);
	        manageTeacher manager= new manageTeacher();
	        while (true) {
	           System.out.println("Salary Management Program");
	           System.out.println("Press 1 to add  teacher :");
	           System.out.println("Press 2 to delete teacher: ");
	           System.out.println("Press 3 to calculate teacher salary:");
	           System.out.println("Press 4 to exit:");
	           String s = sc.nextLine();
	           switch(s) {
	           case "1":{
	        	   System.out.println("Enter teacher salary:");
	        	   double salary =sc.nextDouble();
	        	    System.out.println("Enter teacher bonus:");
	        	   double bonus =sc.nextDouble();
	        	     System.out.println("Enter teacher penalty:");
	        	   double penalty=sc.nextDouble();
	        	   
	        	   System.out.println("Enter teacher lately realSalary :");
	        	   double realSalary =sc.nextDouble();
	        	   System.out.println("Enter teacher name: ")  ;
	        	   String name=sc.nextLine();
	        	   System.out.println("Enter teacher age: ");
	        	   int age =sc.nextInt();
	        	  
	        	   System.out.println("Enter teacher hometown :");
	        	   String hometown = sc.nextLine();
	        	   
	        	   System.out.println("Enter teacher ID: ");
	        	   String id= sc.nextLine();
	        	 

	        	   Teacher t = Teacher( salary,bonus, penalty, realSalary, name,age, hometown, id) ;
	        	   manager.add(t);
	        	   sc.nextLine();
	        	   break;
	           }
	        	   
	           
	           
	           case "2":{
	        	   System.out.println("Delete a teacher : ");
	        	   String del =sc.nextLine();
	        	   System.out.println(manager.delete(del) ? "Success" : "Fail");
	           }
	           case "3":{
	        	   System.out.println("");
	        	   String price =sc.nextLine();
	        	   System.out.println("Ypur salary: "+ manager.calculatorsalary(price));
	           }
	           case "4":{
	        	   return ;
	        	   
	           }
	           default:
	        	   System.out.println("Unvalid");
	        	   
	        	   }



	           
	        }
	    }

	private static Teacher Teacher(double salary, double bonus, double penalty, double realSalary, String name, int age,
			String hometown, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
