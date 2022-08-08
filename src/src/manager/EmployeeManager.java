package manager;

import model.Employee;
import model.FulltimeEmployee;
import model.PartimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    public static List<Employee> arr = new ArrayList<>();

    //    Tính lương nhân viên
    public void sumTotalSalary(List<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName() + " = " + arr.get(i).totalSalary() + " USD");
        }
    }


    //    Thêm 1 nhân viên FullTime
    public void addFullTime() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Trạng thái: ");
        String status = scanner1.nextLine();
        System.out.println("Nhập ngày công: ");
        int workingDay = scanner.nextInt();
        System.out.println("Nhập thâm niên: ");
        double seniority = scanner.nextDouble();
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(id,name,gender,age,status,workingDay,seniority);
        arr.add(fulltimeEmployee);
    }

    //    Thêm một nhân viên PartTime
    public void addPartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Trạng thái: ");
        String status1 = scanner1.nextLine();
        System.out.println("Thời gian làm việc: ");
        double time = scanner.nextDouble();
        System.out.println("Tiền vi phạm: ");
        int fines = scanner.nextInt();
        PartimeEmployee partimeEmployee = new PartimeEmployee(id, name, gender, age, status1, time, fines);
        arr.add(partimeEmployee);
    }

 

    //    Sửa thông tin
    public void editInformation(List<Employee> arr, String name) throws Exception {
        try {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) instanceof FulltimeEmployee &&
                        arr.get(i).getName().equals(name)) {
                    System.out.println("Bạn muốn sửa thông tin gì nhỉ:");
                    System.out.println("1 - sửa địa chỉ id");
                    System.out.println("2 - sửa tên");
                    System.out.println("3 - sửa giới tính");
                    System.out.println("4 - sửa tuổi");
                    System.out.println("5 - sửa trạng thái");
                    System.out.println("6 - sửa ngày công");
                    System.out.println("7 - sửa thâm niên");
                    System.out.println("*********************************");
                    System.out.println("Mời bạn chọn số" + "\n");
                    Scanner scanner = new Scanner(System.in);
                    Scanner scannerx = new Scanner(System.in);
                    int check = scanner.nextInt();
                    switch (check) {
                        case 1:
                            System.out.println("Địa chỉ id cũ là: ");
                            System.out.println(arr.get(i).getId());
                            System.out.println("Nhập địa chỉ id mới: ");
                            int id1 = scanner.nextInt();
                            arr.get(i).setId(id1);
                            break;
                        case 2:
                            System.out.println("Tên nhân viên cũ:");
                            System.out.println(arr.get(i).getName());
                            System.out.println("Nhập tên mới: ");
                            String name1 = scannerx.nextLine();
                            arr.get(i).setName(name1);
                            break;
                        case 3:
                            System.out.println("Giới tính cũ: ");
                            System.out.println(arr.get(i).getGender());
                            System.out.println("Nhập giới tính mới: ");
                            String gender1 = scannerx.nextLine();
                            arr.get(i).setGender(gender1);
                            break;
                        case 4:
                            System.out.println("Số tuổi cũ: ");
                            System.out.println(arr.get(i).getAge());
                            System.out.println("Nhập tuổi mới: ");
                            int age1 = scanner.nextInt();
                            arr.get(i).setAge(age1);
                            break;
                        case 5:
                            System.out.println("Trạng thái công việc cũ: ");
                            System.out.println(arr.get(i).getStatus());
                            System.out.println("Nhập trạng thái mới: ");
                            String status1 = scannerx.nextLine();
                            arr.get(i).setStatus(status1);
                            break;
                        case 6:
                            System.out.println("Số ngày công cũ: ");
                            System.out.println(((FulltimeEmployee) arr.get(i)).getWorkingDay());
                            System.out.println("Nhập ngày công mới:");
                            int workingDay = scanner.nextInt();
                            ((FulltimeEmployee) arr.get(i)).setWorkingDay(workingDay);
                            break;
                        case 7:
                            System.out.println("Thâm niên làm việc cũ: ");
                            System.out.println(((FulltimeEmployee) arr.get(i)).getSeniority());
                            System.out.println("Nhập lại thâm niên");
                            double seniority = scanner.nextDouble();
                            ((FulltimeEmployee) arr.get(i)).setSeniority(seniority);
                            break;
                    }
                } else if (arr.get(i) instanceof PartimeEmployee &&
                        arr.get(i).getName().equals(name)) {
                    System.out.println("Nhập thông tin bạn muốn chỉnh sửa:");
                    System.out.println("1 - sửa địa chỉ id");
                    System.out.println("2 - sửa tên");
                    System.out.println("3 - sửa giới tính");
                    System.out.println("4 - sửa tuổi");
                    System.out.println("5 - sửa trạng thái");
                    System.out.println("6 - sửa thời gian làm");
                    System.out.println("7 - sửa tiền phạt");
                    System.out.println("*********************************");
                    System.out.println("Mời bạn chọn số" + "\n");
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scannery = new Scanner(System.in);
                    int check1 = scanner1.nextInt();
                    switch (check1) {
                        case 1:
                            System.out.println("Địa chỉ id cũ là: ");
                            System.out.println(arr.get(i).getId());
                            System.out.println("Nhập địa chỉ id mới: ");
                            int id2 = scanner1.nextInt();
                            arr.get(i).setId(id2);
                            break;
                        case 2:
                            System.out.println("Tên nhân viên cũ:");
                            System.out.println(arr.get(i).getName());
                            System.out.println("Nhập tên mới: ");
                            String name2 = scannery.nextLine();
                            arr.get(i).setName(name2);
                            break;
                        case 3:
                            System.out.println("Giới tính cũ: ");
                            System.out.println(arr.get(i).getGender());
                            System.out.println("Nhập giới tính mới: ");
                            String gender2 = scannery.nextLine();
                            arr.get(i).setGender(gender2);
                            break;
                        case 4:
                            System.out.println("Số tuổi cũ: ");
                            System.out.println(arr.get(i).getAge());
                            System.out.println("Nhập tuổi mới: ");
                            int age2 = scanner1.nextInt();
                            arr.get(i).setAge(age2);
                            break;
                        case 5:
                            System.out.println("Trạng thái công việc cũ: ");
                            System.out.println(arr.get(i).getStatus());
                            System.out.println("Nhập trạng thái mới: ");
                            String status2 = scannery.nextLine();
                            arr.get(i).setStatus(status2);
                            break;
                        case 6:
                            System.out.println("Thời gian làm việc cũ: ");
                            System.out.println(((PartimeEmployee) arr.get(i)).getTime());
                            System.out.println("Nhập thời gian làm mới: ");
                            double time = scanner1.nextDouble();
                            ((PartimeEmployee) arr.get(i)).setTime(time);
                            break;
                        case 7:
                            System.out.println("Số tiền vi phạm cũ: ");
                            System.out.println(((PartimeEmployee) arr.get(i)).getFines());
                            System.out.println("Nhập tiền vi phạm mới: ");
                            int fines = scanner1.nextInt();
                            ((PartimeEmployee) arr.get(i)).setFines(fines);
                            return;
                    }
                }
                Scanner scanner2 = null;
                int check2 = scanner2.nextInt();
                switch (check2) {
                    case 1:
                        System.out.println("Địa chỉ id cũ là: ");
                        System.out.println(arr.get(i).getId());
                        System.out.println("Nhập địa chỉ id mới: ");
                        int id3 = scanner2.nextInt();
                        arr.get(i).setId(id3);
                        break;
                    case 2:
                        System.out.println("Tên nhân viên cũ:");
                        System.out.println(arr.get(i).getName());
                        System.out.println("Nhập tên mới: ");
                        Scanner scannerz = new Scanner(System.in);
                        String name3 = scannerz.nextLine();
                        arr.get(i).setName(name3);
                        break;
                    case 3:
                        System.out.println("Giới tính cũ: ");
                        System.out.println(arr.get(i).getGender());
                        System.out.println("Nhập giới tính mới: ");
                        String gender3 = scanner2.nextLine();
                        arr.get(i).setGender(gender3);
                        break;
                    case 4:
                        System.out.println("Số tuổi cũ: ");
                        System.out.println(arr.get(i).getAge());
                        System.out.println("Nhập tuổi mới: ");
                        int age3 = scanner2.nextInt();
                        arr.get(i).setAge(age3);
                        break;
                    case 5:
                        System.out.println("Trạng thái công việc cũ: ");
                        System.out.println(arr.get(i).getStatus());
                        System.out.println("Nhập trạng thái mới: ");
                        String status3 = scanner2.nextLine();
                        arr.get(i).setStatus(status3);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + check2);
                }
            }
        } finally {
            
        }
        }Exception e;

    static {;
            System.out.println("Không có nv này");
        }


    //    Xóa nv
    public void deleteStaff(List<Employee> arr, String name){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(name)) {
                arr.remove(i);
            }
        }
    }

    //    Tìm Kiếm nhân viên
    public void search(List<Employee> arr, String name){
        boolean check = false;
        for (int i = 0; i < arr.size(); i++) {
            int cao = 0;
            if (arr.get(i).getName().equals(name)) {
                System.out.println(arr.get(i));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy nhân viên trên");
        }

    }

    //    Hiển thị trạng thái của nhân viên
    public void statusDisplay(List<Employee> arr, String name){
        boolean WrongResult = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(name)) {
                System.out.println(arr.get(i).getStatus());
                WrongResult=true;
                break;
            }
        }
        if (WrongResult == false) {
            System.out.println("Không tìm thấy tên nhân viên đó.");
        }
    }

    //    Thay đổi trạng thái nhân viên
    public void changeStatus(List<Employee> arr, String name){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getName().equals(name)) {
                System.out.println("Nhập trạng thái mới: ");
                Scanner scanner = new Scanner(System.in);
                String newState = scanner.nextLine();
                arr.get(i).setStatus(newState);
            }
        }
    }

}