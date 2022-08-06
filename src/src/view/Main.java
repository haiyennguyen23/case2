package main;

import login.User;
import login.Usermanager;
import manager.EmployeeManager;

import java.util.Scanner;

public class Main {
    static EmployeeManager object = new EmployeeManager();
    static{
        

    }
    public static void main(String[] args) {
        Usermanager usermanager = new Usermanager();
        Scanner scanner = new Scanner(System.in);
        try{
            while (true){
                System.out.println("-----MENU LOGIN-----");
                System.out.println("1.Đăng ký....");
                System.out.println("2.Đăng nhập....");
                System.out.println("------------------");
                System.out.println("Mời bạn vui lòng chọn chức năng: ");
                int number = scanner.nextInt();
                switch (number){
                    case 1:
                        System.out.println(" Nhập tài khoản: ");
                        String Account = scanner.nextLine();
                        System.out.println("Nhập mật khẩu: ");
                        String PassWork = scanner.nextLine();
                        Boolean AccountLogin = usermanager.validateAccount(Account);
                        Boolean PassWorkLogin = usermanager.validatePassWork(PassWork);
                        if (AccountLogin == true && PassWorkLogin == true){
                            usermanager.Login(Account,PassWork);
                            System.out.println("Chúc mừng bạn đã đăng kí tài khoản thành công!!!!");
                        }else{
                            System.out.println("Nhập không đúng định dạng, bạn vui lòng ddanhw ký lại!!!!");
                        }
                        break;
                    case 2:
                        System.out.println("Nhập tài khoản: ");
                        String Account1 = scanner.nextLine();
                        System.out.println("Nhập mật khẩu: ");
                        String PassWork1 = scanner.nextLine();
                        User usermanager1 = usermanager.Login(Account1,PassWork1);
                        if (usermanager !=null){
                            LoggedInSuccessfully();
                        }
                        break;
                }
            }
        }catch (Exception e){
            System.out.println("Tính năng bạn chọn chưa phát triển!!!!");
        }
    }
    private static void LoggedInSuccessfully(){
        while (true){
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
                System.out.println("Mời bạn vui lòng chức năng: ");
                int number = scanner.nextInt();
                switch (number){
                    // Hiển thị toàn bộ thông tin của toàn nhân viên có trong doanh nghiệp
                    case 1:
                        for (int i = 0; i < arr.size; i++) {
                            System.out.println(arr.get(i));
                            break;
                            //Lương tháng của nhân viên
                            case 2:
                                object.sumTotalSalary(arr);
                                break;
                            //Thêm nhân viên Fulltime
                            case 3:
                                object.addFullTime();
                                for (int i = 0; i < arr.size(); i++) {
                                    System.out.println(arr.get(i));
                                }
                                break;
                            //Thêm nhân viên Partime
                            case 4:
                                object.addPartTime();
                                for (int i = 0; i < arr.size(); i++) {
                                    System.out.println(arr.get(i));
                                }
                                break;
                            //Tìm kiếm thông tin nhân viên muốn tìm
                            case 5:
                                System.out.println("Mời bạn nhập tên nhân viên muốn tìm");
                                String name = scanner1.nextLine();
                                object.search(arr, name);
                                break;
                            //Kiểm tra trạng thái nhân viên muốn tìm
                            case 6:
                                System.out.println("Mời bạn nhập tên nhân viên muốn kiểm tra trạng thái: ");
                                String name1 = scanner1.nextLine();
                                object.statusDisplay(arr, name1);
                                break;
                            //Thay đổi trang thái làm việ của nhân viên
                            case 7:
                                System.out.println("Mời bạn nhập tên nhân viên muốn thay đổi trạng thái: ");
                                String name2 = scanner1.nextLine();
                                object.changeStatus(arr, name2);
                                // hiểm thị lại nhân viên đó
                                for (int i = 0; i < arr.size(); i++) {
                                    if (arr.get(i).getName().equals(name2)) {
                                        System.out.println(arr.get(i));
                                    }
                                }
                                break;
                            //Sửa thông tin nhân viên
                            case 8:
                                System.out.println("Mời bạn nhập tên nhân viên muốn sửa: ");
                                String name3 = scanner1.nextLine();
                                object.editInformation(arr, name3);
                                List<String> abc = new ArrayList<>();
                                for (int i = 0; i < arr.size(); i++) {
                                    abc.add(arr.get(i).getName());
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
                            // Sa thải nhân viên
                            case 9:
                                System.out.println("Mời bạn nhập tên nhân viên muốn sa thải: ");
                                String name4 = scanner1.nextLine();
                                object.deleteStaff(arr, name4);
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
                                return;
                            default:
                                System.out.println("Bạn đã nhập sai mời bạn vui lòng nhập lại");

                        }

                }
            }
        }
    }
}
