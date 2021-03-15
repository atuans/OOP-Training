//package thuchanhoop;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//class Person {
//    private String name;
//    private int age;
//    private String job;
//    private String passport;
//
//    public Person(String name, int age, String job, String passport) {
//        this.name = name;
//        this.age = age;
//        this.job = job;
//        this.passport = passport;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public String getPassport() {
//        return passport;
//    }
//
//    public void setPassport(String passport) {
//        this.passport = passport;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", job='" + job + '\'' +
//                ", passport='" + passport + '\'' +
//                '}';
//    }
//}
//class Family {
//    private List<Person> presons;
//    private String address;
//
//    public Family(List<Person> presons, String address) {
//        this.presons = presons;
//        this.address = address;
//    }
//
//    public List<Person> getPresons() {
//        return presons;
//    }
//
//    public void setPresons(List<Person> presons) {
//        this.presons = presons;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Family{" +
//                "presons=" + presons +
//                ", address='" + address + '\'' +
//                '}';
//    }
//}
//
//class Town {
//    List<Family> families;
//
//    public Town() {
//        this.families = new ArrayList<>();
//    }
//
//    public List<Family> getFamilies() {
//        return families;
//    }
//
//    public void setFamilies(List<Family> families) {
//        this.families = families;
//    }
//
//    public void addFamily(Family family) {
//        this.families.add(family);
//    }
//}
//
//
//
//public class bai4 {
//	public static void main(String []args) {
//	Town town = new Town();
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter n:"); 
//    int n = scanner.nextInt();
//    for(int i = 0; i < n; i++) {
//        // Input foreach famili
//
//        System.out.println("Enter address:");
//        scanner.nextLine();
//        String address = scanner.nextLine();
//
//        // Enter person number in family
//        List<Person> persons = new ArrayList<>();
//        System.out.println("Enter number person");
//        int number = scanner.nextInt();
//
//        for (int j = 0; j < number; j++) {
//            // Inout person for family
//        }
//
//        // After done input
//        town.addFamily(new Family(persons,address ));
//
//
//    }
//
//}
//}
///*
// * Để quản lý các hộ dân cư trong một khu phố, người ta cần các thông tin sau: 
// * Số thành viên trong gia đình, Số nhà, thông tin mỗi cá nhân trong gia đình. Với mỗi cá nhân, người ta quản lý các thông tin sau:
// *  Họ tên, Tuổi, Nghề nghiệp, số chứng minh nhân dân(duy nhất cho mỗi người).
//
//Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin của mỗi cá nhân.
//
//Yêu cầu 2: Xây dựng lớp HoGiaDinh để quản lý thông tin của từng hộ gia đình.
//
//Yêu cầu 2: Xây dựng lớp KhuPho để quản lý các thông tin của từng hộ gia đình.
//
//Yêu cầu 3: Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.
// */
