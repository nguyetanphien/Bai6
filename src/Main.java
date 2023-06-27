import util.ManagerFunction;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Enter 1. Input employee or teacher \n" +
                    " 2. Show payroll list. \n" +
                    " 3. show person has highest salary. \n" +
                    " 4. show total salary must paid. \n" +
                    " 5. Exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ManagerFunction.input(scanner);
                    break;
                case 2:
                    ManagerFunction.show();
                    break;
                case 3:
                    ManagerFunction.getMaxSalary();
                case 4:
                    ManagerFunction.getTotalSalary();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}