package service;

import static controller.Home.choice;
import static controller.Home.scanner;
import static service.ProductService.*;
import static service.UserSevice.*;

public class AdminManagement {

    public static void productManagerment(){
        do {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
            }
        }while (true);
    }
    public static void userManagerment(){
        do {
            System.out.println("1.Thêm người");
            System.out.println("2.Khóa người dùng");
            System.out.println("3.Sửa người");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: addUser();
                    break;
                case 2:
                    updateUser();
                    break;
                case 3:
                    deleteUser();
                    break;
            }
        }while (true);
    }

}
