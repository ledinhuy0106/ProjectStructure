package controller;

import java.util.Scanner;

import static service.AdminManagement.productManagerment;
import static service.ProductService.getAll;

public class Home {
    public static Scanner scanner = new Scanner(System.in);
    public static int choice;

    public static void main(String[] args) {

        String role;
        do {
            System.out.println("1.Đăng nhập");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                role = scanner.nextLine();
                if (role.equals("Admin")) {
                    admin();
                } else {
                    users();
                }
            }
            break;
        } while (true);
    }

    private static void users() {
        do {
            getAll();
            System.out.println("1. CartManagerment");
            System.out.println("2. BuysProduct");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManagerment();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            break;
        }while (true);
    }

    private static void admin() {
        do {
            System.out.println("1. ProductManagerment");
            System.out.println("2. UserManagerment");
            System.out.println("3. OderManagerment");
            System.out.println("4. CategoryManagerment");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManagerment();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            break;
        } while (true);
    }
}
