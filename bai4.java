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
// * ????? qu???n l?? c??c h??? d??n c?? trong m???t khu ph???, ng?????i ta c???n c??c th??ng tin sau: 
// * S??? th??nh vi??n trong gia ????nh, S??? nh??, th??ng tin m???i c?? nh??n trong gia ????nh. V???i m???i c?? nh??n, ng?????i ta qu???n l?? c??c th??ng tin sau:
// *  H??? t??n, Tu???i, Ngh??? nghi???p, s??? ch???ng minh nh??n d??n(duy nh???t cho m???i ng?????i).
//
//Y??u c???u 1: H??y x??y d???ng l???p Nguoi ????? qu???n l?? th??ng tin c???a m???i c?? nh??n.
//
//Y??u c???u 2: X??y d???ng l???p HoGiaDinh ????? qu???n l?? th??ng tin c???a t???ng h??? gia ????nh.
//
//Y??u c???u 2: X??y d???ng l???p KhuPho ????? qu???n l?? c??c th??ng tin c???a t???ng h??? gia ????nh.
//
//Y??u c???u 3: Nh???p n h??? d??n. (n nh???p t??? b??n ph??m), hi???n th??? th??ng tin c???a c??c h??? trong khu ph???.
// */
