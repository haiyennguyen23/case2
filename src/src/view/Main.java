package view;

import login.User;
import login.Usermanager;
import manager.EmployeeManager;
import model.FulltimeEmployee;
import model.PartimeEmployee;
import model.Employee;
import storage.GhiFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     static EmployeeManager employeeManager = new EmployeeManager();

    public static List<User> userList = new ArrayList<>();
    static Employee employee = new Employee() {
        @Override
        public float totalSalary() {
            return 0;
        }

        @Override
        public void sumTotalSalary(List<Employee> arr) {

        }

        @Override
        public void addFulltimeEmployee() {

        }

        @Override
        public void addPartimeEmployee() {

        }

        @Override
        public void search(List<Employee> arr, String name) {

        }

        @Override
        public void statusDisplay(List<Employee> arr, String name1) {

        }

        @Override
        public void changeStatus(List<Employee> arr, String name2) {

        }
    };
    private static List<Employee> arr = Employee.arr;

    static {
//        Nhân viên full
        FulltimeEmployee nv1 = new FulltimeEmployee(1, "Nguyễn Thuỳ Ngân", "Nữ", 22, "Đang làm", 26, 2);
        FulltimeEmployee nv2 = new FulltimeEmployee(2, "Nguyễn Ngọc Thảo", "Nữ", 26, "Đang làm", 25, 1);
        FulltimeEmployee nv3 = new FulltimeEmployee(3, "Bùi Anh Quân", "Nam", 20, "Nghỉ phép", 24, 0);
        FulltimeEmployee nv4 = new FulltimeEmployee(4, "Trần Hoàng Dương", "Nam", 27, "Đang làm", 22, 1.5);
        FulltimeEmployee nv5 = new FulltimeEmployee(5, "Lê Phúc Lâm", "Nam", 26, "Đang làm", 25, 2);
        arr.add(nv1);
        arr.add(nv2);
        arr.add(nv3);
        arr.add(nv4);
        arr.add(nv5);

//    Nhân viên part
        PartimeEmployee nv6 = new PartimeEmployee(6, "Trần Ngọc Ánh Thư", "Nữ", 22, "Nghỉ phép", 180, 10);
        PartimeEmployee nv7 = new PartimeEmployee(7, "Nguyễn Thuỳ Chi", "Nữ", 20, "Đang làm", 85, 0);
        PartimeEmployee nv8 = new PartimeEmployee(8, "Bùi Tuấn Khang", "Nam", 21, "Đang làm", 92, 15);
        arr.add(nv6);
        arr.add(nv7);
        arr.add(nv8);
    }

    public static void main(String[] args) {

        Usermanager usermanager = new Usermanager();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("-----MENU LOGIN-----");
                System.out.println("1.Đăng ký....");
                System.out.println("2.Đăng nhập....");
                System.out.println("------------------");
                System.out.println("Mời bạn vui lòng chọn chức năng: ");
                int number = scanner.nextInt();
                scanner.nextLine();
                switch (number) {
                    case 1:
                        System.out.println("Nhập tài khoản: ");
                        String Account = scanner.nextLine();
                        System.out.println("Nhập mật khẩu: ");
                        String PassWork = scanner.nextLine();
                        User newUser = new User(Account,PassWork);
                        System.out.println("Chúc mừng bạn đã đăng kí tài khoản thành công!!!!");
                        userList.add(newUser);

//                        usermanager.Login(Account,PassWork);
//                        Boolean AccountLogin = usermanager.validateAccount(Account);
//                        Boolean PassWorkLogin = usermanager.validatePassWork(PassWork);
//                        if (AccountLogin == true && PassWorkLogin == true){
//

//                        }else{
//                            System.out.println("Nhập không đúng định dạng, bạn vui lòng đăng ký lại!!!!");
//                        }
                        break;
                    case 2:
                        System.out.println("Nhập tài khoản: ");
                        String account1 = scanner.nextLine();
                        System.out.println("Nhập mật khẩu: ");
                        String passWork1 = scanner.nextLine();
//                        for (User us: userList
//                             ) {
//                            System.out.println(us.getAccount());
//                            System.out.println(us.getPassword());
//                        }

                        boolean check = false;
                        for (int i = 0; i < userList.size(); i++) {
                            if (userList.get(i).getAccount().equals(account1)
                            && userList.get(i).getPassword().equals(passWork1)){
                                System.out.println("Đăng nhập thành công!!");
                                LoggedInSuccessfully();
                                check = true;
                            };
                        }
                        if (check){

                        }
                }
            }
        } catch (Exception e) {
            System.out.printf("Tính năng bạn chọn chưa phát triển");
        }


    }

    private static void LoggedInSuccessfully() {
        while (true) {
            System.out.println("QUẢN LÝ NHÂN VIÊN");
            System.out.println("-------------------");
            System.out.println("-------MENU--------");
            System.out.println("1. Thông tin toàn bộ nhân viên có trong doanh nghiệp");
            System.out.println("2. lương tháng của nhân viên");
            System.out.println("3. Thêm nhân viên fulltime");
            System.out.println("4. Thêm nhân viên Partime");
            System.out.println("5. Tìm kiếm thông tin nhân viên");
            System.out.println("6. Hiển thị trạng thái làm việc của nhân viên");
            System.out.println("7. Thay đổi trạng thái làm việc của nhân viên");
            System.out.println("8. Sửa thông tin của nhân viên");
            System.out.println("9. Đào thải nhân viên");
            System.out.println("10. Đọc File");
            System.out.println("11. Ghi File");
            System.out.println("12. Thoát khỏi chương trình");
            try {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Mời bạn chọn: ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 2:
                        employeeManager.sumTotalSalary(arr);
                        break;
                    case 3:
                        employeeManager.addFulltimeEmployee();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        employeeManager.addPartimeEmployee();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 4:
                        employeeManager.addPartimeEmployee();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 5:
                        System.out.println("Mời bạn nhập tên nhân viên muốn tìm");
                        String name = scanner1.nextLine();
                        employeeManager.search(arr, name);
                        break;
                    case 6:
                        System.out.println("Mời bạn nhập tên nhân viên muốn kiểm tra trạng thái: ");
                        String name1 = scanner1.nextLine();
                        employeeManager.statusDisplay(arr, name1);
                        break;
                    case 7:
                        System.out.println("Mời bạn nhập tên nhân viên muốn thay đổi trạng thái: ");
                        String name2 = scanner1.nextLine();
                        employeeManager.changeStatus(arr, name2);
//                    hiểm thị lại nhân viên đó
                        for (int i = 0; i < arr.size(); i++) {
                            if (arr.get(i).getName().equals(name2)) {
                                System.out.println(arr.get(i));
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Mời bạn nhập tên nhân viên muốn sửa: ");
                        String name3 = scanner1.nextLine();
                        employeeManager.editInformation(arr, name3);
                        List<String> abc = new ArrayList<>();
                        for (int i = 0; i < arr.size(); i++) {
                            abc.add((String) arr.get(i).getName());
                        }
                        if (abc.contains(name3)){
                            for (int i = 0; i < arr.size(); i++) {
                                if(arr.get(i).getName().equals(name3)) {
                                    System.out.println(arr.get(i));
                                }
                            }
                        } else {
                            System.out.println("KO có nhân viên này");
                        }
                        break;
                    case 9:
                        System.out.println("Mời bạn nhập tên nhân viên muốn đuổi việc: ");
                        String name4 = scanner1.nextLine();
                        employeeManager.deleteEmployee(arr, name4);
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 10:
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i).getName());
                        }
                        System.out.println("Chọn tên nhân viên muốn lưu: ");
                        String namex = scanner1.nextLine();
                        GhiFile obj = new GhiFile();
                        obj.outPut(arr, namex);
                        break;
                    case 11:
                        System.out.println("Dữ liệu trong file");
                        GhiFile obj1 = new GhiFile();
                        obj1.inPut();
                        break;
                    case 12:
                        System.out.printf("Thoát khỏi chương trình");
                        break;
                    default:
                        System.out.println("Bạn đã nhập sai mời bạn nhập lại");

                }
            } catch (Exception e) {
                System.err.println("Đề nghị bạn nhập đúng theo mẫu");
            }
        }
    }
}