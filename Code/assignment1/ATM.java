package assignment1;
import java.util.Scanner;

public class ATM {
    public void withdraw(Account ac) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can rut");
        int n;
        n = Integer.parseInt(scanner.nextLine());
        if (n > ac.getAmount()) {
            System.out.println("So tien rut khong hop le");
        } else {
            ac.setAmount(ac.getAmount() - n);
            System.out.println("So tien con lai sau khi rut:" + ac.getAmount());
        }
    }

    public void deposit(Account ac) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can gui");
        m = Integer.parseInt(scanner.nextLine());
        if (m > 0) {
            ac.setAmount(m + ac.getAmount());
            System.out.println("So tien sau khi ban gui:" + ac.getAmount());
        }
    }

    public void viewAmount(Account ac) {
        Scanner scanner = new Scanner(System.in);
        int m;
        System.out.println("Nhap so tien can xem");
        m = Integer.parseInt(scanner.nextLine());
    }

    public void transferMoney(Account acc1, Account acc2) {
        Scanner scanner = new Scanner(System.in);
        int m;
        System.out.println("Nhap so tien can chuyen");
        m = Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {
        SavingAccount hung = new SavingAccount();
        hung.setAccountNo("1100");
        hung.setOwnerName("Abc");
        hung.setAmount(10);
        hung.setAccountType("HHH");
        System.out.println("So tai khoan:" + hung.getAccountNo());
        System.out.println("Ten tai khoan:" + hung.getOwnerName());
        System.out.println("So tien ban dau:" + hung.getAmount());
        System.out.println("Loai tai khoan:" + hung.getAccountType());
        ATM hieu = new ATM();
        hieu.deposit(hung);
        hieu.withdraw(hung);
        hieu.viewAmount(hung);
    }


}



