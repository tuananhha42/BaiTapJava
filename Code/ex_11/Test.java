package ex_11;

public class Test {
    public static void main(String[] args) {
        GVCoHuu a = new GVCoHuu("Lam","Bac Ninh", "Giang vien co huu", 10, 350000);
        GVThinhGiang b = new GVThinhGiang("Duong", "Vinh Phuc", "Giang vien thinh giang", 3000000, 2, 5);
        System.out.println(a.inThongTin());
        System.out.println(b.inThongTin());
    }
}
