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
