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
                System.out.println("---Hệ thống đăng nhập---");
                System.out.println("1. ĐĂNG KÝ...");
                System.out.println("2. ĐĂNG NHẬP...");
                System.out.println("3. Thoát....");
                System.out.println("--------------------------");
                System.out.println("Mời bạn vui lòng chọn!!!!");
                int number = scannerX.nextInt();
                scannerX.nextLine();
                switch (number) {
                    case 1:
                        System.out.println("Mời bạn nhập tài khoản: ");
                        String account = scannerX.nextLine();
                        System.out.println("Mời bạn nhập mật khẩu");
                        String  passwork= scannerX.nextLine();
                            usermanager.Register(account, passwork);
                            System.out.println("Chúc mừng Bạn đã đăng kí thành công!!!!");
                        break;
                    case 2:
                        System.out.println("Mời bạn nhập tài khoản: ");
                        String account1 = scannerX.nextLine();
                        System.out.println("Mời bạn nhập mật khẩu: ");
                        String passWork1 = scannerX.nextLine();
                        User user = usermanager.Login(account1, passWork1);
                        Boolean accountLogin = usermanager.validateAccount(account1);
                        Boolean passWorkLogin = usermanager.validatePassWork(passWork1);
                        if (accountLogin==true&& passWorkLogin==true) {
                            System.out.println("Bạn đã đăng nhập thành công!!!!");
                        } else if (accountLogin == true && passWorkLogin == false) {
                            System.out.println("Vui lòng đăng nhập lại!!!");

                        } else if (accountLogin == false && passWorkLogin == true) {
                            System.out.println("Vui lòng đăng nhập lại!!!");
                        }
                        break;
                    case 3:
                        break;
                }
            }
        } finally {

        }
    }
}