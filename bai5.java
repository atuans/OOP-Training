package thuchanhoop;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



class Person {
    private String name;
    private int age;
    private String passport;
    private Room room;
    private int numberRent;

    public Person(String name, int age, String passport, Room room, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.numberRent = numberRent;
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
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

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' + room.toString() +
                '}';
    }
}

class Room {
    protected String category;
    protected int price;

    public Room(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

	
	
class RoomA extends Room {

    public RoomA() {
        super("A", 500);
    }

    
    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

class RoomB extends Room {
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "RoomB{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
class RoomC extends Room {
    public RoomC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "RoomC{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
class Hotel {
    private List<Person> persons;

    public Hotel() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean delete(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        this.persons.forEach(p -> System.out.println(p.toString()));
    }

	
}

public class bai5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter passport: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Choise a to rent room type A");
                    System.out.println("Choise b to rent room type B");
                    System.out.println("Choise c to rent room type C");
                    String choise = scanner.nextLine();
                    Room room;
                    if (choise.equals("a")) {
                        room = new RoomA();
                    } else if (choise.equals("b")) {
                        room = new RoomB();
                    } else if (choise.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = scanner.nextInt();
                    Person person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }


}
/*
Để quản lý khách hàng đến thuê phòng của một khách sạn, người ta cần các thông tin sau: 
Số ngày thuê, loại phòng, thông tin cá nhân của những người thuê phòng.

Biết rằng phòng loại A có giá 500$, phòng loại B có giá 300$ và loại C có giá 100$.

Với mỗi cá nhân cần quản lý các thông tin sau: Họ tên, tuổi, số chứng minh nhân dân.

Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân của những người thuê phòng.

Yêu cầu 2: Xây dựng lớp KhachSan để quản lý các thông tin về khách trọ.

Yêu cầu 3: Xây dựng các phương thức thêm mới, xoá theo số chứng minh nhân dân. 
Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức: (số ngày thuê * giá của từng loại phòng)
*/