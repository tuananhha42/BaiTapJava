package ex_10;

public class Test {
    public static void main(String[] args) {
        HocvienDH a = new HocvienDH("Lam","Bac Ninh", "Do hoa",2, 350000, 5);
        HocvienLT b = new HocvienLT("Duong","Vinh Phuc","Lap trinh", 1, 600000, 10);
        System.out.println(a.inThongTin());
        System.out.println(b.inThongTin());
    }
}
