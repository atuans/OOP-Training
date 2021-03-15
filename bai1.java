	package thuchanhoop;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;


class Officer {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public Officer(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Worker extends Officer {
    private int level;

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Engineer extends Officer {
    private String branch;
    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Staff extends Officer {
    private String task;
    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}


public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }

    }


	
}

//class canbo {
//	private String name;
//	private int age;
//	private String gender;
//	private String address;
//	public canbo() {
//		this.address="";
//		this.age=0;
//		this.name="";
//		this.gender="";
//		
//	}
//	public canbo(String name, int age,String gender, String address) {
//		this.name = name;
//		this.age=age;
//		this.gender=gender;
//		this.address=address;
//		
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String toString() {
//		return "Name: "+ name + "\n" + "Age: " + age+ "\n" + "Gender: "+ gender + "Address: "+ address;  
//	}
//	
//}
//class congnhan extends canbo{
//	private String level;
//	public congnhan(String name, int age, String gender , String address, String level) {
//		super(name, age, gender, address);
//		this.level=level;
//		
//	}
//	public String getLevel() {
//		return level;
//	}
//	public void setLevel(String level) {
//		this.level = level;
//	}
//	public String toString() {
//		super.toString();
//		return "Level from 1 to 10 : "+ level;
//		
//	}
//	
//}
//class kysu extends canbo{
//	private String nganhdaotao;
//	public kysu(String name, int age, String gender, String address, String nganhdaotao) {
//		super(name, age, gender, address);
//		this.nganhdaotao= nganhdaotao;
//		
//	}
//	public String getNganhdaotao() {
//		return nganhdaotao;
//	}
//	public void setNganhdaotao(String nganhdaotao) {
//		this.nganhdaotao = nganhdaotao;
//	}
//	public String toString() {
//		super.toString();
//		return " Type of training: "+ nganhdaotao;
//		
//	}
//	
//}
//class nhanvien extends canbo{
//	private String congviec;
//	public nhanvien(String name, int age, String gender, String address) {
//		super(name, age, gender, address);
//		this.congviec= congviec;
//		
//	}
//	public String getCongviec() {
//		return congviec;
//	}
//	public void setCongviec(String congviec) {
//		this.congviec = congviec;
//	}
//	public String toString () {
//		super.toString();
//		return "Type of works: "+ congviec;
//	}
//}
//class quanlycanbo{
//	private List<canbo> workers;
//	public quanlycanbo() {
//		this.workers=new ArrayList<>();
//		
//	}
//	public void add(canbo worker) {
//		this.workers.add(worker);
//	}
//	public List<canbo> searchbyname(String name) {
//		return this.workers.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
//	}
//	public void showinfor() {
//		this.workers.forEach(o->System.out.println(toString()));
//	}
//}
//public class bai1{
//	public static void main(String [] args) {
//		Scanner sc= new Scanner (System.in);
//		quanlycanbo ql =new quanlycanbo();
//		while (true) {
//			System.out.println("Workers Management System");
//			System.out.println("Press 1 to insert worker:");
//			System.out.println("Press 2 to search worker by name:");
//			System.out.println("Press 3 to show worker information:");
//			System.out.println("Press 4 to exit program:");
//			String s=sc.nextLine();
//			switch(s) {
//			case "1":{
//				System.out.println("Press a to insert worker information:");
//				System.out.println("Press b to inser enginerr information:");
//				System.out.println("Press c to insert asisstant information:");
//				
//				String lc =sc.nextLine();
//				switch(lc) {
//				case "a":{
//					System.out.println("Enter full name:");
//					String name= sc.nextLine();
//					System.out.println("Enter age:");
//					int age = sc.nextInt();
//					System.out.println("Enter Gender (Male or Female):");
//					String gender =sc.nextLine();
//					System.out.println("Enter address :");
//					String address = sc.nextLine();
//					System.out.println("Enter level from 1 to 10:");
//					String level =sc.nextLine();
//					canbo worker =new congnhan(name, age, gender, address, level);
//					ql.add(worker);
//					break;
//				}
//				case "b":
//				{
//					System.out.println("Enter full name:");
//					String name= sc.nextLine();
//					System.out.println("Enter age:");
//					int age = sc.nextInt();
//					System.out.println("Enter Gender (Male or Female):");
//					String gender =sc.nextLine();
//					System.out.println("Enter address :");
//					String address = sc.nextLine();
//					System.out.println("Enter training type :");
//					
//					String type =sc.nextLine();
//					canbo engineer =new kysu(name, age, gender, address, type);
//					ql.add(engineer);
//					break;
//				}
//				case "c":
//				{
//					System.out.println("Enter full name:");
//					String name= sc.nextLine();
//					System.out.println("Enter age:");
//					int age = sc.nextInt();
//					System.out.println("Enter Gender (Male or Female):");
//					String gender =sc.nextLine();
//					System.out.println("Enter address :");
//					String address = sc.nextLine();
//					System.out.println("Enter works :");
//					String work =sc.nextLine();
//					canbo staff =new congnhan(name, age, gender, address, work);
//					ql.add(staff);
//				}
//				}
//			
//					
//					
//					
//				}
//			case "2":
//			{
//				System.out.println("Enter name to search:");
//				String ten=sc.nextLine();
//				ql.searchbyname(ten).forEach(o -> {
//                  o.toString();
//              });
//			}
//			case "3":{
//				ql.showinfor();
//				break;
//				
//			}
//			case "4":{
//				return ;
//			}
//			default:
//				System.out.println("Invalid, please try again!");
				
//				
//		
//			}
//		}
//		
//	}
//}
/*
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu:
 Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.

    Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
    Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
    Các nhân viên có thuộc tính riêng: công việc.

Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

    Thêm mới cán bộ.
    Tìm kiếm theo họ tên.
    Hiện thị thông tin về danh sách các cán bộ.
    Thoát khỏi chương trình.

*/