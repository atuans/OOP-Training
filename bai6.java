/*
 * Để quản lý hồ sơ học sinh của trường THPT nhà trường cần các thông tin sau: Lớp,  và các thông tin về cá nhân của mỗi học sinh.

Mỗi học sinh có các thông tin sau: Họ tên, tuổi, quê quán.

Yêu cầu 1: Xây dựng HocSinh để quản lý thông tin của mỗi học sinh.

Yêu cầu 2: Xây dựng các phương thức thêm, hiển thị thông tin của mỗi học sinh.

Yêu cầu 3: Cài đặt chương trình có các chức năng sau:

    Thêm học sinh mới.
    Hiện thị các học sinh 20 tuổi.
    Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN.

 */
package thuchanhoop;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

	class Student {
	    private String name;
	    private int age;
	    private String hometown;
	    private int classStudent;

	    public Student(String name, int age, String hometown, int classStudent) {
	        this.name = name;
	        this.age = age;
	        this.hometown = hometown;
	        this.classStudent = classStudent;
	    }

	    public int getClassStudent() {
	        return classStudent;
	    }

	    public void setClassStudent(int classStudent) {
	        this.classStudent = classStudent;
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

	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", hometown='" + hometown + '\'' +
	                '}';
	    }
	}

class School{
	private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudent20YearOld() {
        return this.students.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN() {
        return this.students.stream().filter(student -> student.getAge() == 23 && student.getHometown().equals("DN")).count();
    }
}

public class bai6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School school = new School();
        scanner.close();

        // add Student to school by func add(). for ex: school.add(new Student(// infor);

        school.getStudent20YearOld();

        school.countStudent23YearOldInDN();
    }
}

