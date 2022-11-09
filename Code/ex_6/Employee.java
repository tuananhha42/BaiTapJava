package ex_6;

public class Employee extends Person{
    private String employeeName;
    private String dateHired;
    // constructor
    public Employee(){
        super();
    }
    // contructor parameter
    public Employee(String name, int age, char gioiTinh, String employeeName, String dateHired) {
        super(name, age, gioiTinh);
        this.employeeName = employeeName;
        this.dateHired = dateHired;
    }

    // return emloyeee
    public String getEmployeeName() {
        return employeeName;
    }

    //	set employee
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    //	return dateHired
    public String getDateHired() {
        return dateHired;
    }

    //	set dateHired
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    //	ovrride
    @Override
    public String toString() {
        return super.toString() + " employeeName: " + employeeName + " dateHired: " + dateHired;
    }

}
