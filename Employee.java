abstract class Employee {
    protected String name;
    protected String afm;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String a) {
        this.afm = a;
    }

    abstract int payment();
}










//add HourlyEmploye

class HourlyEmployee extends Employee{
    private int hoursWorked;
    private int hourlyPayment;
    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hw) {
        hoursWorked = hw;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hp) {
        hourlyPayment = hp;
    }

    int payment(){
        return getHourlyPayment() * getHoursWorked();
    }
    
}
