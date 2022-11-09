package ex_6;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;

    // constructor no paramter
    public PartTimeEmployee() {
        super();
    }

    // constructor parameter
    public PartTimeEmployee(String name, int age, char gioiTinh, String employeeName, String dateHired,int huorsPerWeek) {
        super(name, age, gioiTinh, employeeName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    // return hoursPerWeek
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    //	set hoursPerWeek
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //	override
    @Override
    public String toString() {
        return super.toString() + " hoursPerWeek: " + hoursPerWeek;
    }

}
