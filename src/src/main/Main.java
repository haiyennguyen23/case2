package main;

import login.User;
import login.Usermanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Usermanager usermanager = new Usermanager();
       Scanner scannerX = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("1. ĐĂNG KÝ...");
                System.out.println("2. ĐĂNG NHẬP...");
                System.out.println("--------------------------");
                System.out.println("Mời bạn vui lòng chọn");
                int number = scannerX.nextInt();
                scannerX.nextLine();
                switch (number) {
                    case 1:
                        System.out.println("Mời bạn nhập tài khoản: ");
                        String tk = scannerX.nextLine();
                        System.out.println("Mời bạn nhập mật khẩu");
                        String mk = scannerX.nextLine();
                        Boolean tkLogin = usermanager.validateTk(tk);
                        Boolean mkLogin = usermanager.validateMk(mk);
                        if (tkLogin == true && mkLogin == true) {
                            usermanager.Register(tk, mk);
                            System.out.println("Chúc mừng Bạn đã đăng kí thành công");
                        } else {
                            System.out.println("Nhập không đúng định dạng");
                        }

                        break;
                    case 2:
                        System.out.println("Mời bạn nhập tài khoản: ");
                        String tk1 = scannerX.nextLine();
                        System.out.println("Mời bạn nhập mật khẩu: ");
                        String mk1 = scannerX.nextLine();
                        User user = usermanager.dangNhap(tk1, mk1);
                        if (user != null) {
                            System.out.println("Bạn đã đăng nhập thành công!!!!");
                        }
                        break;
                }
            }
        } finally {

        }
    }
}